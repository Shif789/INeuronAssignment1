import java.util.Arrays;

public class SelectionSort {

	public void sort(int[] arr) {
		int min;
		boolean swapped;
		for (int i = 0; i < arr.length - 1; i++) {
			min = i;
			swapped = false;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[min]) {
					min = j;
					swapped = true;
				}
			}
			if (swapped) {
				int temp = arr[i];
				arr[i] = arr[min];
				arr[min] = temp;
			}

		}
		System.out.println(Arrays.toString(arr));
	}
}
