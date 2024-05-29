public class BinarySearch {
    static int run (int[] sortedList, int item) {
        int low = 0;
        int high = sortedList.length - 1;
        while (low <= high) {
            int middle = (low + high) / 2;
            if (item == sortedList[middle]) {
                return middle;
            } else if (item < sortedList[middle]) {
                high = middle - 1;
            } else {
                low = middle + 1;
            }
        }
        return -1;
    }
}
