// LeetCode 3280. Convert Date to Binary
// Complexity
// Time: O(1)
// Space: O(1)

public class Convert_Date_to_Binary {
    public static String convertDateToBinary(String date) {

        String[] parts = date.split("-");

        int year = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int day = Integer.parseInt(parts[2]);

        String y = Integer.toBinaryString(year);
        String m = Integer.toBinaryString(month);
        String d = Integer.toBinaryString(day);

        return y + "-" + m + "-" + d;
    }

    public static void main(String[] args) {
        String date = "2080-02-29";
        System.out.println(convertDateToBinary(date));
    }
}
