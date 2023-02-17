package runoob;

public class QuickSortM3 {
    public static void sort(Comparable[] arr) {
        sort(arr, 0, arr.length - 1);
    }

    private static void sort(Comparable[] arr, int l, int r) {
        if (l >= r) {
            return;
        }
        int p = partition(arr, l, r);
        sort(arr, l, p-1);
        sort(arr, p+1, r);
    }

    private static int partition(Comparable[] arr, int l, int r) {
        int i = l+1;
        int j = r;
        Comparable pValue = arr[l];
        while (true) {
            while (i <= r && arr[i].compareTo(pValue) <= 0) {
                i++;
            }
            while (j > l && arr[j].compareTo(pValue) >= 0) {
                j--;
            }
            if (i > j) {
                break;
            }
            SortTestHelper.swap(arr, i, j);
            i++;
            j--;
        }
        SortTestHelper.swap(arr, l, j);
        return j;
    }

    public static void main(String[] args) {
        Comparable[] arr = SortTestHelper.generateRandomArray(10, 0, 1000);
        // InsertionSortM2.sort(arr);
        sort(arr);
        SortTestHelper.printArray(arr);
    }


    
}
