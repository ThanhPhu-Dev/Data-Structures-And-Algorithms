package sort.Algorithms;

public class InsertionSort<T extends Comparable<T>> extends SortADT<T> {

    @Override
    public void sort(T[] array) {
        T temp;
        //bắt đầu vị trí 1
        for (int i = 1; i < array.length; ++i) {
            temp = array[i];
            int j = i - 1;
            //lấy các vị trí bên trái temp để xét nếu lớn hơn thì hoán vị nó sang phải
            while (j >= 0 && array[j].compareTo(temp) > 0){
                array[j+1] = array[j];
                j--;
            }
            //hoán vị temp vào vị trí đẳng trước giá trị nhỏ hơn temp
            array[j+1] = temp;
        }
    }
}
