package findTheMajorityElement;

public class ThirdMajorityElement {

	public static void main(String[] args) {
		int arr[]= {2,4,7,9,4,2,4,1,4,5,4,4,4};
		
		int candidate=arr[0];
		int cnt =1;
		
		for (int i=0; i<arr.length; i++) {
			if(cnt==arr[i]) {
				cnt++;
			}else {
				cnt--;
			}
			if(cnt==0) {
				candidate=arr[i];
				cnt=1;
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