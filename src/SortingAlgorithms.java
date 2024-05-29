public class SortingAlgorithms {
    public static int[] bubbleSort(int[] arr) {
        for(int i = arr.length - 1; i >= 0; i--) {
            for(int j = 0; j < i; j++) {
                if(arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j]= arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    public static int[] selectionSort(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            int smallestElIndex = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[smallestElIndex]) {
                    smallestElIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[smallestElIndex];
            arr[smallestElIndex] = temp;
        }
        return arr;
    }

    static int[] insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i - 1;
            while (j > 0 && temp < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
        return arr;
    }
}
