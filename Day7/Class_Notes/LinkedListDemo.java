package Day7;
import java.util.List;
import java.util.LinkedList;
import java.util.Iterator;

public class LinkedListDemo {
    public static void main(String[] args){
        LinkedList<String> linkedList = new LinkedList<>();
        LinkedList<String> linkedList1 = new LinkedList<>(List.of("Family","Jeevan","Kamal"));
        linkedList.add("Sakshi");
        linkedList.add("Shruti");
        linkedList.add("Santosh");
        linkedList.addLast("Yogita");
        linkedList.addFirst("Jeevan");
        linkedList.add(1,"Kamal");
        System.out.println(linkedList);
        linkedList.forEach(family-> System.out.println(family));
        linkedList.pollFirst();
        System.out.println(linkedList);
        for(Iterator<String> it = linkedList.descendingIterator();it.hasNext();){
            System.out.println(it.next());
        }
        System.out.println(linkedList.clone());
        System.out.println(linkedList.contains(linkedList1.peekLast()));

        }
}
