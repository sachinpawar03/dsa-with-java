package findSubarrayOfGivenSum;

public class SecondQuestionFindSubarrayOfGivenSum {

	public static void main(String[] args) {
		int arr[] = { 1, 3, 5, 4, 0, 7 };
		int sum = 8;

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
		System.out.println("No Subbarray Element");

	}

}
