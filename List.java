import java.util.*;
import java.io.*;

public class List {

    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<Integer>();
        ArrayList<Integer> al2 = new ArrayList<Integer>();
        LinkedList<Integer> ll = new LinkedList<Integer>();
        Vector<Integer> v = new Vector<Integer>();
        Stack<String> stack = new Stack<String>();

        for (int i = 5; i <= 10; i++) {
            al.add(i);
            ll.add(i);
            v.add(i);
        }

        stack.push("E-1");
        stack.push("E-2");
        stack.push("E-3");
        stack.push("E-4");

        for (int i = 1; i < 5; i++) {
            al2.add(i);
        }

        al2.addAll(al);
        al.clear();

        Iterator<Integer> iterator = al2.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

        System.out.println();
        System.out.println(al.isEmpty());
        System.out.println("Size " + al2.size() + " Minimum " + Collections.max(al2, Collections.reverseOrder()) + " Maximum " + Collections.max(al2));
        System.out.println(al2.contains(8) + " " + al2.contains(11));
        System.out.println(al2.hashCode());
        ll.remove(3);
        v.remove(2);

        for (int i = 0; i < ll.size(); i++) {
            System.out.print(ll.get(i) + " ");
        }

        System.out.println();

        for (int i = 0; i < v.size(); i++) {
            System.out.print(v.get(i) + " ");
        }

        System.out.println();

        Iterator<String> itr = stack.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        System.out.println();
        stack.pop();

        itr = stack.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        System.out.println();
        System.out.println(stack.empty() + " " + stack.search("E-2") + " " + stack.peek() + " " + stack.size());
    }
}
