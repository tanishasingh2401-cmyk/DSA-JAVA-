import java.util.*;

public class BasicSorting {

    // Bubble Sort (Descending)
    static void bubbleSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Selection Sort (Descending)
    static void selectionSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int max = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[max]) {
                    max = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[max];
            arr[max] = temp;
        }
    }

    // Insertion Sort (Descending)
    static void insertionSort(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] < key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    // Counting Sort (Descending)
    static void countingSort(int arr[]) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max)
                max = num;
        }

        int count[] = new int[max + 1];

        for (int num : arr)
            count[num]++;

        int index = 0;
        for (int i = max; i >= 0; i--) {
            while (count[i] > 0) {
                arr[index++] = i;
                count[i]--;
            }
        }
    }

    static void printArray(int arr[]) {
        for (int num : arr)
            System.out.print(num + " ");
        System.out.println();
    }

    public static void main(String[] args) {

        int original[] = {3, 6, 2, 1, 8, 7, 4, 5, 3, 1};

        int arr1[] = original.clone();
        bubbleSort(arr1);
        System.out.println("Bubble Sort (Descending):");
        printArray(arr1);

        int arr2[] = original.clone();
        selectionSort(arr2);
        System.out.println("Selection Sort (Descending):");
        printArray(arr2);

        int arr3[] = original.clone();
        insertionSort(arr3);
        System.out.println("Insertion Sort (Descending):");
        printArray(arr3);

        int arr4[] = original.clone();
        countingSort(arr4);
        System.out.println("Counting Sort (Descending):");
        printArray(arr4);
    }
}