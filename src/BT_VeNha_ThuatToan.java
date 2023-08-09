import java.util.Scanner;

public class BT_VeNha_ThuatToan {
//    1. Kiểm tra tính tăng dần của mảng
//2. Đếm số lần xuất hiện của phần tử trong mảng
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        boolean b = true;
        System.out.println("Nhap so phan tu cua mang: ");
        n = sc.nextInt();
        int a[] = new int [n];
        for (int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        for (int i = 1; i < n; i++){
            if (a[i] < a[i-1]){
                b = false;
                break;
            }
        }
        if (b){
            System.out.println("Day so tang dan!");
        }
        else {
            System.out.println("Day khong tang dan!");
        }

        int c[] = new int[n];
        for (int i = 0; i < n; i++){
            c[i] = a[i];
        }
        int dem=0;
        int k;
        for (int i = 0; i < c.length; i++){
            for(int j = i+1; j < c.length; j++){
                if (c[i] > c[j]){
                    k = c[i];
                    c[i] = c[j];
                    c[j] = k;
                }
            }
        }
        for (int i = 0; i < c.length; i++){
            dem++;
            if (i == c.length - 1){
                System.out.println(c[i]+ " xuat hien "+dem+" lan");
                break;
            }
            if (c[i] < c[i+1]){
                System.out.println(c[i]+ " xuat hien "+dem+" lan");
                dem = 0;
            }
        }
    }
}
