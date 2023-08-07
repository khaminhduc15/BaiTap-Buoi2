import java.util.Scanner;

public class BT_Buoi14_ThuatToan {
//    "- Bài tập:
//+ Viết hàm đệ quy tìm số lần xuất hiện của một số nguyên k trong một mảng các số nguyên.
//+ Kiểm tra chuỗi đối xứng
//+ Nhập vào n. Tính S = 100 +1/3 + 1/2 + 3/5 + … ;
//- Code Nhóm + Review chéo"
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k,n;
        System.out.println("Nhap so phan tu cua mang: ");
        n = sc.nextInt();
        int a [] = new int[n];
        System.out.println("Nhap cac phan tu cua mang: ");
        for (int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Nhap so nguyen k: ");
        k = sc.nextInt();
        System.out.println("So lan xuat hien cua k trong mang la: "+dem(a, k, 0, 0));
    }

    public static int dem(int[] a, int k, int dem, int i){
        if (i == a.length){
            return dem;
        }
        else {
            if (k == a[i]) {
                dem++;
                return dem(a, k, dem, i + 1);
            }
            else {
                return dem(a, k, dem, i + 1);
            }
        }
    }
}
