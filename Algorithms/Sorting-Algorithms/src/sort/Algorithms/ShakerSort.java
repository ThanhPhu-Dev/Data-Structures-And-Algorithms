package sort.Algorithms;

public class ShakerSort<T extends Comparable<T>> extends SortADT<T>{
    @Override
    public void sort(T[] array) {
        int left = 0;
        int right = array.length - 1;
        int k = 0;
        while (left < right){
            for(int i=left;i<right;i++){
                if(array[i].compareTo(array[i+1]) > 0){
                    swap(i,i+1,array);
                    k=i;
                }
            }
            right = k;
            for(int i=right;i>left;i--){
                if(array[i].compareTo(array[i-1]) < 0){
                    swap(i,i-1,array);
                    k=i;
                }
            }
            left=k;
        }
    }
}
