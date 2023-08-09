import java.util.Scanner;

public class BT2_Buoi8_ThuatToan {
//    + Nhập a,b,c (không trùng, khác 0). In ra các số 3 chữ số có thể tạo ra từ a,b,c"
    public static void main(String[] args) {
        int a, b, c;
        System.out.println("Nhap 3 so a,b,c: ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        for (int i = 1; i<=9;i++){
            if(i == a){
                for (int j = 1; j <= 9; j++){
                    if (j == b){
                        for (int k = 1; k <= 9; k++){
                            if (k == c){
                                System.out.println(i+ "" + j +""+k);
                            }
                        }
                    }
                    if (j == c){
                        for (int k = 1; k <= 9; k++){
                            if (k == b){
                                System.out.println(i+ "" + j +""+k);
                            }
                        }
                    }
                }
            }
            if(i == b){
                for (int j = 1; j <= 9; j++){
                    if (j == a){
                        for (int k = 1; k <= 9; k++){
                            if (k == c){
                                System.out.println(i+ "" + j +""+k);
                            }
                        }
                    }
                    if (j == c){
                        for (int k = 1; k <= 9; k++){
                            if (k == a){
                                System.out.println(i+ "" + j +""+k);
                            }
                        }
                    }
                }
            }
            if(i == c){
                for (int j = 1; j <= 9; j++){
                    if (j == a){
                        for (int k = 1; k <= 9; k++){
                            if (k == b){
                                System.out.println(i+ "" + j +""+k);
                            }
                        }
                    }
                    if (j == b){
                        for (int k = 1; k <= 9; k++){
                            if (k == a){
                                System.out.println(i+ "" + j +""+k);
                            }
                        }
                    }
                }
            }
        }
    }
}
