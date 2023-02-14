package runoob;

public class ShellSortM {
    public static void sort(Comparable[] arr) {
        int n = arr.length;
        for (int i = n/2; i > 0; i = i/2) {
            for (int j = 0; j < n; j++) {
                for (int k = j; k - i >= 0; k -= i) {
                    if (arr[k].compareTo(arr[k-i]) < 0) {
                        swap(arr, k, k-i);
                    } 
                    else {
                        break;
                    }
                }
            }
        }
    }
    public static void swap(Object[] arr, int i, int j) {
        Object t = arr[j];
        arr[j] = arr[i];
        arr[i] = t;
    }

    public static void main(String[] args) {
        Integer[] arr = SortTestHelper.generateRandomArray(10000, 0, 10000);
        ShellSortM.sort(arr);
        SortTestHelper.printArray(arr);
    }
}
