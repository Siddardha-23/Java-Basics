import java.util.*;
public class Set {
    public static void main(String[] args) {

        try{
            HashSet<String> hs = new HashSet<String>();
            LinkedHashSet<String> lhs = new LinkedHashSet<String>();

            hs.add("Harshith");
            hs.add("Radha");
            hs.add("Avinash");
            hs.add("Pravachan");
            hs.add("Vishnu");

            lhs.add("Harshith");
            lhs.add("Radha");
            lhs.add("Avinash");
            lhs.add("Pravachan");
            lhs.add("Vishnu");

            Iterator<String> itr = hs.iterator();
            while(itr.hasNext()){
                System.out.print(itr.next() + " ");
            }

            System.out.println();

            for(String s : hs){
                System.out.print(s + " ");
            }

            System.out.println();

            Iterator<String> itr1 = lhs.iterator();
            while(itr1.hasNext()){
                System.out.print(itr1.next() + " ");
            }


            System.out.println();

            hs.remove("Pravachan");
            lhs.remove("Harshith");

            System.out.println(hs);

            System.out.println(lhs);

            HashSet cloned_hashset = (HashSet) hs.clone();

            System.out.println(cloned_hashset);

        }
        catch (Exception e){
            System.out.println("An exception occured");
        }
    }
}
