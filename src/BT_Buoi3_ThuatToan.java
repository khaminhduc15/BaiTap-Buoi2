import java.util.Scanner;

public class BT_Buoi3_ThuatToan {
//    "- Bài tập:
//+ Nhập vào 1 số, kiểm tra xem số đó là chẵn hay lẻ
//+ Tìm số lớn nhất trong 3 số
//+ Nhập vào 3 cạnh tam giác, cho biết loại của tam giác đó
//- Tối ưu code"
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b,c,d,max;
        System.out.println("Nhap so a: ");
        a = sc.nextInt();
        if (a%2==0){
            System.out.println("Day la so chan");
        }
        else {
            System.out.println("Day la so le");
        }
        System.out.println("Nhap 3 so: ");
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        if( d == b & b == c){
            System.out.println("3 so bang nhau. Gia tri lon nhat la "+d);
            System.exit(0);
        }
        if (d >= b){
            max = d;
        }
        else {
            max = b;
        }
        if (c >= max){
            max = c;
        }
        System.out.println("Gia tri lon nhat la: "+max);
    }
}
