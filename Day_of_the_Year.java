// LeetCode 1154. Day of the Year
// Complexity
// Time: O(1)
// Space: O(1)

public class Day_of_the_Year {
    public static int dayOfYear(String date) {
        int year = Integer.parseInt(date.substring(0, 4));
        int month = Integer.parseInt(date.substring(5, 7));
        int day = Integer.parseInt(date.substring(8, 10));

        int[] days = {
            31, 28, 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31
        };

        // Check for leap year
        if ((year % 400 == 0) ||
            (year % 4 == 0 && year % 100 != 0)) {
            days[1] = 29;
        }

        int result = day;

        // Add days from previous months
        for (int i = 0; i < month - 1; i++) {
            result += days[i];
        }

        return result;
    }

    public static void main(String[] args) {
        String date = "2019-01-09";
        System.out.println(dayOfYear(date));
    }
}
