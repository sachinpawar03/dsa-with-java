package findSmallestMissingPositiveNo;

public class SmallestMissingPositive {

    public static int findSmallestMissingPositive(int[] nums) {
        int n = nums.length;

        // Step 1: Place numbers in correct position
        for (int i = 0; i < n; i++) {
            while (nums[i] > 0 && nums[i] <= n && nums[nums[i] - 1] != nums[i]) {
                int temp = nums[i];
                nums[i] = nums[temp - 1];
                nums[temp - 1] = temp;
            }
        }

        // Step 2: Find missing number
        for (int i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }

        return n + 1;
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, -1, 1};
        System.out.println(findSmallestMissingPositive(arr)); // Output: 2
    }
}
