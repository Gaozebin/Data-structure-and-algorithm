package homeWork;

/**
 * 非原地排序
 */
public class SelectSort {
    public static int[] selectSort(int[] data) {
        int[] arr = new int[data.length];
        for (int k = 0; k < data.length; k++) {
            int min = data[k];
            int minIndex = k;
            for (int i = k; i < data.length; i++) {
                if (data[i] < min) {
                    min = data[i];
                    minIndex = i;
                }
            }
            int temp = data[k];
            data[k] = data[minIndex];
            data[minIndex] = temp;
            arr[k] = min;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] data = {2, 8, 7, 4, 9, 45, 89, 56, 100, 23, 54};
        int[] arr1 = SelectSort.selectSort(data);
        for (int i = 0; i < arr1.length; i++) {
            if (i == 0) {
                System.out.print("[" + arr1[i] + ",");
            } else if (i == arr1.length - 1) {
                System.out.print(arr1[i] + "]");
            } else {
                System.out.print(arr1[i] + ",");
            }
        }
    }
}
