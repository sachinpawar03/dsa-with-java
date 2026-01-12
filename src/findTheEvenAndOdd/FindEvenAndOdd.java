package findTheEvenAndOdd;

public class FindEvenAndOdd{
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,9};

		 for (int i=0; i<arr.length; i++) {
			 int num =arr[i];
			 if(num % 2==0) {
				 System.out.println("Even No: "+num);
				 
			 }
			 else {
				 System.out.println("Odd No: "+num);
			 }
		 }
	}
	
}