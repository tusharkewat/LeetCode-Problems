// LeetCode 492. Construct the Rectangle
// Complexity
// Time: O(√area)
// Space: O(1)

import java.util.Arrays;

public class Construct_the_Rectangle {
    public static int[] constructRectangle(int area) {

        for (int width = (int) Math.sqrt(area); width >= 1; width--) {

            if (area % width == 0) {
                int length = area / width;

                return new int[]{length, width};
            }
        }

        return new int[]{area, 1};
    }

    public static void main(String[] args) {
        int area = 122122;
        System.out.println(Arrays.toString(constructRectangle(area)));
    }
}
