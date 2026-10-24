// LeetCode 2409. Count Days Spent Together
// Complexity
// Time: O(1)
// Space: O(1)

public class Count_Days_Spent_Together {
    public static int countDaysTogether(String arriveAlice, String leaveAlice,
            String arriveBob, String leaveBob) {

        int start = Math.max(
                convert(arriveAlice), convert(arriveBob));

        int end = Math.min(
                convert(leaveAlice), convert(leaveBob));

        return Math.max(0, end - start + 1);
    }

    private static int convert(String date) {
        int[] days = { 31, 28, 31, 30, 31, 30,
                31, 31, 30, 31, 30, 31 };

        int month = Integer.parseInt(date.substring(0, 2));
        int day = Integer.parseInt(date.substring(3, 5));

        for (int i = 0; i < month - 1; i++) {
            day += days[i];
        }

        return day;
    }

    public static void main(String[] args) {
        String arriveAlice = "08-15", leaveAlice = "08-18", arriveBob = "08-16", leaveBob = "08-19";
        System.out.println(countDaysTogether(arriveAlice, leaveAlice, arriveBob, leaveBob));
    }
}
