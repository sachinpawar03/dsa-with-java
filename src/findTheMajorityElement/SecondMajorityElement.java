package findTheMajorityElement;

public class SecondMajorityElement {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 1, 2, 1, 1, 2, 1 ,1 ,1};

		int candidate = arr[0];
		int cnt = 1;

		for (int i = 1; i < arr.length; i++) {
			
			if (arr[i] == candidate) {
				cnt++;
			} else {
				cnt--;

			}
			if (cnt == 0) {
				candidate = arr[i];
				cnt = 1;
			}

		}
		int frq = 0;
		for (int num : arr) {
			if (num == candidate) {
				frq++;
			}
		}
		if (frq > arr.length / 2) {
			System.out.println("Majority Element: " + candidate);
		} else {
			System.out.println("No Majority Element");
		}

	}
}
