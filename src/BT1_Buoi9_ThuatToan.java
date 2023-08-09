import java.util.Scanner;

public class BT1_Buoi9_ThuatToan {
    public static void main(String[] args) {
//        "- Các dạng bài cơ bản với mảng
//- Các kỹ thuật, phương pháp làm việc với mảng
//- Kỹ thuật Đặt lính canh
//- Làm bài tập:
//+ In ra các phần tử chẵn trong mảng
//+ Liệt kê các vị trí mà giá trị tại đó là giá trị âm
//+ In ra các phần tử trong mảng mà phần tử đó lớn hơn giá trị phần tử trước đó
//+ Tính tổng các phần tử nằm ở vị trí lẻ
//+ Tính tổng VỊ TRÍ của các phần tử chẵn
//+ So sánh tổng phần tử có giá trị chẵn và lẻ của mảng"
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Nhap so phan tu cua mang: ");
        n = sc.nextInt();
        int a [] = new int[n];
        System.out.println("Nhap cac phan tu cua mang");
        for (int i = 0; i<n; i++){
            a[i] = sc.nextInt();
        }
        //+ In ra các phần tử chẵn trong mảng
        System.out.println("Cac phan tu chan la: ");
        for(int i = 0; i < n; i++){
            if (a[i]%2 == 0){
                System.out.println(a[i]);
            }
        }

        //+ Liệt kê các vị trí mà giá trị tại đó là giá trị âm
        System.out.println("Cac gia tri am la: ");
        for(int i = 0; i < n; i++){
            if (a[i] < 0){
                System.out.println(a[i]);
            }
        }

        //+ In ra các phần tử trong mảng mà phần tử đó lớn hơn giá trị phần tử trước đó
        System.out.println("Cac phan tu lon hon gia tri phan tu truoc do la: ");
        for (int i = 1; i < n; i++){
            if(a[i] > a[i-1]){
                System.out.println(a[i]);
            }
        }

        //+ Tính tổng các phần tử nằm ở vị trí lẻ
        int sum=0;
        for (int i = 0; i < n; i++){
            if(i % 2 == 0){
                sum+=a[i];
            }
        }
        System.out.println("Tong can phan tu nam o vi tri le la: "+sum);

        //+ Tính tổng VỊ TRÍ của các phần tử chẵn
        int sum1=0;
        for (int i = 0; i < n; i++){
            if(a[i] % 2 == 0){
                sum1+=(i+1);
            }
        }
        System.out.println("Tong vi tri cua cac phan tu chan la: "+sum1);


//+ So sánh tổng phần tử có giá trị chẵn và lẻ của mảng"
        int sumchan=0, sumle=0;
        for (int i = 0; i < n; i++){
            if(a[i] % 2 == 0){
                sumchan+=a[i];
            }
            else {
                sumle+=a[i];
            }
        }
        if(sumchan > sumle)
        {
            System.out.println("Tong cac phan tu chan lon hon");
        }
        else if (sumchan < sumle){
            System.out.println("Tong cac phan tu le lon hon");
        }
        else{
            System.out.println("Tong cac phan tu chan va le bang nhau");
        }
    }
}
