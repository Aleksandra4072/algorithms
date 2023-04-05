public class Main {
    public static void main(String[] args) {
        int[] list1 = {1, 6, 8, 10, 15, 22, 35, 44, 59, 63, 78};
        int item = 44;
        System.out.println(Algorithms.binarySearch(list1, item));
        int[] list2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        item = 5;
        System.out.println(Algorithms.binarySearch(list2, item));
        item = 55;
        System.out.println(Algorithms.binarySearch(list2, item));
    }
}