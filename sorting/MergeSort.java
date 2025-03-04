package sorting;

public class MergeSort {

    public static void merge(int[] arr, int left, int mid, int right) {
        int sizeLeft = mid - left + 1;
        int sizeRight = right - mid;

        int[] l = new int[sizeLeft];
        int[] r = new int[sizeRight];

        for (int i = 0; i < l.length; i++) {
            l[i] = arr[left + i];
        }

        for (int i = 0; i < r.length; i++) {
            r[i] = arr[mid + i + 1];
        }

        int i = 0;
        int j = 0;
        int k = left;

        while (i < sizeLeft && j < sizeRight) {
            if (l[i] < r[j]) {
                arr[k] = l[i];
                i++;
            } else {
                arr[k] = r[j];
                j++;
            }
            k++;
        }
        
        while (i < sizeLeft) {
            arr[k] = l[i];
            i++;
            k++;
        }
        while (i < sizeRight) {
            arr[k] = l[j];
            j++;
            k++;
        }


    }

    public static void sort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            sort(arr, left, mid);
            sort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }

    }

    public static void main(String[] args) {
        int[] nums = { 6, 4, 2, 3, 5, 1 };
        
        sort(nums, 0, nums.length - 1);

        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
