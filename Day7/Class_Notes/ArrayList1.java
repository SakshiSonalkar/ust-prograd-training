//ClassDemo

package Day7;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class ArrayList1 {
  public static void main(String [] args){
      ArrayList<Integer> arrayList = new ArrayList<>(20);
      ArrayList<Integer> arrayList1 = new ArrayList<>(List.of(10,20,30,40,50,60,70,80,90));
      arrayList.add(1);
      arrayList.add(1,2);
      arrayList.add(2);
      arrayList.add(3);
      arrayList.addAll(arrayList1);
      System.out.println(arrayList);

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }

        for (Integer x:arrayList) {
            System.out.println(x);
        }

        for (Iterator<Integer> it = arrayList.iterator();it.hasNext();) {
            System.out.println(it.next());
        }

  }


    }

