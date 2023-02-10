import java.util.*;
public class Queue {

    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        ArrayDeque<Integer> ad = new ArrayDeque<Integer>();
        pq.add(27);
        pq.add(25);
        pq.add(30);
        pq.add(40);
        ad.addFirst(10);
        ad.addFirst(20);
        ad.addLast(40);
        ad.addLast(30);
        Iterator<Integer> itr = pq.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next() + " ");
        }

        System.out.println();

        Iterator<Integer> itr1 = ad.iterator();
        while(itr1.hasNext()){
            System.out.print(itr1.next() + " ");
        }

        //PriorityQueue
//        System.out.println(pq);
        System.out.println();
        System.out.println(pq.peek());
        System.out.println(pq.poll());
        System.out.println(pq.peek());
        pq.remove(30);
        System.out.println(pq.contains(30));
        System.out.println(pq);

        //ArrayDeque
        ad.removeFirst();
        ad.removeLast();
        System.out.println(ad);
    }
}
