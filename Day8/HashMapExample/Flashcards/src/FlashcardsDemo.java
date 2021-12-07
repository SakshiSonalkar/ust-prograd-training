import java.util.*;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class FlashcardsDemo {
        public static void main(String[] args) {
            int choice, year, flag = 0;
            String i = "yes", x=" ",a ="yes";
            String battle, input;
            HashMap<String, Integer> flashcards = new HashMap<>();
            flashcards.put("British took over Bombay", 1661);
            flashcards.put("Third Battle of Panipat", 1761);
            flashcards.put("Siege of Vellore", 1782);
            flashcards.put("Siege of Cuddalore", 1782);
            flashcards.put("Battle of Khanwa", 1526);
            flashcards.put("Battle Of Plassey", 1757);
            flashcards.put("battle of HaldiGhati", 1576);
            flashcards.computeIfAbsent("First Battle Of Panipat", k -> 1520 + 6);
            flashcards.computeIfAbsent("Second Battle Of Panipat", k -> 1520 + 36);
            flashcards.computeIfPresent("Battle of Khanwa", (key, value) -> 1527);
            Scanner sc = new Scanner(System.in);
            System.out.println(flashcards);
            System.out.println("----------------------------------------------------------FLASHCARDS------------------------------------------------------------");
            while (!(x.equals("exit"))) {
                System.out.println("1.Make flashcards\n2.Study Flashcards\n3.Take Quiz\n4.Exit");
                choice = Integer.parseInt(sc.nextLine());
                switch (choice) {
                    case 1:
                        while (flag == 0) {
                            System.out.println("Do you want to add cards?(yes/no)");
                            input = sc.nextLine();
                            if (input.equals("no")) {
                                flag = 1;
                            } else {
                                battle = sc.nextLine();
                                year = Integer.parseInt(sc.nextLine());
                                flashcards.putIfAbsent(battle, year);
                            }
                        }
                        System.out.println(flashcards);
                        break;

                    case 2:
                        System.out.println("----------------------------------------------------------STUDY TIME---------------------------------------------------------------------");
                        Set set = flashcards.entrySet();
                        Iterator itr = set.iterator();
                        while(itr.hasNext()){
                            HashMap.Entry<String, Integer> m = (HashMap.Entry)itr.next();
                                System.out.println(m.getKey());
                            try {
                                TimeUnit.SECONDS.sleep(5);
                            } catch (InterruptedException ie) {
                                System.out.println("Interrupted");
                            }
                            System.out.println(m.getValue());
                            System.out.println("Do you want to Continue(yes/no):");
                            a = sc.nextLine();
                            if(a.equals("yes")){
                                continue;
                            }else{
                                break;
                            }
                        }
                        break;


                    case 3:
                        System.out.println("----------------------------------------------------------QUIZ TIME---------------------------------------------------------------------");
                        for (HashMap.Entry<String, Integer> h : flashcards.entrySet()) {
                                System.out.println(h.getKey());
                                year = Integer.parseInt(sc.nextLine());
                                if (h.getValue().equals(year)) {
                                    System.out.println("Correct Answer!!");
                                } else {
                                    System.out.println("Wrong Answer!!");
                                    System.out.println("Do you want to Continue(yes/no):");
                                    i = sc.nextLine();
                                    if(i.equals("yes")){
                                        continue;
                                    }else{
                                        break;
                                    }
                                }
                            }
                        break;

                    case 4:
                        x = "exit";
                        System.out.println("Exiting Menu");
                        break;

                    default:
                        System.out.println("Exiting.......");
                        break;
                }
            }
        }

    }


