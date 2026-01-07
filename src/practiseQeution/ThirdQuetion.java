package practiseQeution;

public class ThirdQuetion {
	public static void main(String[] args) {

		int arr[] = { 33, 56, 32, 23, 56, 45, 87 };
		int max = arr[0];
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
			if (arr[i] < min) {
				min = arr[i];

			}
		}
		System.out.println("Maximum number: " + max);
		System.out.println("Minimum number: " + min);

	}
}
