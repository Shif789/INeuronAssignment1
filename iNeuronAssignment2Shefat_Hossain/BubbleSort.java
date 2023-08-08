import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = { 7, 5, 2, 3, 1, 4, 6 };
        boolean swapped;
        do {
            swapped = false;
            int h = 0;
            for (int i = 0; i < arr.length - 1 - h; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;

                    swapped = true;
                }
            }
            if (h < arr.length)
                h++;
        } while (swapped == true);

        System.out.println(Arrays.toString(arr));

    }
}
