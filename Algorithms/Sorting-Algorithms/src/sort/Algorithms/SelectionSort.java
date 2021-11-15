package sort.Algorithms;

public class SelectionSort<T extends Comparable<T>> extends SortADT<T>{

    /**
     * độ phức tạp O(2n)
     * tìm giá trị nhỏ nhất rồi hoán vị với vị trí đầu
     * @param array
     */
    @Override
    public void sort(T[] array) {
        int minIndex;
        for(int i=0; i<array.length - 1;i++){
            minIndex = i;
            for(int j=i + 1;j < array.length;j++){
                if(array[minIndex].compareTo(array[j]) > 0){
                    minIndex = j;
                }
            }
            swap(i,minIndex,array);
        }
    }

}
