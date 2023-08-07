import java.util.Scanner;

public class BT3_Buoi11_ThuatToan {
    public static void main(String[] args) {
//        "- Kỹ thuật Đặt cờ hiệu
//- Làm bài tập:
//+ Kiểm tra mảng có tăng dần hay không
//+ Hãy cho biết tất cả các phần tử trong mảng a có nằm trong mảng b không
//+ http://laptrinhonline.club/problem/tichpxlancan?fbclid=IwAR3uDeiN6V8YCoZpMbwCewWKhy5-K-Aj4kVe8WMgwptTR9u_SpkgbC54DIs
//+ Tìm dãy con liên tiếp có tổng lớn nhất trong một mảng."
        int n,m,dem=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n,m: ");
        n = sc.nextInt();
        m = sc.nextInt();
        int [] a = new int[n];
        int [] b = new int[m];
        System.out.println("Nhap do dai ong a: ");
        for (int i=0; i < n; i++ ){
            a[i] = sc.nextInt();
        }
        System.out.println("Nhap do dai ong b: ");
        for (int i=0; i < m; i++ ){
            b[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                if (a[i] == b[j]){
                    dem++;
                    b[j] = 0;
                    break;
                }
            }
        }
        System.out.println(dem);
     }
}
