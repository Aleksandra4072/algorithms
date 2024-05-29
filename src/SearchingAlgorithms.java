import java.util.ArrayList;
import java.util.List;

public class SearchingAlgorithms {
    static List<Integer> linearSearch(int[] arr, int target) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target) {
                result.add(i);
            }
        }
        return result;
    }

    static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        while(low < high) {
            int mid = high / 2;
            if(arr[mid] == target) {
                return mid;
            } else if(target > arr[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}
