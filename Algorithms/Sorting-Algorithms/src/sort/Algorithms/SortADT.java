package sort.Algorithms;

public abstract class SortADT<T extends Comparable<T>> {
    public abstract void sort(T[] array);
    public void swap(int i, int j, T[] array){
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    public static void printArray(Integer[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i].toString() + " ");
        }
    }

}
