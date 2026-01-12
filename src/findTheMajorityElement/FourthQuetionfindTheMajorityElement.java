package findTheMajorityElement;

public class FourthQuetionfindTheMajorityElement {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 4, 5, 4, 3, 7, 4, 7, 4 };

		int candidate = arr[0];
		int count = 1;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] == candidate) {
				count++;
			} else {
				count--;
			}
			if (count == 0) {
				candidate = arr[i];
				count = 1;
			}
		}
			int freq=0;
			for (int num : arr) {
				if (num == candidate) {
					freq++;
				}

			}
			if (freq > arr.length / 2) {
				System.out.println("Majority Element:" + candidate);
			} else {
				System.out.println("No Majority Element:");
			}
		}
	}

