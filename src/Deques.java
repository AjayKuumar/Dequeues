import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class Deques {
    public static void main(String[] args) {
        Deque<Integer> d = new LinkedList<>();
        d.offerFirst(10);
        d.offerFirst(20);
        System.out.println(d.size());
        d.offerLast(30);
        d.pollFirst();
        d.pollLast();
        System.out.println(d.peekFirst());
        System.out.println(d.size());
        System.out.println(d.peekLast());
        d.pollLast();
        System.out.println(d.peekLast());

        //These functions will throw exceptions but same functionality
//        System.out.println(d.getLast());

        d.offerLast(20);
        d.offerFirst(15);
        d.offerLast(45);
        d.offerFirst(10);
        d.offerFirst(30);
        Iterator i = d.iterator();
        while (i.hasNext()) {
            System.out.print(i.next() + " ");
        }
        System.out.println();
        Iterator it = d.descendingIterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
    }
}