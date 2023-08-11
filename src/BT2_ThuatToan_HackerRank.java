public class BT2_ThuatToan_HackerRank {
    public static void main(String[] args) {
        String e = "3 5 2 7 1 1";
        int n = 7;
        System.out.println(getMoneyInvestment(e,n));
    }
    public static int getMoneyInvestment(String e, int n) {
        // Write your code here
        String a [] = e.split("\\s");
        int k = n - Integer.parseInt(a[0]) + Integer.parseInt(a[1]);
        if (a.length == 2){
            return n - Integer.parseInt(a[0]) + Integer.parseInt(a[1]);
        }
        else {
            for (int i = 0; i < a.length; i = i+2) {
                for (int j = i+1; j < a.length; j = j+2){
                    if (k < n - Integer.parseInt(a[i]) + Integer.parseInt(a[j])){
                        k = n - Integer.parseInt(a[i]) + Integer.parseInt(a[j]);
                    }
                }
            }
            return k;
        }
    }
}
