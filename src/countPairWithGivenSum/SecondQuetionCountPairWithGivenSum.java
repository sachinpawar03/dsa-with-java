package countPairWithGivenSum;

public class SecondQuetionCountPairWithGivenSum {
	public static void main(String[] args) {
		int arr[]= {1,4,6,9,3,7,2,6};
		int target = 8;
		int count=0;
		
		for (int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if (arr[i]+arr[j]==target) {
					count++;
				}
			}
		}
		System.out.println("Total Pairs: "+count);
	} 

}
