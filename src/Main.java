public class Main {
    public static void main(String[] args) {
        int[] unsortedList = {22, 55, 99, 4, 6, 105, 98};
        for (int element : SelectionSort.run(unsortedList)) {
            System.out.println(element);
        }
        System.out.println(BinarySearch.run(SelectionSort.run(unsortedList), 44));
        System.out.println(BinarySearch.run(SelectionSort.run(unsortedList), 55));


    }
}