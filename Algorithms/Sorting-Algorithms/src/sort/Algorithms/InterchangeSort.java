package sort.Algorithms;

public class InterchangeSort<T extends Comparable<T>> extends SortADT<T>{
    @Override
    public void sort(T[] array) {
        for(int i=0;i<array.length;i++){
            for (int j=i+1;j<array.length;j++){
                if(array[i].compareTo(array[j]) > 0){
                    swap(i,j,array);
                }
            }
        }
    }
}
