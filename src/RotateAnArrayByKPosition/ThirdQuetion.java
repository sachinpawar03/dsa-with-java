package RotateAnArrayByKPosition;

public class ThirdQuetion {
	public static void main(String[] args) {
		int arr[] = { 27, 21, 22, 23, 24, 25, 26 };
		int n = arr.length;
		int k = 3;
		k = k % n;

		for (int i = 0; i < k; i++) {
			int first = arr[0];
			
			for (int j =0; j < n-1; j++) {
				arr[j] = arr[j + 1];
			}
			arr[n-1] = first;
		}
		     for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + ",");
		}
	}

}
