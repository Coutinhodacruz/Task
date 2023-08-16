package task;

public class MaximumSublist {

    public static int maxSubarraySum(int[] array) {
        int maxSum = array[0];
        int currentSum = array[0];

        for (int i = 1; i < array.length; i++) {
            currentSum = Math.max(array[i], currentSum + array[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {-4, 2, -5, 1, 2, 3, 6, -5, 1};
        int maxSum = maxSubarraySum(arr);
        System.out.println("Maximum sum: " + maxSum);

    }

}
