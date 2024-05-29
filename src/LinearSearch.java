import java.util.ArrayList;
import java.util.List;

public class LinearSearch {
    static List<Integer> run (int[] list, int item) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < list.length; i++) {
            if (list[i] == item) {
                result.add(i);
            }
        }
        return result;
    }
}
