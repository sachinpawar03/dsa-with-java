package countPairWithGivenSum;

import java.util.HashMap;

public class FourthQuetionUsingHashMap {
	public static void main(String[] args) {
		int arr[] = { 6, 8, 4, 2, 9, -3, 2, 3, 7 };
		int target = 11;

		HashMap<Integer, Integer> map = new HashMap<>();
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			int need = target - arr[i];
			if (map.containsKey(need)) {
				count += map.get(need);
			}
			map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);

		}
		System.out.println("Total Pairs: " + count);

	}
}
