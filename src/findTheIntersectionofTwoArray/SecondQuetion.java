package findTheIntersectionofTwoArray;

public class SecondQuetion {
	public static void main(String[] args) {
		int arr1[]= {10,11,12,13,14,15};
		int arr2[]= {12,1,11};
		int n=arr1.length;
		int m=arr2.length;
		
		for(int i=0; i<n; i++) {
			int cnt1=arr1[i];
			
			for(int j=0; j<m; j++) {
				int cnt2=arr2[j];
				if(cnt1==cnt2) {
					System.out.println(cnt1+" ");
				}
			}
			
		}
	}

}
