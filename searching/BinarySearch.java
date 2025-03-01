package searching;

public class BinarySearch {
    public static void main(String[] args) {
        int[] sortedNums = { 3, 8, 13, 21, 33, 36, 39, 46, 49, 66, 666 };
        int result = find(sortedNums, 666);
        System.out.println(result);
    }

    public static int find(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target)
                return mid;
            else if (arr[mid] < target)
                left = mid + 1;
            else
                right = mid + 1;
        }

        return -1;
    }
}
