import java.util.Scanner;

public class UCLN {
    public static void main(String[] args) {
//        + Cho 2 số nguyên dương a và b. Hãy tìm ước chung lớn nhất của 2 số này.
//         Cho 2 số nguyên dương a và b. Hãy tìm bội chung nhỏ nhất của 2 số này
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a,b :");
        a = sc.nextInt();
        b= sc.nextInt();
        for (int i=a; i>=0; i--){
            if(a % i == 0 && b%i == 0){
                System.out.println("UCLN la : "+i);
                break;
            }
        }
    }
}
