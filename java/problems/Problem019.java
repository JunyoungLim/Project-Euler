/**
 *
 */
package problems;

/**
 * Problem019.java
 * @author JunyoungLim
 *
 * @version 1.00
 * @since Dec 25, 2014
 */
public class Problem019 {

  public static void run() {
    int count = 0, day = 2; // modulus representation of days (modulo 7) : SMTWTFS == 0123456

    for (int y = 1901; y <= 2000; y++) // years
    {
      for (int m = 1; m <= 12; m++) // months
      {
        if (m == 4 || m == 6 || m == 9 || m == 11) {
          day += 30;
        } else if (m == 2) {
          if (isLeap(y)) {
            day += 29;
          } else {
            day += 28;
          }
        } else {
          day += 31;
        }

        day %= 7;
        if (day == 0) {
          count++; // if it is sunday
        }
      }
    }
    System.out.println(count);
  }

  public static boolean isLeap(int y) {
    if (y % 4 == 0) {
      if (y % 400 == 0) {
        return true;
      } else if (y % 100 == 0) {
        return false;
      }
      return true;
    }
    return false;
  }
}

// Answer is 171
// Execution time is. 796564 ms

