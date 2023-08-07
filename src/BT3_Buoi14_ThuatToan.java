import java.util.Scanner;

public class BT3_Buoi14_ThuatToan {
//    //+ Nhập vào n. Tính S = 100 +1/3 + 1/2 + 3/5 + … ;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Nhap n: ");
        n = sc.nextInt();
        System.out.println("Tong S = "+sum(100,n));
    }

    public static float sum(float s, int n){
        if (n == 0){
            return s;
        }
        else {
            s += (float) n/(n+2);
            return sum(s,n-1);
        }
    }
}
