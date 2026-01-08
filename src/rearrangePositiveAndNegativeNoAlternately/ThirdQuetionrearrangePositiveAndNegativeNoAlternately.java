package rearrangePositiveAndNegativeNoAlternately;

import java.util.ArrayList;

public class ThirdQuetionrearrangePositiveAndNegativeNoAlternately {
	public static void main(String[] args) {
		int arr[]= {-1,3,7,-2,-5,4,-5,3,5,-7,6};
		
		ArrayList<Integer> pos = new ArrayList<Integer>();
		ArrayList<Integer> neg = new ArrayList<Integer>();
		
		for (int num : arr) {
			if(num>=0)
				pos.add(num);
			else
				neg.add(num);
		
		
	}
	int i=0, j=0; 
	int index=0;
	
	while(i < pos.size() && j < neg.size()) {
		arr[index++]= pos.get(i++);
		arr[index++]= neg.get(j++);
		
	}
	for (int x : arr) {
		System.out.print(x+" ");
	}

}
}
	
