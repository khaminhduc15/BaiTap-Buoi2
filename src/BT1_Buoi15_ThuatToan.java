import java.util.Scanner;

public class BT1_Buoi15_ThuatToan {
//    "- Bài tập:
//+ Tháp HN
//    Bài toàn tháp Hà Nội là trò chơi toán học gồm 3 cọc và n đĩa có kích thước khác nhau.
//    Ban đầu các đĩa được xếp chồng lên nhau trong cọc A
//    Yêu cầu của bài toán: Di chuyển toàn bộ các đĩa ở cọc A sang cọc C với điều kiện sau.
//
//  Mỗi lần thực hiện chỉ được di chuyển một đĩa
//  Các đĩa phải xếp theo nguyên tắc, đĩa lớn ở dưới, đĩa nhỏ ở trên.
//  Được phép thêm một cọc B làm trung gian để di chuyển các đĩa.
//- Code Nhóm + Review chéo"
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so dia: ");
        n = sc.nextInt();
        ThapHN(n,'A','C','B');
    }
    public static void ThapHN(int n,char cotbatdau, char cotdich, char cottrunggian){
        if (n == 1){
            System.out.println("Di chuyen dia 1 tu cot "+cotbatdau+" den cot "+cotdich);
            return;
        }
        ThapHN(n-1,cotbatdau,cottrunggian,cotdich);
        System.out.println("Di chuyen dia "+n+" tu cot "+cotbatdau+" den cot "+cotdich);
        ThapHN(n-1,cottrunggian,cotdich,cotbatdau);
    }
}
