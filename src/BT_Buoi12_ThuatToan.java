import java.util.Scanner;

public class BT_Buoi12_ThuatToan {
//    "- Bài tập:
//+ Viết hàm đệ quy tìm số Fibonacci thứ n.
//+ Viết hàm đệ quy tính lũy thừa bậc n của một số nguyên x.
//+ Viết hàm đệ quy tìm số chữ số của một số nguyên dương n.
//- Code Nhóm + Review chéo"
    public static void main(String[] args) {
//        fibonacci
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Nhap n: ");
        n = sc.nextInt();
        System.out.println("So fibonacci thu n la: "+fibonacci(n));
        System.out.println("Nhap so x va luy thua y: ");
        int x,y;
        x = sc.nextInt();
        y = sc.nextInt();
        System.out.println("Luy thua bac "+y+ " cua "+x+" la: "+luythua(y,x));

        System.out.println("Nhap so nguyen duong: ");
        int z;
        z = sc.nextInt();
        System.out.println("So chu so la: "+demso(z,0));;
    }
    public static int fibonacci(int n) {
        if (n < 0) {
            return -1;
        } else if (n == 0 || n == 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static int luythua(int n, int x){
        if (n == 0){
            return 1;
        }
        else if(n == 1){
            return x;
        }
        else{
            return luythua(n-1,x) * x;
        }
    }

    public static int demso(int n,int dem){
        if(n/10 > 0){
            dem++;
            return demso(n/10,dem);
        }
        else {
            return dem+1;
        }
    }
}
