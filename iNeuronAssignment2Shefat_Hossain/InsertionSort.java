import java.util.Arrays;

public class InsertionSort {

	public void sort(int[] nums) {
		for (int i = 1; i < nums.length; i++) {
			int numberToInsert = nums[i];
			int j = i - 1;
			while (j >= 0 && nums[j] > numberToInsert) {
				nums[j + 1] = nums[j];
				j--;
			}
			nums[j + 1] = numberToInsert;
		}
		System.out.println(Arrays.toString(nums));
	}
}
