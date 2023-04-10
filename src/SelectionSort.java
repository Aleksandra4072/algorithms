public class SelectionSort {
    static int[] run (int[] unsortedArray) {
        for (int i = 0; i < unsortedArray.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < unsortedArray.length; j++) {
                if (unsortedArray[j] < unsortedArray[index]) {
                    index = j;
                }
            }
            int smallerNumber = unsortedArray[index];
            unsortedArray[index] = unsortedArray[i];
            unsortedArray[i] = smallerNumber;
        }
        return unsortedArray;
    }
}
