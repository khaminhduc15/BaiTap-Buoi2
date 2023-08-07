import java.util.Scanner;

public class BT_Buoi13_ThuatToan {
//    "- Phương pháp Đệ quy
//- Bài tập:
//+ Viết hàm đệ quy tính tổng các số từ 1 đến n.
//+ Viết hàm đệ quy tính giai thừa của một số nguyên dương n.
//+ Viết hàm đệ quy tìm ước chung lớn nhất (UCLN) của hai số nguyên dương a và b."
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Nhap n: ");
        n = sc.nextInt();
        System.out.println("Tong cac so tu 1 den n la: " +sum(n));

        int m;
        System.out.println("Nhap so nguyen duong m: ");
        m = sc.nextInt();
        System.out.println("Giai thua cua m la :"+giaithua(m));

        int a,b;
        System.out.println("Nhap 2 so nguyen duong a va b: ");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("UCLN cua a va b la: "+UCLN(a,b));
    }
    public static int sum(int n){
        if (n == 1){
            return 1;
        }
        else if(n < 1){
            return sum(n+1)+n;
        }
        else {
            return sum(n-1) +n;
        }
    }

    public static int giaithua(int n){
        if(n == 1){
            return 1;
        }
        else {
            return giaithua(n-1) * n;
        }
    }

    public static int UCLN(int a, int b){
        if(b==0){
            return a;
        }
        else {
            return UCLN(b,a%b);
        }
    }
}
