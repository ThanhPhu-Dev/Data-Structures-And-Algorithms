package searchingAlgorithms;

public class BinarySearch<T extends Comparable<T>> implements ISearch<T> {
    @Override
    public int search(T[] array, T element) {
        return binarySeach(array, 0, array.length - 1, element);
    }

    private int binarySeach(T[] array, int l, int r, T element) {
        if (r > l) {
            int mid = l + (r - l) / 2;
            int rs = array[mid].compareTo(element);
            if (rs == 0)
                return mid;
            else if (rs > 0)
                return binarySeach(array, l, mid - 1, element);
            else
                return binarySeach(array, mid + 1, r, element);
        }
        return -1;
    }


    /**
     * method dùng loop while không đệ quy
     *
     * @param array
     * @param element
     * @return
     */
    public int binarySearch2(T[] array, T element) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int rs = array[mid].compareTo(element);
            if(rs ==0) return mid;
            if(rs > 0) right = mid -1;
            else left = mid + 1;
        }
        return -1;
    }
}
