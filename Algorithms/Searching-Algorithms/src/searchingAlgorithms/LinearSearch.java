package searchingAlgorithms;

public class LinearSearch<T extends Comparable<T>> implements ISearch<T>{
    @Override
    public int search(T[] array, T element) {
        for(int i=0;i<array.length;i++){
            if(array[i].compareTo(element) == 0){
                return i;
            }
        }
        return -1;
    }
}
