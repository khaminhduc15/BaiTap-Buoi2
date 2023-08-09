import java.util.Scanner;

public class BT2_VeNha_ThuatToan {
//    1. Viết hàm nhận vào 1 số, trả về Tích của số đó với 10. Gọi hàm
//2. Viết hàm nhận và 1 số, trả về tổng các số từ 1 đến số đó. Gọi hàm
//3. Viết hàm nhận và 2 số a và b, trả về tích các số từ a đến b. Gọi hàm
    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);
        int a;
        System.out.println("Nhap so a: ");
        a = sc.nextInt();
        System.out.println("Tich cua a va 10 la: "+tich(a));
        System.out.println("Tong cua cac so tu 1 den a la: "+sum(a));

        int b;
        System.out.println("Nhap b: ");
        b = sc.nextInt();
        System.out.println("Tich cac so tu den b la: "+tich(a,b));
    }
    public static int tich(int a){
        return a * 10;
    }
    public static int sum(int a){
        int sum=0;
        if (a>=1){
            for (int i = 1; i <= a; i++){
                sum+=i;
            }
        }
        else {
            for (int i = a; i <= 1; i++){
                sum+=i;
            }
        }
        return sum;
    }
    public static int tich(int a, int b){
        int tich = 1;
        if (a <= b){
            for (int i = a; i <= b; i++){
                tich *= i;
            }
        }
        else {
            for (int i = b; i <= a; i++){
                tich *= i;
            }
        }
        return tich;
    }
}
