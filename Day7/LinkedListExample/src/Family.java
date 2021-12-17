import java.util.List;
import java.util.LinkedList;
import java.util.Iterator;
public class Family {
        public static void main(String[] args){
            LinkedList<String> linkedList = new LinkedList<>();
            LinkedList<String> linkedList1 = new LinkedList<>(List.of("Family","Jeevan","Kamal"));
            linkedList.add("Sakshi");
            linkedList.add("Shruti");
            linkedList.add("Santosh");
            linkedList.addLast("Yogita");
            linkedList.addFirst("Jeevan");
            linkedList.add(1,"Kamal");
            linkedList1.remove("Family");
            System.out.println(linkedList);
            linkedList.forEach(family-> System.out.println(family));
            System.out.println("Retrieving and removing the first element of LinkedList--->" + linkedList.pollFirst());
            System.out.println(linkedList);
            for(Iterator<String> it = linkedList.descendingIterator();it.hasNext();){
                System.out.println(it.next());
            }
            System.out.println("Printing clone of linkedList1(elders of family): " + linkedList1.clone());
            System.out.println("LinkedList contains Kamal?----->" + linkedList.contains(linkedList1.peekLast()));

        }
    }


