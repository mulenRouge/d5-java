
/*еализовать алгоритм сортировки слиянием
*/
public class D1 {
    public static void main(String[] args) {
        int[] array = new int[] { 7, 2, 4, 3, 6, 5, 1 };
        int length = array.length;
        printArray(array);
        System.out.println("\n");
        mergeSort(array, length);
        printArray(array);
    }

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }

    static void mergeSort(int[] arr, int len) {
        if (len < 2) {
            return;
        }
        int mid = len / 2;
        int[] leftArr = new int[mid];
        int[] rightArr = new int[len - mid];

        for (int i = 0; i < mid; i++) {
            leftArr[i] = arr[i];
        }
        for (int i = mid; i < len; i++) {
            rightArr[i - mid] = arr[i];
        }
        mergeSort(leftArr, mid);
        mergeSort(rightArr, len - mid);
        merge(arr, leftArr, rightArr, mid, len - mid);
    }

    static void merge(int[] arr, int[] leftArray, int[] rightArray, int leftLength, int rightLength) {
        int i = 0, j = 0, k = 0;
        while (i < leftLength && j < rightLength) {
            if (leftArray[i] <= rightArray[j]) {
                arr[k++] = leftArray[i++];
            } else {
                arr[k++] = rightArray[j++];
            }
        }
        while (i < leftLength) {
            arr[k++] = leftArray[i++];
        }
        while (j < rightLength) {
            arr[k++] = rightArray[j++];
        }
    }
}