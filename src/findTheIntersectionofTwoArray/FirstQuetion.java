package findTheIntersectionofTwoArray;

public class FirstQuetion {

	public static void main(String[] args) {
		int arr1[] = { 1, 2, 3, 4, 5, 6 };
		int arr2[] = { 3, 4, 5 };
		int n = arr1.length;
		int m = arr2.length;

		for (int i = 0; i < n; i++) {
			int cnt = arr1[i];

			for (int j = 0; j < m; j++) {
				int cnt2 = arr2[j];
				if (cnt == cnt2) {
					System.out.print(cnt+ " ");
					break;

				}
				
			}
			

		}

	}

}
