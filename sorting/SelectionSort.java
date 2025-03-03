package sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int[] nums = { 8, 3, 9, 6, 4, 2, 1, 5, 7 };
        int size = nums.length;
        
        for (int i = 0; i < size - 1; i++) {
            int maxIndex = 0;
            
            for (int j = 1; j < size - i; j++) {
                if (nums[j] > nums[maxIndex]) {
                    maxIndex = j;
                }
            }

            int temp = nums[size - i - 1];
            nums[size - i - 1] = nums[maxIndex];
            nums[maxIndex] = temp;
        }

        for (int num : nums) {
            System.out.println(num);
        }
    }
}
