public class BT_ThuatToan_HackerRank {
    public static void main(String[] args) {
        int x = 4;
        int y = 2;
        int s = 11;
        System.out.println(findMin(x,y,s));
    }
    public static int findMin(int x, int y, int s) {
        // Write your code here
        int k=0;
        while (s > x){
            k += x;
            s = s - x -y;
        }
        if (s > 0){
            return k + s;
        }
        else
            return k;
    }
}
