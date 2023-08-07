import java.util.Scanner;

public class BT1_Buoi8_ThuatToan {
//    "- Bài tập:
//+ Cần có tổng 20000 đồng từ 3 loại giấy bạc 1000 đồng, 2000 đồng, 5000 đồng. Lập chương trình để tìm ra tất cả các phương án có thể
//+ Cần có tổng 20000 đồng từ 3 loại giấy bạc 1000 đồng, 2000 đồng, 5000 đồng. Lập chương trình để tìm ra phương án ít số lượng tiền nhất
//+ Nhập a,b,c (không trùng, khác 0). In ra các số 3 chữ số có thể tạo ra từ a,b,c"
    public static void main(String[] args) {
//        + Cần có tổng 20000 đồng từ 3 loại giấy bạc 1000 đồng, 2000 đồng, 5000 đồng. Lập chương trình để tìm ra tất cả các phương án có thể
        for (int i = 0; i<=20;i++){
            for (int j = 0; j<=20; j++)
                for (int k = 0; k <= 20; k++){
                    if (1000 * i + 2000 * j + 5000 * k == 20000){
                        System.out.println("1000 x " + i + " + 2000 x "+ j + " + 5000 x "+k);
                    }
                }
            }
//        + Cần có tổng 23000 đồng từ 3 loại giấy bạc 1000 đồng, 2000 đồng, 5000 đồng. Lập chương trình để tìm ra phương án ít số lượng tiền nhất
        int dem1=0, dem2=0,dem5 = 23000 / 5000, dem = dem5;
        int du = 23000 % 5000;
        for(int i = 1; i <= du / 2000 ; i++){
            du = du - 2000;
            dem2++;
            dem++;
        }
        for (int i = 1; i <= du / 1000; i++){
            du = du - 1000;
            dem1++;
            dem ++;
        }
        if(du == 0){
            System.out.println("so to toi thieu chia 23k la: "+ dem + " gom "+dem5 + " to 5000 "+ dem2+ " to 2000 "+dem1+ " to 1000");
        }
    }
}
