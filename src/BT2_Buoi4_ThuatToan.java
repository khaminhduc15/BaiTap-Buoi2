import java.util.Scanner;

public class BT2_Buoi4_ThuatToan {
//    Lãi suất gửi tiết kiệm = (Số tiền gửi x lãi suất (%/năm) x số tháng gửi) ÷ 12 tháng.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,m,a;
        System.out.println("Nhap so tien can gui: ");
        n = sc.nextInt();
        System.out.println("Nhap so thang gui: ");
        m = sc.nextInt();
        System.out.println("Nhap % lai ngan hang hang nam: ");
        a = sc.nextInt();
        System.out.println("Lai suat gui tiet kiem sau "+m+" thang gui la: " +(float) (n * m * a / 100) / 12 + " Nghin Dong");
    }
}
