import java.util.Map;
import java.util.TreeMap;

public class BT_Buoi18_ThuatToan {
    public static void main(String[] args) {
        String s = "2 3 2 4 5 2 3 5";
        if (checkCountElement(s)){
            System.out.println("1");
        }
        else {
            System.out.println("0");
        }
    }
    public static boolean checkCountElement(String s) {
        // Write your code here
        boolean bool=true;
        String[] a = s.split("\\s");
        TreeMap<String, Integer> map = new TreeMap<String, Integer>();
        for (int i = 0; i < a.length; i++) {
            if (map.containsKey(a[i])){
                int count = map.get(a[i]) + 1;
                map.put(a[i],count);
            }
            else {
                map.put(a[i],1);
            }
        }
        int k = map.get(map.firstKey());
        for (String key : map.keySet()){
            if (k != map.get(key)){
                bool = false;
                break;
            }
        }
        return bool;
    }
}
