import java.util.Scanner;

public class BT3_Buoi7_ThuatToan {
    //    + https://www.laptrinhonline.club/problem/2018banhchung
    public static void main(String[] args) {
        int n, count, du = 0;
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        System.out.println("Nhap so nhom va so thanh vien tung nhom: ");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            a[x]++;

        }

//        for (int i = 1; i < a.length; i++) {
//            System.out.println("So nhom co " + i + " thanh vien la: " + a[i]);
//        }
        count = a[4];
        if (a[3] == a[1]) {
            count = count + a[1];
        } else if (a[3] > a[1]) {
            count = count + a[1] + (a[3] - a[1]);
        } else {
            count = count + a[3];
            du = a[1] - a[3];
        }

        if (a[2] % 2 == 0 && du == 0) {
            count = count + (a[2] / 2);
        }
        if (a[2] % 2 == 0 && du > 0) {
            count = count + (a[2] / 2) + du;
        }
        if (a[2] % 2 == 1 && du <= 2) {
            count = count + (a[2] / 2) + 1;
        }
        if (a[2] % 2 == 1 && du > 2) {
            count = count + (a[2] / 2) + (du - 2);
        }
        System.out.println(count);
    }
}
