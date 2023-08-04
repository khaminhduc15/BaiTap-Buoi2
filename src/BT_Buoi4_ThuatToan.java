import java.util.Scanner;

public class BT_Buoi4_ThuatToan {
//    "- Clean code
//- Bài tập:
//+ https://www.laptrinhonline.club/problem/2019banhdanem
//+ Tính lãi ngân hàng
//+ Phân loại học sinh
//- Code Cặp"
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so banh da nem Duy phai ran : ");
        n = sc.nextInt();
        if(n%9 == 0){
            System.out.println("So lan Duy ran toi thieu la: "+(n/9));
        }
        else{
            System.out.println("So lan Duy ran toi thieu la: "+(n/9 + 1));
        }
    }
}
