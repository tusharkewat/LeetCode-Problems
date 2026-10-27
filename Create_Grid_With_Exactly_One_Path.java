// LeetCode 3963. Create Grid With Exactly One Path
// Complexity
// Time: O(m * n)
// Space: O(m * n)

import java.util.Arrays;

public class Create_Grid_With_Exactly_One_Path {
   public static String[] createGrid(int m, int n) {
        char[][] grid = new char[m][n];

        // Fill the entire grid with obstacles
        for (int i = 0; i < m; i++) {
            Arrays.fill(grid[i], '#');
        }

        // Open every cell in the first row
        Arrays.fill(grid[0], '.');

        // Open every cell in the last column
        for (int i = 0; i < m; i++) {
            grid[i][n - 1] = '.';
        }

        // Convert each row into a String
        String[] result = new String[m];

        for (int i = 0; i < m; i++) {
            result[i] = new String(grid[i]);
        }

        return result;
    } 

    public static void main(String[] args) {
        int m = 3, n = 3;
        System.out.println(Arrays.toString(createGrid(m, n)));
    }
}
