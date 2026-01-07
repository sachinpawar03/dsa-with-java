package findTheSecondLargestNoInArray;

public class ThirdQuetionForPractise {
	public static void main(String[] args) {
		int arr[]= {12,56,78,90,76,78,54,36,67,4};
		int largest =arr[0];
		int secondLargest=arr[0];
		
		for (int i=1; i<arr.length; i++) {
			if(arr[i] > largest) {
				secondLargest=largest;
				largest=arr[i];
				
			}
			else if(arr[i]>secondLargest && arr[i] != largest) {
				secondLargest=arr[i];
			}
		}
		System.out.println("Second Largest No Is:"+secondLargest);
	}

}
