package searching;

public class LinearSearch {
    public static void main(String[] args) {
        int[] sortedNums = { 3, 8, 13, 21, 33, 36, 39, 46, 49, 66, 666 };
        int result = find(sortedNums, 666);
        System.out.println(result);
    }

    public static int find(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target)
                return i;
        }

        return -1;
    }
}
