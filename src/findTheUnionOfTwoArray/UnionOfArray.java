package findTheUnionOfTwoArray;

import java.util.HashSet;

public class UnionOfArray {
	public static void main(String[] args) {

		int arr1[] = { 1, 2, 3, 4, 5 };
		int arr2[] = { 3, 4, 5, 6 };
		
		HashSet<Integer> set = new HashSet<Integer>();
		
		for(int i=0; i<arr1.length; i++) {
			set.add(arr1[i]);
		}
		for (int j=0; j<arr2.length; j++) {
			set.add(arr2[j]);
		}
		System.out.println(" "+set);

	}
}
