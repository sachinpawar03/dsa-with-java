package findTheUnionOfTwoArray;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class SecondQuetionForUnionOfTwoArray {
	public static void main(String[] args) {
		int arr1[]= {11,12,13,14};
		int arr2[]= {11,12,14,15,16};
		
		HashSet<Integer> set = new HashSet<>();
		LinkedHashSet<Integer> link =new LinkedHashSet<Integer>();
		
		for (int i=0; i<arr1.length; i++) {
			set.add(arr1[i]);
			link.add(arr1[i]);
		}
			for(int j=0; j<arr2.length; j++) {
				set.add(arr2[j]);
				link.add(arr2[j]);
			}
//			System.out.println("Union Of Two Array:"+set);
			System.out.print("Union Of Two Array:"+link);
		}
	} 
