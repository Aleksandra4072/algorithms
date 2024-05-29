# Grokking BinarySearch (by Aditya Y. Bhargava)
### Linear Search

Input: array, element;

Result: The indexes of the element if found or "Null" if not found;

Process: Look at every element to find the needed one;

### Binary Search

Input: Sorted array, element;

Result: The index of the element if found or "Null" if not found;

Process: Repeatedly dividing in half the portion of the list that could contain the item, until it's narrowed down to just one;

Run time: O(log2 n), where n is a number of elements in a list;

### Selection Sort

Input: Unsorted array;

Result: Sorted array;

Process: Repeatedly  selecting the smallest (or largest) element from the unsorted list and swaps it with the leftmost element of the unsorted portion;

Run time: O(n^2), where n is a number of elements in a list;