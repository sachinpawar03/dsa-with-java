package findSubarrayOfGivenSum;

public class findSubarrayOfGivenSum {
	public static void main(String[] args) {

		int arr[] = { 1, 4, 20, 3, 10, 5 };
		int sum = 33;

		for (int i = 0; i < arr.length; i++) {
			int currentSum = 0;

			for (int j = i; j < arr.length; j++) {
				currentSum += arr[j];

				if (currentSum == sum) {
					for (int k = i; k <= j; k++) {
						System.out.print(arr[k]+" ");
					}
					return;
				}
			}
		}

			System.out.println("No subarray found");
		}
	}
