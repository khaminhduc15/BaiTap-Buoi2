import java.util.Scanner;


public class BT4_Buoi11_ThuatToan {
    //+ Tìm dãy con liên tiếp có tổng lớn nhất trong một mảng."
//    VD
//    9
//    -2 1 -3 4 -1 2 1 -5 4
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,max=0,max1 = 0,sum1=0;
        int sum2=0,x=0,z=0,w=0;
        System.out.println("Nhap so phan tu cua mang: ");
        n = sc.nextInt();
        int y [] = new int [n]; //luu vi tri ket thuc day con
        int max2 [] = new int [n]; // luu max cua cac day con bat dau sau st1
        int a [] = new int[n];
        System.out.println("Nhap phan tu mang: ");
        for (int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++){
            sum1 += a[i];
            if(max1 <= sum1){
                max1 = sum1;
                x=i;
            }
            for (int j = i+1 ; j < n; j++){
                sum2 += a[j];
                if(max <= sum2){
                    max = sum2;
                    y[i+1] = j; //vi tri ket thuc day con
                }
            }
            max2[i+1] = max;
            max = 0;
            sum2 = 0;
        }
        for (int j = 1; j < n; j++){
            if(max2[j] >= max){
                max=max2[j];
                z=j;//vi tri bat dau day con
                w=y[j];
            }
        }
        if (max1 >= max){
            System.out.println(max1);
            for (int i = 0; i<= x; i++){
                System.out.print(a[i]+" ");
            }
        }
        else {
            System.out.println(max);
            for (int i = z; i <= w; i++) {
                System.out.print(a[i] + " ");
            }
        }
    }
}
