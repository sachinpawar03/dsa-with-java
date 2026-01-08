package rearrangePositiveAndNegativeNoAlternately;

import java.util.ArrayList;

public class rearrangePositiveAndNegativeNoAlternately {

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, -1, -3, -2};

        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();

        // Separate positives and negatives
        for (int num : arr) {
            if (num >= 0)
                pos.add(num);
            else
                neg.add(num);
        }

        int i = 0, j = 0;
        int index = 0;

        // Rearrange alternately
        while (i < pos.size() && j < neg.size()) {
            arr[index++] = pos.get(i++);
            arr[index++] = neg.get(j++);
        }

        // Print result
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
