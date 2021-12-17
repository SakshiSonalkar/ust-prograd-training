import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExample {
        public static void main(String[] args) {
            ArrayList<String> fruits = new ArrayList<String>(List.of("Kiwi","Watermelon"));
            fruits.add("Orange");
            fruits.add("Apple");
            fruits.add("Banana");
            fruits.add("Pineapple");
            fruits.add(3,"Mango");
            Collections.sort(fruits);
            System.out.println("Sorting in ascending order: " + fruits);
            System.out.println("Get apple from Arraylist--> o/p- " + fruits.get(0));
            fruits.add(fruits.indexOf("Orange"),"Jackfruit");
            System.out.println(fruits);
            ArrayList<String> subList = new ArrayList<>(fruits.subList(1,5));
            System.out.println("Elements of sublist:");
            for (String fruit : subList) {
                System.out.println(fruit);
            }
            Collections.sort(fruits,Collections.reverseOrder());
            System.out.println("Sorting in descending order: " + fruits);

        }
}

