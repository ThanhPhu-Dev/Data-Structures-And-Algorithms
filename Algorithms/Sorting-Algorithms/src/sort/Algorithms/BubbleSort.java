package sort.Algorithms;

public class BubbleSort<T extends Comparable<T>> extends SortADT<T>{

    /**
     * O (n * n)
     * hoán vị 2 cột liền nhau
     * @param array
     */
    @Override
    public void sort(T[] array) {
        //trừ 1 vì bắt đầu mỗi vòng for thì vị trí cuối cùng là vị trí đúng nên không cần xét nó lại
        for(int i=0;i<array.length - 1;i++){
            //trừ -1 vì ở dưới + 1 rồi nên vị trí cuối không cần duyệt,
            // trừ i vì mỗi for lớn xong thì dc 1 vị trí đúng không cần duyệt lại
            for(int j=0;j<array.length - i - 1;j++){
                if(array[j].compareTo(array[j + 1]) > 0){
                    swap(j,j+1,array);
                }
            }
        }
    }


    /**
     * O (n)
     * nếu trong vòng lặp con đầu tiên không có bất kỳ swap nào xãy ra nghĩa là mảng đã dc sắp xếp rồi
     * @param array mang can sort
     */
    public void AdvancedBubbleSort(T[] array){
        boolean swapped;
        for(int i=0;i<array.length - 1;i++){
            swapped = false;
            for(int j=0;j<array.length - i - 1;j++){
                if(array[j].compareTo(array[j + 1]) > 0){
                    swap(j,j+1,array);
                    swapped = true;
                }
            }
            if(swapped == false) break;
        }
    }



}
