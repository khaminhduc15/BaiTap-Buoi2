import java.util.Scanner;

public class BT2_Buoi14_ThuatToan {
//    //+ Kiểm tra chuỗi đối xứng
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String chuoi;
        System.out.println("Nhap chuoi: ");
        chuoi = sc.nextLine();
        int length = chuoi.length();
        System.out.println(kiemtra(chuoi,length,""));
        if (kiemtra(chuoi, length, "").equals(chuoi)){
            System.out.println("Day la chuoi doi xung!");
        }
        else {
            System.out.println("Day la chuoi khong doi xung!");
        }
    }

    public static String kiemtra(String chuoi, int length, String kt){
        if (length >= 1){
            length = length-1;
            kt = kt + chuoi.charAt(length);
            return kiemtra(chuoi,length,kt);
        }
        else {
            return kt;
        }
    }
}
