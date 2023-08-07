public class BT2_Buoi15_ThuatToan {
// 8 Hau
//Bài toán xếp xếp hậu là bài toán đặt tám quân hậu trên bàn cờ vua kích thước 8×8
// sao cho không có quân hậu nào có thể “ăn” được quân hậu khác\
//    Lời giải của bài toán là một cách xếp tám quân hậu trên bàn cờ sao cho không có hai quân nào đứng trên cùng hàng,
//    hoặc cùng cột hoặc cùng đường chéo. Bài toán tám quân hậu có thể tổng quát hóa thành
//    bài toán đặt n quân hậu trên bàn cờ n×n(n ≥ 4).

//    Giải bài toán xếp hậu bằng đệ quy trong C/C++
//Để tiện trình bày ta dùng biến i để đánh dấu các hàng từ trên xuống ( 1 đến n).
// Dùng biến j để đánh dấu các cột từ trái sang phải ( 1 đến n );
//Các phần tử nằm trên cùng hàng có chỉ số hàng bằng nhau;
//Các phần tử nằm trên cùng cột có chỉ số cột bằng nhau;
//Để tiện cho việc in kết quả ra thì ta chỉ in ra chỉ số các cột tuần tự theo các hàng từ trên xuống.
//Điều kiện để đặt một quân hậu đúng chỗ là không có 2 trên cùng một cột ( chỉ số cột khác nhau).
// Không có 2 quân hậu nào cùng ở trên một đường chéo.
//Ý tưởng:
//Đầu tiên ta đặt quân hậu thứ nhất vào các cột trên hàng 1 ( có n cách đặt ).
//Thử đặt quân hậu 2 vào từng cột ở hàng 2 sao cho không bị quân hậu 1 khống chế.
// Với mỗi vị trí của quân hậu này ta lại thử đặt quân hậu thứ ba vào các cột sao cho không bị các quân hậu trước khống chế.
//Sau khi đặt xong quân hậu thứ tám thì in ra một cách đặt.
}
