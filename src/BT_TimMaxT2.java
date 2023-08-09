import java.util.Scanner;

public class BT_TimMaxT2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Nhap n: ");
        n = sc.nextInt();
        int a [] = new int[n];
        System.out.println("Nhap day so: ");
        for (int i = 0; i < a.length; i++){
            a[i] = sc.nextInt();
        }
        int max1,max2;
        if(a[0] >= a[1]){
            max1 = a[0];
            max2 = a[1];
        }
        else{
            max2 = a[0];
            max1 = a[1];
        }
        for (int i = 2; i < a.length; i++){
            if (max1 < a[i]){
                max2 = max1;
                max1 = a[i];
            }
            if(max2 < a[i] && max2 < max1){
                int max3 = max2;
                max2 = a[i];
                if(max1 == max2){
                    max2 = max3;
                }
            }
            if (max1 == max2 && max1 > a[i]){
                max2 = a[i];
            }
        }
        System.out.println(max1);
        System.out.println(max2);
    }
}
