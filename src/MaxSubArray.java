import java.util.Deque;
import java.util.LinkedList;

public class MaxSubArray {
    public static void maxSubArrays(int[] arr,int k){
        Deque<Integer> dq = new LinkedList<>();

        //Processing the first sub array
        //At front we only store the maximum element always
        //For this we need to traverse for k and insert always maximum element at first
        for (int i = 0; i < k; i++) {
            while(!dq.isEmpty() && arr[i]>=arr[dq.peekLast()]){
                dq.removeLast();
            }
            dq.addLast(i);
        }
        //Now it's time to process remaining sub arrays
        // For each traversing we need to delete the first element of the sub array if it is less than the i-k
        //Then again we insert the maximum elements at the first until arr[i] the elements in the deque.
        for (int i = k; i < arr.length; i++) {
            System.out.print(arr[dq.peekFirst()]+" ");
            while(!dq.isEmpty() && dq.peekFirst()<=i-k){
                dq.removeFirst();
            }
            while(!dq.isEmpty() && arr[i]>=arr[dq.peekLast()]){
                dq.removeLast();
            }
            dq.addLast(i);
        }

        //At last there is another maximum element left in the deque so print it separately
        System.out.print(arr[dq.peekFirst()]);
    }
    public static void main(String[] args) {
        int[] arr = {20,30,40,10,60};
        maxSubArrays(arr,3);
    }
}
