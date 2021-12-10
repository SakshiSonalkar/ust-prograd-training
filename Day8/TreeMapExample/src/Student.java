import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class Student {
    public static void main(String[] args) {
        TreeMap<Integer, String> student = new TreeMap<>();
        student.put(101, "Sakshi");
        student.put(102, "Shruti");
        student.put(103, "Jessi");
        student.put(104, "Vaishnavi");
        student.put(105, "Dolly");
        student.put(106, "Anaya");
        System.out.println("Attendance in Ascending Order");
        for (Map.Entry<Integer, String> m : student.entrySet()) {
            System.out.println(m.getKey() + " -> " + m.getValue());
        }
        System.out.println("Attendance in Descending Order");
        NavigableMap newStudentMap = student.descendingMap();
        System.out.println(newStudentMap);
        System.out.println();
        System.out.println("First two students of the class:  "+student.headMap(103));
        System.out.println("Students between roll no.-102 and roll no.-105 "+student.subMap(103,105));
        System.out.println("Last two students of the class:  "+student.tailMap(105));
    }
}
