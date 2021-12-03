import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;

public class Streams_FP {
    public static void main(String[] args){
        ArrayList<Integer> marks = new ArrayList<>(List.of(90,96,83,99,80,76));
        ArrayList<Integer> num = new ArrayList<>(List.of(8,9,10,30,40));
        marks.stream()
                .filter(x -> x>80)    //filters out elements less than 80
                .sorted()    // intermediate - filter,sorted,skip,findFirst,map
 //               .skip(3)      // skips
//                .forEach(m -> System.out.println(m))
                .findFirst()
                .ifPresent(System.out::println);
        int sum = marks.stream()
                .mapToInt(i->i)
                .sum();
        System.out.println(sum);


        IntSummaryStatistics summaryStatistics = num.stream()
                .mapToInt(i->i)
                .summaryStatistics();
        System.out.println(summaryStatistics);
        System.out.println(summaryStatistics.getMax());

        num.stream()
                .mapToInt(i->i)
  //              .average()
 //               .ifPresent(System.out::println);
                .map(x -> x*x)
                .forEach(m -> System.out.println(m));








    }
}
