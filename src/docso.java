import java.util.Scanner;

public class docso {
    //+ Viết chương trình nhập 1 số nguyên có 3 chữ số.
//Hãy in ra cách đọc của số nguyên này
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, hangtram, hangchuc, donvi;
        System.out.println("Nhap a la so co 3 chu so: ");
        a = sc.nextInt();
        hangtram = a / 100;
        hangchuc = (a - hangtram * 100) / 10;
        donvi = a - hangtram * 100 - hangchuc * 10;
        if (a < 100 || a > 999) {
            System.out.println("Vui long nhap so co 3 chu so");
            System.exit(0);
        }
        switch (hangtram) {
            case 1:
                System.out.print("Mot Tram ");
                break;
            case 2:
                System.out.print("Hai Tram ");
                break;
            case 3:
                System.out.print("Ba Tram ");
                break;
            case 4:
                System.out.print("Bon Tram ");
                break;
            case 5:
                System.out.print("Nam Tram ");
                break;
            case 6:
                System.out.print("Sau Tram ");
                break;
            case 7:
                System.out.print("Bay Tram ");
                break;
            case 8:
                System.out.print("Tam Tram ");
                break;
            case 9:
                System.out.print("Chin Tram ");
                break;
            default:

        }
        switch (hangchuc) {
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
        switch (donvi) {
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
