import java.util.Scanner;

public class BT_Buoi10_ThuatToan {
//"- Kỹ thuật Đặt cờ hiệu
//- Làm bài tập:
//+ Kiểm tra mảng có tăng dần hay không
//+ Hãy cho biết tất cả các phần tử trong mảng a có nằm trong mảng b không
//+ http://laptrinhonline.club/problem/tichpxlancan?fbclid=IwAR3uDeiN6V8YCoZpMbwCewWKhy5-K-Aj4kVe8WMgwptTR9u_SpkgbC54DIs
//+ Tìm dãy con liên tiếp có tổng lớn nhất trong một mảng."
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,m,dem=0;
        System.out.println("Nhap so phan tu cua mang a: ");
        n = sc.nextInt();
        int a [] = new int[n];
        System.out.println("Nhap cac phan tu cua mang a");
        for (int i = 0; i<n; i++){
            a[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++){
            if(a[i] < a[i+1]){
                dem++;
            }
        }
        if(dem == n-1){
            System.out.println("Day tang dan");
        }
        else{
            System.out.println("Day khong tang dan");
        }



        System.out.println("Nhap so phan tu cua mang b: ");
        m = sc.nextInt();
        dem = 0;
        int b [] = new int[m];
        System.out.println("Nhap cac phan tu cua mang b");
        for (int i = 0; i<m; i++){
            b[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                if (a[i] == a[j]){
                    dem++;
                }
            }
        }
        if(dem == n){
            System.out.println("Mang A la phan tu con cua Mang B");
        }
    }
}
