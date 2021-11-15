package sort.Algorithms;

public class ShellSort<T extends Comparable<T>> extends SortADT<T>{
    @Override
    public void sort(T[] array) {
        int indexCompare, indexValueOfh;
        T temp;
        int h = 1;//h luôn luôn > 0

        while (h <= array.length / 3) {
            h = h * 3 + 1;
        }

        while (h > 0) {
            for (indexValueOfh = h; indexValueOfh < array.length; indexValueOfh++) {
                temp = array[indexValueOfh];
                indexCompare = indexValueOfh;

                while (indexCompare > h - 1 && array[indexCompare - h].compareTo(temp) >=0) {
                    array[indexCompare] = array[indexCompare - h];
                    indexCompare -= h;
                }
                array[indexCompare] = temp;
            }
            h = (h - 1) / 3;
        }
    }
}
