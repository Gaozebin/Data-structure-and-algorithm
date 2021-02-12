package homeWork;

/**
 * 从数组尾部开始循环，进行选择排序
 */
public class FromTailSelectionSort {
    private FromTailSelectionSort() {
    }

    public static void sort(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            int maxIndex = i;
            for (int j = i; j >=  0; j--) {
                if (arr[j] > arr[maxIndex])
                    maxIndex = j;
            }
            swap(arr, i, maxIndex);
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int t = arr[j];
        arr[j] = arr[i];
        arr[i] = t;
    }

    public static void main(String[] args) {
        int[] arr = {2, 8, 3, 6, 1, 4, 5, 12};
        FromTailSelectionSort.sort(arr);
        for (int e : arr)
            System.out.print(e + " ");
        System.out.println();
    }
}
