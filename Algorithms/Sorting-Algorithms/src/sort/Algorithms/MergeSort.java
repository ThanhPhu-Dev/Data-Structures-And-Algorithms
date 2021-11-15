package sort.Algorithms;

public class MergeSort<T extends Comparable<T>> extends SortADT<T> {

    private void megreSort(T[] array, int l, int r) {
        if (l < r) {
            int mid = (l + r) / 2;

            megreSort(array, l, mid);
            megreSort(array, mid + 1, r);

            megre(array, l, mid, r);
        }
    }

    private void megre(T[] array, int l, int mid, int r) {
        int n1 = mid - l + 1;
        int n2 = r - mid;

        T[] L = (T[]) new Comparable[n1];
        T[] R = (T[]) new Comparable[n2];

        for (int i = 0; i < n1; i++) {
            L[i] = array[i + l];
        }
        for (int i = 0; i < n2; i++) {
            R[i] = array[mid + i + 1];
        }

        int i =0, j=0;
        int k=l;

        while(i <n1&& j<n2){
            if(L[i].compareTo(R[j]) <= 0){
                array[k] = L[i];
                i++;
            }else{
                array[k] = R[j];
                j++;
            }
            k++;
        }
        while(i<n1){
            array[k] = L[i];
            i++;
            k++;
        }
        while (j < n2){
            array[k] = R[j];
            j++;
            k++;
        }
    }

    @Override
    public void sort(T[] array) {
        megreSort(array, 0 , array.length -1);
    }
}
