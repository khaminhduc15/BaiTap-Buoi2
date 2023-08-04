import java.util.Scanner;

public class BT_Buoi6_ThuatToan {
//    "- Bài tập:
//+ Liệt kê các ước số nguyên dương của a
//+ Liệt kê các bội số nhỏ hơn 100 của a
//+ Tìm ước số nguyên lẻ lớn nhất của a
//+ Liệt kê bội chẵn nhỏ nhất của a
//+ Viết chương trình nhập 1 số nguyên có 1 chữ số. Hãy in ra cách đọc của số nguyên này
//+Viết chương trình nhập 1 số nguyên có 2 chữ số. Hãy in ra cách đọc của số nguyên này""
//- Code Cặp"
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("Nhap so nguyen duong a: ");
        a = sc.nextInt();

        //+ Liệt kê các ước số nguyên dương của a
        System.out.println("Uoc so nguyen duong cua a la: ");
        for (int i = 1; i <= a; i++){
            if (a % i == 0){
                System.out.println(i);
            }
        }

        //+ Liệt kê các bội số nhỏ hơn 100 của a (nguyen duong)
        int boiso=a, j=0;
        System.out.println("Boi so nguyen duong < 100 cua a la: ");
        while (boiso < 100){
            System.out.println(boiso);
            j++;
            boiso = a * j;
        }

//        + Tìm ước số nguyên lẻ lớn nhất của a
        System.out.println("Uoc so nguyen le lon nhat cua a la: ");
        if (a % 2 == 1){
            System.out.println(a);
        }
        else {
            for (int i = a; i >= 1 ; i--){
                if (a % i == 0 && i % 2 == 1){
                    System.out.println(i);
                    break;
                }
            }
        }
//        //+ Liệt kê bội chẵn nhỏ nhất của a
        if (a%2 == 0){
            System.out.println("Boi so chan nho nhat cua a la: " + a);
        }
        else
            System.out.println("Boi so chan nho nhat cua a la: " + a * 2);


        //+ Viết chương trình nhập 1 số nguyên có 1 chữ số. Hãy in ra cách đọc của số nguyên này
        int b;
        System.out.println("Nhap so nguyen co 1 chu so: ");
        b = sc.nextInt();
        switch (b){
            case 0:
                System.out.println("Khong");
                break;
            case 1:
                System.out.println("Mot");
                break;
            case 2:
                System.out.println("Hai");
                break;
            case 3:
                System.out.println("Ba");
                break;
            case 4:
                System.out.println("Bon");
                break;
            case 5:
                System.out.println("Nam");
                break;
            case 6:
                System.out.println("Sau");
                break;
            case 7:
                System.out.println("Bay");
                break;
            case 8:
                System.out.println("Tam");
                break;
            case 9:
                System.out.println("Chin");
                break;
            default:
                System.out.println("Nhap dung so co 1 chu so");
        }


        //+Viết chương trình nhập 1 số nguyên có 2 chữ số. Hãy in ra cách đọc của số nguyên này""
        int c,hangchuc,donvi;
        System.out.println("Nhap so nguyen co 2 chu so: ");
        c = sc.nextInt();
        hangchuc = c / 10;
        donvi = c % 10;
        switch (hangchuc){
            case 1:
                System.out.print("Muoi ");
                break;
            case 2:
                System.out.print("Hai Muoi ");
                break;
            case 3:
                System.out.print("Ba Muoi ");
                break;
            case 4:
                System.out.print("Bon Muoi ");
                break;
            case 5:
                System.out.print("Nam Muoi ");
                break;
            case 6:
                System.out.print("Sau Muoi ");
                break;
            case 7:
                System.out.print("Bay Muoi ");
                break;
            case 8:
                System.out.print("Tam Muoi ");
                break;
            case 9:
                System.out.print("Chin Muoi ");
                break;
            default:
        }

        switch (donvi){
            case 1:
                System.out.print("Mot");
                break;
            case 2:
                System.out.print("Hai");
                break;
            case 3:
                System.out.print("Ba");
                break;
            case 4:
                System.out.print("Bon");
                break;
            case 5:
                System.out.print("Nam");
                break;
            case 6:
                System.out.print("Sau");
                break;
            case 7:
                System.out.print("Bay");
                break;
            case 8:
                System.out.print("Tam");
                break;
            case 9:
                System.out.print("Chin");
                break;
            default:

        }
    }
}
