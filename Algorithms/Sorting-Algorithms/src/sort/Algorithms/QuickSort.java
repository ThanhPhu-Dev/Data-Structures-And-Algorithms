package sort.Algorithms;

public class QuickSort<T extends Comparable<T>> extends SortADT<T> {

    private int partition(T[] array, int low, int high) {
        T pivot = array[high];
        int indexOfLowerValue = low ;//index của value nhỏ hơn pivot
        //j là index của value lớn hơn pivot
        for (int indexOfHigherValue = low; indexOfHigherValue < high; indexOfHigherValue++) {
            //nếu giá trị vị trí j nhỏ hơn hoặc bằng pivot thì hoán vị với i
            if (array[indexOfHigherValue].compareTo(pivot) <= 0) {
                swap(indexOfLowerValue++, indexOfHigherValue, array);
            }
        }
        swap(indexOfLowerValue , high, array);
        return indexOfLowerValue;
    }

    private void sort(T[] array, int low, int high) {
        if (low < high) {
            int pi = partition(array, low, high);
            sort(array, low, pi - 1);
            sort(array, pi + 1, high);
        }
    }

    @Override
    public void sort(T[] array) {
        sort(array, 0, array.length -1);
    }
}
