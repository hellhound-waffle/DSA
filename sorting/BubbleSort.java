package sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int[] nums = { 8, 3, 9, 6, 4, 2, 1, 5, 7 };
        int size = nums.length;
        
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < (size - i) - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }

        for (int num : nums) {
            System.out.println(num);
        }
    }
}
