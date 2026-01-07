package findTheSecondLargestNoInArray;

public class FindTheSecondLargestNoInArray {
	public static void main(String[] args) {

		int arr[] = { 13, 56, 9, 76, 45, 54, 32 };
		int largest = arr[0];
		int SecondLargest = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > largest) {
				SecondLargest = largest;
				largest = arr[i];
			} else if (arr[i] > SecondLargest && arr[i] != largest) {
				SecondLargest = arr[i];
			}

		}
		System.out.println("second lagest=" + SecondLargest);
	}
}
