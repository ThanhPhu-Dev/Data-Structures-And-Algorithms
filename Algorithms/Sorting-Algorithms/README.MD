 #Selection Sort.
 - Độ phức tạp: O(n2) vì có 2 vòng lặp.
 - Không gian phụ trợ: O(1)
 - Điều tốt về sắp xếp lựa chọn là nó không bao giờ tạo ra nhiều hơn O (n) hoán đổi và có thể hữu ích khi ghi bộ nhớ là một hoạt động tốn kém.
 #Bubble Sort.
 - Độ phức tạp thời gian của trường hợp xấu nhất và trung bình: O (n * n). Trường hợp xấu nhất xảy ra khi mảng được sắp xếp ngược lại.
 - Độ phức tạp về thời gian của trường hợp tốt nhất: O (n). Trường hợp tốt nhất xảy ra khi mảng đã được sắp xếp.
 - Không gian phụ trợ: O (1).
 #Insertion Sort.
 - Trường hợp tốt: O(n).
 - Trung bình và xấu: O(n^2).
 - Dùng tốt cho một danh sách gần như sort rồi
 #Merge Sort.
 - Độ phức tạp về thời gian: O (nLogn)
 - Không gian phụ trợ: O (n).
 #Heap Sort.
 - Độ phức tạp: O (nLogn).
 - Ứng dụng: Sắp xếp một mảng gần được sắp xếp xong (hoặc K đã sắp xếp).
 - Thuật toán Heap sort có giới hạn sử dụng vì Quicksort và Mergesort tốt hơn trong thực tế. Tuy nhiên, bản thân cấu trúc dữ liệu Heap được sử dụng rất nhiều.
 #Quick Sort.
  - Trường hợp xấu nhất xảy ra khi quá trình phân vùng luôn chọn phần tử lớn nhất hoặc nhỏ nhất làm pivot (mảng đã được sắp xếp theo thứ tự tăng hoặc giảm).
  - Trường hợp tốt nhất: Trường hợp tốt nhất xảy ra khi quá trình phân vùng luôn chọn phần tử ở giữa làm trục. Sau đây là tái diễn cho trường hợp tốt nhất.
 #Interchange Sort.
 - Độ phức tạp: θ(n2)
 #Shaker Sort.
 - Độ phức tạp tốt nhất: O(n).
 - Độ phức tạp xấu nhất và trung bình: O(n^2).
 - ó thể nói rằng Shaker Sort ưu thế hơn Bubble Sort trong trường hợp các phần tử trong mảng gần có thứ tự đúng
 #Shell Sort.
 - Độ phức tạp của trường hợp xấu nhất: Nhỏ hơn hoặc bằng O(n^2).
 - Độ phức tạp của trường hợp tốt nhất và trung bình: O(n∗logn).
 - Không gian phụ trợ: O (1).
 - Shell Sort được sử dụng khi:
   - Việc gọi một ngăn xếp là tốn kém. Thư viện uClibc sử dụng kiểu thuật toán sắp xếp này.
   - Kỹ thuật đệ quy vượt quá giới hạn cho phép. Trình nén bzip2 sử dụng kiểu sắp xếp này.
   - Sắp xếp chèn không hoạt động tốt khi các phần tử gần bằng nhau nằm ở cách xa nhau. Sắp xếp Shell giúp giảm khoảng cách giữa các phần tử gần bằng nhau. Do đó, sẽ có ít số lần hoán đổi được thực hiện hơn.