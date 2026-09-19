// LeetCode 1401. Circle and Rectangle Overlapping
// Complexity
// Time: O(1)
// Space: O(1)

public class Circle_and_Rectangle_Overlapping {
    public static boolean checkOverlap(int radius, int xCenter, int yCenter, int x1, int y1, int x2, int y2) {

        int closestX = Math.max(x1, Math.min(xCenter, x2));
        int closestY = Math.max(y1, Math.min(yCenter, y2));

        int dx = xCenter - closestX;
        int dy = yCenter - closestY;

        int distanceSquared = dx * dx + dy * dy;

        return distanceSquared <= radius * radius;
    }

    public static void main(String[] args) {
        int radius = 1, xCenter = 0, yCenter = 0, x1 = 1, y1 = -1, x2 = 3, y2 = 1;
        System.out.println(checkOverlap(radius, xCenter, yCenter, x1, y1, x2, y2));
    }
}
