package findSubarrayOfGivenSum;

public class ThirdQuetionFindSubarrayOfGivenSum {
	public static void main(String[] args) {
		int arr[] = { 10, 21, 9, 3, 9, 56 };
		int sum = 12;

		for (int i = 0; i < arr.length; i++) {
			int currentSum = 0;
			for (int j = i; j < arr.length; j++) {
				currentSum += arr[j];
				if (currentSum == sum) {
					for (int k = i; k <= j; k++) {
						System.out.print(" " + arr[k]);
					}
					return;
				}
			}

		}
		System.out.println("No Subarray");
	}

}
