package runoob;

public class FindMaxN {
    //使用快速排序 寻找第N大的元素
    public static Comparable maxN(Comparable[] arr, int n) {
        assert(n < arr.length);

        int p = maxN(arr, 0, arr.length - 1, n);
        Comparable result = arr[p];
        return result;
    }

    private static int maxN(Comparable[] arr, int l, int r, int n) {
        if (l >= r) {
            return l;
        }
        int p = partition(arr,l ,r);
        if (r-p+1 == n) {
            return p;
        } else if (r-p+1 > n) {
            return maxN(arr, p+1, r, n);
        } else if (r-p+1 < n) {
            return maxN(arr, l, p-1, n-(r-p));
        }

        return 0;
        
    }
    private static int partition(Comparable[] arr, int l, int r) {
        int i = l + 1;
        int j = r;
        Comparable pValue = arr[l];

        while (true) {
            while (i <= r && arr[i].compareTo(pValue) <= 0) {
                i ++;
            }
            while (j >= l+1 && arr[j].compareTo(pValue) >= 0) {
                j --;
            }
            if (i > j) {
                break;
            }
            SortTestHelper.swap(arr, i, j);
            i ++;
            j --;
        }
        SortTestHelper.swap(arr, l, j);
        return j;
    }

    
    public static void main(String[] args) {
        Comparable[] arr = SortTestHelper.generateRandomArray(10, 0, 10);
        System.out.println(maxN(arr,2));
        SortTestHelper.printArray(arr);

    }
}
