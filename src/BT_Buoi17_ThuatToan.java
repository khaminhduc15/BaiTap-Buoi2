import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class BT_Buoi17_ThuatToan {
//    "- CTDL
//- Bài tập sử dụng map
//+ Đếm số lần xuất hiện của các phần tử trong mảng
//+ In ra các phần tử chỉ xuất hiện 1 lần
//+ https://www.hackerrank.com/contests/clb-thuat-toan/challenges/kiem-tra-tan-so-xuat-hien-cua-cac-so-nguyen"
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so phan tu cua mang: ");
        int n = sc.nextInt();
        int [] a = new int[n];
        System.out.println("Nhap cac phan tu cua mang: ");
        for (int i = 0; i<n; i++){
            a[i] = sc.nextInt();
        }
        Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
//        Them cac phan tu vao map va dem so lan xuat hien
        for (int i = 0; i < n; i++) {
            if (map.containsKey(a[i])){
                int count = map.get(a[i]) + 1;
                map.put(a[i],count);
            }
            else {
                map.put(a[i], 1);
            }
        }
        for (Integer key : map.keySet()){
            System.out.println(key+" xuat hien "+map.get(key)+" lan");
        }
        System.out.println("Cac phan tu chi xuat hien 1 lan la: ");
        for (Integer key : map.keySet()){
            if (map.get(key) == 1){
                System.out.println(key);
            }
        }
    }
}
