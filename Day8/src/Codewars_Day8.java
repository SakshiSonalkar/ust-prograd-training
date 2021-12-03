import java.util.*;

class Dictionary {
    Map<String,String> map;
    public Dictionary(){
        map = new HashMap<>();
    }

    public void newEntry(String key, String value){
        map.put(key,value);
    }

    public String look(String key){
        if (map.containsKey(key)){
           String s1=map.get(key);
            return s1;
        }
        else{
            String s = "Cant find entry for " + key;
            return s;
        }
    }
}
public class Codewars_Day8 {
    public static void main(String[] args){
       Dictionary d = new Dictionary();
       String x=" ";
       String key,value;
       Scanner scanner = new Scanner(System.in);


      while(x!="exit"){
         System.out.println("-----------------------***************-----------------------\n1.New entry in the dictionary\n" +
                   "2.Look at the available entry\n3.Close the menu ");
           int choice = Integer.parseInt(scanner.nextLine());
           switch(choice){
               case 1:
                   key=scanner.nextLine();
                   value=scanner.nextLine();
                   d.newEntry(key,value);
                   break;
               case 2:
                   key=scanner.nextLine();
                   System.out.println(d.look(key));
                   break;
               case 3:
                   x="exit";
                   System.out.println("Exiting....");
                   break;
               default:  break;

           }
       };
    }
}
