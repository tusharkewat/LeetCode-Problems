// LeetCode 1870. Minimum Speed to Arrive on Time\
// Complexity
// Time O(n)
// Space O(1)

public class Minimum_Speed_to_Arrive_on_Time {
    public static int minSpeedOnTime(int[] dist, double hour) {
        
        int minSpeed = 1;
        int maxSpeed = 10_000_000;

        while (minSpeed < maxSpeed) {
            
            int mid = minSpeed + (maxSpeed - minSpeed) / 2;

            double time = 0;

            for (int i = 0; i < dist.length - 1; i++) {

                time += Math.ceil((double) dist[i] / mid);

            }

            time += (double) dist[dist.length - 1] / mid;

            if (time <= hour) {

                maxSpeed = mid;

            } else {

                minSpeed = mid + 1;
                
            }
        }

        double time = 0;

        for (int i = 0; i < dist.length - 1; i++) {
            time += Math.ceil((double) dist[i] / minSpeed);
        }

        time += (double) dist[dist.length - 1] / minSpeed;

        if (time > hour) {
            return -1;
        }

        return minSpeed;
    }

    public static void main(String[] args) {
        int dist[] = {1,3,2};
        double hour = 2.7;
        System.out.println(minSpeedOnTime(dist, hour));
    }
}
