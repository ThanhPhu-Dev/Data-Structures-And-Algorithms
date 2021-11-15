package searchingAlgorithms;

public class main {
    public static void main(String[] args) {
        Integer[] array = {2, 3, 4, 10, 40};
        int element = 4;
        ISearch<Integer> search = new BinarySearch<>();
        BinarySearch<Integer> search2 = new BinarySearch<>();
        System.out.println("Vị trí phần tử có giá trị " + element + ": " + search.search(array, element));
        System.out.println("Vị trí phần tử có giá trị " + element + " (không đệ quy): " + search2.binarySearch2(array, element));
    }
}
