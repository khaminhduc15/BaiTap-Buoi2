import java.util.Scanner;

public class BT2_Buoi7_ThuatToan {
    //+ https://www.laptrinhonline.club/problem/2018ghepdoi
    public static void main(String[] args) {
        int x,y;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so sinh vien nam va nu: ");
        x = sc.nextInt();
        y = sc.nextInt();
        if(x == y){
            System.out.println("Co "+x+ " cap 1 nam 1 nu");
        }
        else if (x < y){
            System.out.println("Co "+x+ " cap 1 nam 1 nu");
            System.out.println("Co "+(y-x)/2+ " cap dong gioi");
        }
        else {
            System.out.println("Co "+y+ " cap 1 nam 1 nu");
            System.out.println("Co "+(x-y)/2+ " cap dong gioi");
        }
    }
}
