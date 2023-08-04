import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//        "- Giới thiệu, định hướng, quy tắc
//- Kiểm tra đầu vào:
//+ Nhập 2 số nguyên x và y. Viết chương trình tính tổng bình phương các số từ x đến y.
//+ ""Nhập vào n. Tính
//S = 100 +1/3 + 1/2 + 3/5 + … + n*(n + 1)/ (n+1)*(n + 2); ""
//+ Cho 2 số nguyên dương a và b. Hãy tìm ước chung lớn nhất của 2 số này.
//+ Cho 2 số nguyên dương a và b. Hãy tìm bội chung nhỏ nhất của 2 số này
//+ Viết chương trình nhập 1 số nguyên có 3 chữ số.
//Hãy in ra cách đọc của số nguyên này
        int a, b,ucln=0,bcnn;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap 2 so nguyen a va b: ");
        a = sc.nextInt();
        b = sc.nextInt();
        for (int i = a;i>0;i--) {
            if (a % i == 0 && b % i == 0) {
                ucln = i;
                System.out.println("UCLN la : " + ucln);
                break;
            }
        }
        bcnn = (a * b) / ucln;
        System.out.println("BCNN la : " + bcnn);
    }
}