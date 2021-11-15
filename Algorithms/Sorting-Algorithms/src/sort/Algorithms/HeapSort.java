package sort.Algorithms;

public class HeapSort<T extends Comparable<T>> extends SortADT<T> {
    @Override
    public void sort(T[] array) {
        int n = array.length;
        //Build Heap(sau khi loop ở trên xong thì sẽ parent lớn nhất ở đầu mảng)
        //tìm last parent node công thức (size/2)-1
        //gọi hàm sắp xếp cho nhánh parent cho đúng quy tắc
        // sau đó lại sắp xếp parent của parent đó bằng công thức indexParent - 1
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(array, n, i);
        }

        for (int i = n - 1; i >= 0; i--) {
            //hoán vị vị trí cuối là vị trí đầu mảng sẽ dc value lớn nhất ở cuối mảng
            swap(0, i, array);
            //sau khi build heap rồi thì chỉ cần gọi hàm sắp xếp với đầu vào là vị trí đầu mảng
            heapify(array, i, 0);
        }
    }

    /**
     * công thức tạo ra cái cây nhị phân hoàn chỉnh (Binary Heap)
     * Binary Heap: là cây mọi child phải lớn hơn parent gọi là min heap (nhỏ hơn parent gọi là max heap)
     * cách tạo: nút cha chỉ mục I, nút bên trái có thể tính bằng 2*I+1, nút bên phải có thể tính bằng 2*I+2
     * <p>
     * hàm sắp xếp các last children nhỏ hơn parent (max heap)
     * @param array
     * @param n     số lượng phần tử array
     * @param i     index bắt đầu sắp xếp
     */
    private void heapify(T[] array, int n, int i) {
        int largest = i;//là vị trí chứa giá trị lớn nhất bắt đầu là từ root
        int l = 2 * i + 1;
        int r = 2 * i + 2;

        if (l < n && array[l].compareTo(array[largest]) > 0)
            largest = l;
        if (r < n && array[r].compareTo(array[largest]) > 0)
            largest = r;

        //nếu largest == i thì khỏi swap
        if (largest != i) {
            swap(largest, i, array);
            //sau khi hoán vị xong thì lại phải kiểm tra các child của nó lại lần nữa
            heapify(array, n, largest);
        }
    }
}
