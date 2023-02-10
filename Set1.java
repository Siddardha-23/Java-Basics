import java.util.*;
public class Set1 {
    public static void main(String[] args) {

        TreeSet<Integer> ts = new TreeSet<Integer>();
        HashSet<Integer> hs = new HashSet<Integer>();

        ts.add(111);
        ts.add(62);
        ts.add(34);
        ts.add(75);

        hs.add(111);
        hs.add(62);
        hs.add(34);
        hs.add(75);

        System.out.println(ts);

        System.out.println(hs);

        System.out.println(ts.ceiling(33));

        System.out.println(ts.floor(22));

        System.out.println(ts.isEmpty());

        ts.remove(111);

        System.out.println(ts);
    }
}
