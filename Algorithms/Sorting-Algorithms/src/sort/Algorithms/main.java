package sort.Algorithms;

public class main {

    public static void main(String[] args) {
        Integer[] arr = {8, 3, 1, 9, 8, 2, 4, 7};
        SortADT sort = new QuickSort();
        sort.sort(arr);
        sort.printArray(arr);
    }
}
