package sorting;

public class QuickSort {

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j <= high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = pivot;
        arr[high] = temp;
        

        return i + 1;
    }

    public static void sort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);

            sort(arr, low, pi - 1);
            sort(arr, pi + 1, high);
        }
    }

    public static void main(String[] args) {
        int[] nums = { 4, 2, 5, 3, 1 };

        sort(nums, 0, nums.length - 1);

        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
