package runoob;

public class QuickSortM {
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

    //单路
    public static int partition(Comparable[] arr, int l, int r) {
        Comparable p = arr[l];
        boolean rMove = true;
        while (l < r) {
            if (rMove) {
                if (arr[r].compareTo(arr[l]) < 0) {
                    swap(arr, l, r);
                    rMove = false;
                    l++;
                } else {
                    r--;
                }
            }  else {
                if (arr[l].compareTo(arr[r]) > 0) {
                    swap(arr, l, r);
                    rMove = true;
                    r--;
                } else {
                    l++;
                }
            }
        }
        return l;
    }

    public static void main(String[] args) {
        Comparable[] arr = SortTestHelper.generateRandomArray(1000, 0, 1000);
        // InsertionSortM2.sort(arr);
        sort(arr);
        SortTestHelper.printArray(arr);
    }
}
