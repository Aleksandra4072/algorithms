public class SelectionSort {
    static int[] run (int[] unsortedArray) {
        for (int i = 0; i < unsortedArray.length; i++) {
            int smallest_el_index = i;
            for (int j = i + 1; j < unsortedArray.length; j++) {
                if (unsortedArray[j] < unsortedArray[smallest_el_index]) {
                    smallest_el_index = j;
                }
            }
            int smallerNumber = unsortedArray[smallest_el_index];
            unsortedArray[smallest_el_index] = unsortedArray[i];
            unsortedArray[i] = smallerNumber;
        }
        return unsortedArray;
    }
}
