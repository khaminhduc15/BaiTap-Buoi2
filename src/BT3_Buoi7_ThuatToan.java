import java.util.Scanner;

public class BT3_Buoi7_ThuatToan {
//    + https://www.laptrinhonline.club/problem/2018banhchung
    public static void main(String[] args) {
        int n,count=0;
        Scanner sc = new Scanner(System.in);
        int [] a = new int[100];
        System.out.println("Nhap so nhom va so thanh vien tung nhom: ");
        n = sc.nextInt();
        for(int i = 0; i<n; i++){
            a[i] = sc.nextInt();
        }
        for(int i = 0; i<n; i++) {
            if(a[i] == 4){
                count ++;
            }
            else{
                for (int j = i+1; j<n; j++){
                    if (a[i] + a[j] == 4){
                        count ++;
                        a[j] =0;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
