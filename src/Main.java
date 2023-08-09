import java.util.Scanner;

public class Main {
//    "- Giới thiệu, định hướng, quy tắc
//- Kiểm tra đầu vào:
//+ Nhập 2 số nguyên x và y. Viết chương trình tính tổng bình phương các số từ x đến y.
//+ ""Nhập vào n. Tính
//S = 100 +1/3 + 1/2 + 3/5 + … + n*(n + 1)/ (n+1)*(n + 2); ""
//+ Cho 2 số nguyên dương a và b. Hãy tìm ước chung lớn nhất của 2 số này.
//+ Cho 2 số nguyên dương a và b. Hãy tìm bội chung nhỏ nhất của 2 số này
//+ Viết chương trình nhập 1 số nguyên có 3 chữ số.
//Hãy in ra cách đọc của số nguyên này"
    public static void main(String[] args) {
        int x, y,tong1=0,n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap 2 so x va y: ");
        x = sc.nextInt();
        y= sc.nextInt();
        for(int i = x; i<=y; i++){
            tong1 += i*i;
        }
        System.out.println("Tong = " +tong1);

        //S = 100 +1/3 + 1/2 + 3/5 + … + n*(n + 1)/ (n+1)*(n + 2); ""
        float tong2 = 100;
        System.out.println("Nhap n: ");
        n = sc.nextInt();
        for(float i = 1; i<=n; i++){
            tong2 += i / (i+2);
        }
        System.out.println("Tong S = " +tong2);
    }
}