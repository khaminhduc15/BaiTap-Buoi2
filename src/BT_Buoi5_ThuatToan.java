import java.util.Scanner;

public class BT_Buoi5_ThuatToan {
//    "- Bài tập
//+ Nhập vào a, b. In ra các số lẻ từ a -> b
//+ Nhập vào a, b. In từ a đến b, chia hết cho 3 in 'Fizz', chia hết cho 5 in 'Buzz', chia hết cho 3 và 5 in 'FizzBuzz'""
//+ Nhập và a, b. In ra các số chính phương từ a đến b
//+ Nhập vào a, b.
//+Tính tổng các số từ a -> b
//+ Nhập vào a, b. Tính tổng các số chẵn từ a -> b"
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.println("Nhap a va b: ");
        a = sc.nextInt();
        b = sc.nextInt();


        //+ Nhập vào a, b. In ra các số lẻ từ a -> b
        if(a <= b){
            for (int i = a ; i <= b; i++){
                if (i % 2 == 1){
                    System.out.println(i);
                }
            }
        }
        else{
            for (int i = b; i <= a; i++){
                if (i % 2 == 1){
                    System.out.println(i);
                }
            }
        }

        //+ Nhập vào a, b. In từ a đến b, chia hết cho 3 in 'Fizz', chia hết cho 5 in 'Buzz', chia hết cho 3 và 5 in 'FizzBuzz'""
        if(a <= b){
            for (int i = a ; i <= b; i++){
                if (i % 3 == 0 && i % 5 !=0){
                    System.out.println(i+ " Fizz");
                }
                else if (i % 3 != 0 && i % 5 == 0){
                    System.out.println(i+ " Buzz");
                }
                else if (i % 3 == 0 && i % 5 == 0){
                    System.out.println(i+ " FizzBuzz");
                }
            }
        }
        else{
            for (int i = b ; i <= a; i++){
                if (i % 3 == 0 && i % 5 !=0){
                    System.out.println(i+ " Fizz");
                }
                else if (i % 3 != 0 && i % 5 == 0){
                    System.out.println(i+ " Buzz");
                }
                else if (i % 3 == 0 && i % 5 ==0){
                    System.out.println(i+ " FizzBuzz");
                }
            }
        }


//        + Nhập và a, b. In ra các số chính phương từ a đến b
        int n;
        System.out.println("Cac so chinh phuong trong day la: ");
        if(a <= b){
            for (int i = a ; i <= b; i++){
                n = (int) Math.sqrt(i);
                if(n * n == i){
                    System.out.println(i);
                }
            }
        }
        else{
            for (int i = b; i <= a; i++){
                n = (int) Math.sqrt(i);
                if(n * n == i){
                    System.out.println(i);
                }
            }
        }


//        +Tính tổng các số từ a -> b
////+ Nhập vào a, b. Tính tổng các số chẵn từ a -> b"
        int tong1 = 0, tong2 = 0;
        if(a <= b){
            for (int i = a ; i <= b; i++){
                tong1 += i;
                if (i % 2 == 0){
                    tong2 += i;
                }
            }
        }
        else{
            for (int i = b; i <= a; i++){
                tong1 += i;
                if (i % 2 == 0){
                    tong2 += i;
                }
            }
        }
        System.out.println("Tong cua day la: "+tong1);
        System.out.println("Tong cua cac so chan trong day la: "+tong2);
    }
}
