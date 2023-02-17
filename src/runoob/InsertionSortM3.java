package runoob;

public class InsertionSortM3 {
    public static void sort(Comparable[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j].compareTo(arr[j-1]) < 0) {
                    SortTestHelper.swap(arr, j , j-1);
                } else {
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        Integer[] arr = SortTestHelper.generateRandomArray(1000, 0, 1000);
        sort(arr);
        SortTestHelper.printArray(arr);
    }
}
