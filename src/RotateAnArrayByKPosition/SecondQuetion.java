package RotateAnArrayByKPosition;

public class SecondQuetion {
	public static void main(String[] args) {
		int arr[] = { 11, 12, 13, 14, 15, 16, 17 };
		int n = arr.length;
		int k = 2;
		k = k % n;
		for (int i = 0; i < k; i++) {
			int last=arr[n-1];
			
		for (int j=n-1; j>0; j--) {
			arr[j]=arr[j-1];
		}
		arr[0]=last;
		}
		for(int i=0; i<n; i++) {
		System.out.print(arr[i]+",");
		}
	}
}
