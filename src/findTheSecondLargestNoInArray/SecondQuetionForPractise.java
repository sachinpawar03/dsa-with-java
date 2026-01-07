package findTheSecondLargestNoInArray;

public class SecondQuetionForPractise {
	public static void main(String[] args) {
		int arr[]= {23,45,76,33,56,98,76,25};
		int largest=arr[0];
		int SecondLargest=arr[0];
		
		for (int i=1; i<arr.length; i++) {
			if(arr[i]>largest) {
				SecondLargest=largest;
				largest=arr[i];
			}
			else if(arr[i]>SecondLargest && arr[i]!=largest) {
				SecondLargest=arr[i];
				
			}
		}
		System.out.println("Second Largest No Is:"+SecondLargest);
		
	}

}
