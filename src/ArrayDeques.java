import java.util.ArrayDeque;

public class ArrayDeques {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad = new ArrayDeque<>();
        ad.addFirst(10);
        ad.addLast(20);
        ad.offerFirst(15);
        System.out.println(ad);
        System.out.println(ad.peekFirst());
        System.out.println(ad.peekLast());
    }
}
