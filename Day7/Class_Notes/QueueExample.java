package Day7;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class QueueExample {
    public static void main(String[] args){
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        ArrayList<Integer> List1 = new ArrayList(List.of(-2,4,5,6));
        dq.add(10);
        dq.add(20);
        dq.addLast(30);
        dq.addFirst(13);
        System.out.println(dq);
        System.out.println(dq.poll());
        System.out.println(dq.peekFirst());
        System.out.println(dq);
        System.out.println(dq.remove(30));
        dq.offerFirst(1);
        dq.addAll(List1);
        System.out.println(dq);

    }
}

