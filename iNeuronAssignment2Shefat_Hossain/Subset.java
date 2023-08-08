
public class Subset {

	public static void main(String[] args) {
		int count = 0;
		int[] original = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 23, 4, 5, 66 };
		int[] subset = { 100 };
		for (int i = 0; i < subset.length; i++) {
			for (int j = 0; j < original.length; j++) {
				if (subset[i] == original[j]) {
					count++;
					break;

				}
			}
		}

		if (count == subset.length) {
			System.out.println("The given array is an subset of the original array");
		} else {
			System.out.println("The given array is NOT an subset of the original array");
		}
	}

}
