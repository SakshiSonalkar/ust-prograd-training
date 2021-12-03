import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamString {
        public static void main(String[] args){
            ArrayList<String> str1 = new ArrayList<String>(List.of("pink","red","blue","black","yellow"));
            ArrayList<String> str2 = new ArrayList<>(List.of("troye","selena","weekend","ariana","halsey"));
            String mergedList;
            str1.stream()
                    .filter(x->x.startsWith("b"))
                    .sorted()
                    .forEach(m-> System.out.println(m));
            mergedList = str2.stream().filter(string -> !string.isEmpty()).collect(Collectors.joining(" "));
            System.out.println("Merged String: " + mergedList);

}
}