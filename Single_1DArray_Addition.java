public class Single_1DArray_Addition {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int[] runningSum = calculateRunningSum(nums);

        System.out.print("Original array: ");
        printArray(nums);
        System.out.print("Running sum array: ");
        printArray(runningSum);
    }

    public static int[] calculateRunningSum(int[] nums) {
        int[] runningSum = new int[nums.length];
        runningSum[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            runningSum[i] = runningSum[i - 1] + nums[i];
        }

        return runningSum;
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

