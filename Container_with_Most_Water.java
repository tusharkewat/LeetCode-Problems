public class Container_with_Most_Water {
    public static int maxArea(int[] arr) {
        int i = 0;
        int j = arr.length - 1;
        int maxArea = 0;
        while ( i < j) {
             int h = Math.min(arr[i],arr[j]);
             int width = (j - i);
             int area = h * width;

             maxArea = Math.max( maxArea, area);
             if(arr[i] < arr[j]){
                i++;
             } else {
                j--;
             }
        }
        return maxArea;
    }
    public static void main(String[] args) {
        int arr[] = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(arr));
    }
}
