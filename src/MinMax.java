import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

class MyDs{
    Deque<Integer> ad;
    MyDs(){
        ad = new LinkedList<>();
    }
    void insertMin(int x){
        if(ad.isEmpty()||ad.peekFirst()>x){
            ad.offerFirst(x);
        }
    }
    void insertMax(int x){
        if (ad.isEmpty() || ad.peekLast()<x){
            ad.offerLast(x);
        }
    }
    int getMin(){
        return ad.peekFirst();
    }
    int getmax(){
        return ad.peekLast();
    }
    void extractMin(){
        if (ad.isEmpty()){
            return ;
        }
        ad.pollFirst();
    }
    void extractMax(){
        if (ad.isEmpty()){
            return;
        }
        ad.pollLast();
    }
}
public class MinMax {
    public static void main(String[] args) {
        //It is similar like ArrayDeque but changing the functions insretFornt to insertMin
        //We assume x is smaller than front or greater than last
        MyDs ds = new MyDs();
        ds.insertMax(20);
        ds.insertMin(10);
        ds.insertMin(5);
        ds.insertMax(30);
        ds.insertMax(25);
        System.out.println(ds.getmax());
    }
}
