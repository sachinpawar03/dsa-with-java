package findTheIntersectionofTwoArray;

public class ThirdQuetion {
	public static void main(String[] args) {
		int arr1[]= {23,45,89,456,787,23};
		int arr2[]= {23,456};
		int n=arr1.length;
		int m=arr2.length;
		
		for(int i=0; i<n; i++) {
			int cnt1=arr1[i];
			
			for (int j=0; j<m; j++) {
				int cnt2=arr2[j];
				if(cnt1==cnt2) {
					System.out.print(cnt1+" ");
				}
			}
		}
	}

}
