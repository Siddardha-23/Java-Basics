import java.util.*;
public class HMap {
    public static void main(String[] args) {

        HashMap<Integer, String> hm = new HashMap<Integer, String>();

        hm.put(1, "Geeks");
        hm.put(2, "For");
        hm.put(3, "Geeks");

        for(int i = 1; i <=3; i++){
            System.out.print(hm.get(i) + " ");
        }

        System.out.println();

        for (Map.Entry<Integer, String> e : hm.entrySet())
            System.out.println(e.getKey() + " " + e.getValue());

        System.out.println(hm.size());
    }
}
