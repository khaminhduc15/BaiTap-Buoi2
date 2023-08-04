import java.util.Scanner;

public class BT1_Buoi7_ThuatToan {
//    "- Bài tập:
//+ https://www.laptrinhonline.club/problem/cotyey000
//+ https://www.laptrinhonline.club/problem/2018ghepdoi
//+ https://www.laptrinhonline.club/problem/2018banhchung
//- Các cuộc thi lập trình"
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,s,count=0;
        System.out.println("Nhap n: ");
        n = sc.nextInt();
        System.out.println("Nhap s: ");
        s = sc.nextInt();
        for(int i = 0; i<= n; i++){
            for(int j = 0; j<= n; j++){
                for(int k = 0; k<= n; k++){
                    if( i + j + k == s){
                        System.out.println("("+ i +","+ j +"," +k+")");
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
