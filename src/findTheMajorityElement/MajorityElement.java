package findTheMajorityElement;
public class MajorityElement {

    public static void main(String[] args) {

        int[] arr = {2, 2, 1, 2, 3, 2, 2};

        // Step 1: Find candidate
        int candidate = arr[0];
        int count = 1;

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] == candidate) {
                count++;
            } else {
                count--;
            }

            if (count == 0) {
                candidate = arr[i];
                count = 1;
            }
        }

        // Step 2: Verify candidate
        int freq = 0;
        for (int num : arr) {
            if (num == candidate) {
                freq++;
            }
        }

        if (freq > arr.length / 2) {
            System.out.println("Majority Element: " + candidate);
        } else {
            System.out.println("No Majority Element");
        }
    }
}