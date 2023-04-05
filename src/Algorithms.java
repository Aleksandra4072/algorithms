public class Algorithms {
    static Integer binarySearch (int[] list, int item) {
        int low = 0;
        int high = list.length - 1;
        while (low <= high) {
            int middle = (low + high) / 2;
            if (item == list[middle]) {
                return middle;
            }
            if (item < list[middle]) {
                high = middle - 1;
            }
            if (item > list[middle]) {
                low = middle + 1;
            }
        }
        return null;
    }
}
