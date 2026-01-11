package rearrangePositiveAndNegativeNoAlternately;

import java.util.ArrayList;

public class FourQuetionRearrangePositiveAndNegativeNoAlternately {
	public static void main(String[] args) {
		int arr[] = { 1, 3, 8, 4, -4, -1, -2, -2, 0, -5 };

		ArrayList<Integer> pos = new ArrayList<>();
		ArrayList<Integer> neg = new ArrayList<>();

		for (int num : arr) {
			if (num >= 0) 
				pos.add(num);
			else
				neg.add(num);
		}
		int i = 0, j = 0;
		int index = 0;
		
		while (i < pos.size() && j < neg.size()) {
			arr[index++] = pos.get(i++);
			arr[index++] = neg.get(j++);

		}
		for (int x : arr) {
			System.out.print(x+" ");
		}

	}

}
