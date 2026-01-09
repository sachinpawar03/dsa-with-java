package findTheSecondLargestNoInArray;

public class FourthQuetionfindTheSecondLargestNoInArray {
	public static void main(String[] args) {
		int arr[]= {1,3,5,6,2,9,0,10};
		
		int largest=arr[0];
		int secondlargest=arr[0];
		
		for( int i=0; i<arr.length; i++) {
			if(arr[i]>largest) {
				secondlargest=largest;
				largest=arr[i];
			}
			else if(arr[i]>secondlargest && arr[i]!=largest)
			{
				secondlargest=arr[i];
			}
		}
		System.out.print("Second Largest No: "+secondlargest);
		
}
}

