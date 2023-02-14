package runoob;

public class InsertionSortM {
    public static void sort(Comparable[] arr) {
        int n = arr.length;
        for(int i=0; i<n; i++) {
            for(int j = i; j > 0; j--) {
                if(arr[j].compareTo(arr[j-1])<0) {
                    swap(arr, j, j-1);
                }
                else {
                    break;
                }
            }
        }
        
    }

    public static void swap(Object[] arr,int i, int j) {
        Object t = arr[j];
        arr[j] = arr[i];
        arr[i] = t;
    }

    public static void main(String[] args) {
        int N = 1000;
        Integer[] arr = SortTestHelper.generateRandomArray(N, 0,1000);
        InsertionSortM.sort(arr);
        SortTestHelper.printArray(arr);
    }
}
