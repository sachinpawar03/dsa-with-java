package findTheUnionOfTwoArray;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class ThirdQuetionForUnionOfTwoArray {
	public static void main(String[] args) {
		int arr1[]= {9,8,6,4,5,6,3,2,1};
		int arr2[]= {1,9,4,5,10,7};
		
		
		TreeSet<Integer> set = new TreeSet<Integer>();
		
		for (int i=0; i<arr1.length; i++) {

			set.add(arr1[i]);
		}
		
		for (int j=0; j<arr2.length; j++) {
;
			set.add(arr2[j]);
		}
		System.out.println(" "+set);
	}

}
