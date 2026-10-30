// LeetCode 1185. Day of the Week
// Complexity
// Time: O(year - 1971 + month)
// Space: O(1)

public class Day_of_the_Week {
    public static String dayOfTheWeek(int day, int month, int year) {

        String[] week = {
            "Sunday", "Monday", "Tuesday",
            "Wednesday", "Thursday", "Friday", "Saturday"
        };

        int[] days = {
            31, 28, 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31
        };

        int totalDays = 0;

        // Count days in previous years
        for (int i = 1971; i < year; i++) {
            if (isLeap(i)) {
                totalDays += 366;
            } else {
                totalDays += 365;
            }
        }

        // Adjust February for leap year
        if (isLeap(year)) {
            days[1] = 29;
        }

        // Count days in previous months
        for (int i = 0; i < month - 1; i++) {
            totalDays += days[i];
        }

        // Add current day
        totalDays += day;

        // January 1, 1971 was Friday (index 5)
        int index = (totalDays + 4) % 7;

        return week[index];
    }

    private static boolean isLeap(int year) {
        return (year % 400 == 0) ||
               (year % 4 == 0 && year % 100 != 0);
    }

    public static void main(String[] args) {
        int day = 31, month = 8, year = 2019;
        System.out.println(dayOfTheWeek(day, month, year));
    }
}
