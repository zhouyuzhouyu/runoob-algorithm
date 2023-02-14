package runoob;

public class InsertionSortM2 {
    public static void sort(Comparable[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j].compareTo(arr[j-1]) < 0) {
                    swap(arr,j,j-1);
                } else {
                    break;
                }
            }
        }
    }
    public static void sortShell(Comparable[] arr) {
        int n = arr.length;
        for (int k = n/2; k > 0; k = k/2) {
            for (int i = 0; i < n; i += 1) {
                for (int j = i; j-k >= 0; j -= k ) {
                    if (arr[j].compareTo(arr[j-k]) < 0) {
                        swap(arr, j, j-k);
                    } else {
                        break;
                    }
                }
            }
        }
    }

    public static void swap(Object[] arr, int i, int j) {
        Object t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    public static void main(String[] args) {
        Comparable[] arr = SortTestHelper.generateRandomArray(1000, 0, 1000);
        // InsertionSortM2.sort(arr);
        InsertionSortM2.sortShell(arr);
        SortTestHelper.printArray(arr);
        
    }
}
