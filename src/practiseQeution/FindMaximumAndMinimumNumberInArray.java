
package practiseQeution;

public class FindMaximumAndMinimumNumberInArray {

	public static void main(String[] args) {

		int[] arr = { 100, 2, 4, 67, 8, 1 };

		// Step 1: Assume first element is both max and min
		int max =arr[0];
		int min =arr[0];
		for(int i=1; i<arr.length; i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			if(arr[i]<min) {
				min=arr[i];
			}
			
		}

		// Step 5: Print results
		System.out.println("Maximum number: " + max);
		System.out.println("Minimum number: " + min);
	}
}
