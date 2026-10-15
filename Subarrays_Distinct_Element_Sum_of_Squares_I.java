// LeetCode 2913. Subarrays Distinct Element Sum of Squares I
// Complexity
// Time: O(n²)
// Space: O(n)

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Subarrays_Distinct_Element_Sum_of_Squares_I {
    public static int sumCounts(List<Integer> nums) {
        
        int n = nums.size();
        int answer = 0;

        for (int i = 0; i < n; i++) {

            HashSet<Integer> set = new HashSet<>();

            for (int j = i; j < n; j++) {
                set.add(nums.get(j));

                int count = set.size();
                answer += count * count;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(1);

        System.out.println(sumCounts(list));
    }
}
