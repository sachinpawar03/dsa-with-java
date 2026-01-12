package findSmallestMissingPositiveNo;

public class ThirdQuestionFindSmallestMissingPositiveNo {
	public static int findSmallestMissingPositiveNo(int[] nums) {
		int n = nums.length;

		for (int i = 0; i < n; i++) {
			while (nums[i] > 0 && nums[i] <= n && nums[nums[i] - 1] != nums[i]) {
				int temp = nums[i];
				nums[i] = nums[temp - 1];
				nums[temp - 1] = temp;

			}
		}
		for (int i = 0; i < n; i++) {
			if (nums[i] != i + 1) {
				return i + 1;

			}
		}
		return n + 1;

	}
	public static void main(String[] args) {
		int arr[]= {1,7,4,2,5,2};
		System.out.println(findSmallestMissingPositiveNo(arr));
	}

}
