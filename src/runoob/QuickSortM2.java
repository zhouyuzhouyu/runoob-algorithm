package runoob;

public class QuickSortM2 {
    public static void sort(Comparable[] arr) {
        int n = arr.length;
        sort(arr, 0, n-1);
    }

    private static void sort(Comparable[] arr, int l, int r) {
        if (l >= r) {
            return;
        }
        int p = partition(arr, l, r);
        sort(arr,l, p-1);
        sort(arr,p+1,r);
    }

    private static void swap(Object[] arr, int i, int j) {
        Object t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    //双路
    public static int partition(Comparable[] arr, int l, int r) {
        Comparable p = arr[l];
        int i = l + 1, j = r;
        while (true) {
            while (i <= r && arr[i].compareTo(p) < 0) {
                i++;
            } 
            while (j >= l+1 && arr[j].compareTo(p) > 0) {
                j--;
            }
            if (i > j) {
                break;
            }
            swap(arr, i, j);
            i++;
            j--;

        }
        swap(arr, l, j);
        return j;
    }

    public static void main(String[] args) {
        Comparable[] arr = SortTestHelper.generateRandomArray(1000, 0, 1000);
        // InsertionSortM2.sort(arr);
        sort(arr);
        SortTestHelper.printArray(arr);
    }
}
