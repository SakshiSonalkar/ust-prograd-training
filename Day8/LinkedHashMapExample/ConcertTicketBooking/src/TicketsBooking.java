//LinkedHashMap example

import java.util.*;

public class TicketsBooking {
    public static void main(String[] args) {
        int choice,n,key;
        String x=" ",value=" ";
        Scanner sc = new Scanner(System.in);
        LinkedHashMap<Integer, String> bookseat = new LinkedHashMap<>();
        System.out.println("-------------------------------------------SWEETENER TOUR---------------------------------------------");
        bookseat.put(1, "Sakshi");
        bookseat.put(2, "Shruti");
        bookseat.put(3, "Anaya");
        bookseat.put(4, "Vaishali");
        bookseat.put(5, "Abhilasha");
        bookseat.putIfAbsent(6, "Sumaira");
        bookseat.put(7, "Amruta");
        bookseat.put(11, "Tom");
        bookseat.put(12, "Lucy");
        bookseat.put(13, "Elen");
        bookseat.put(14, "Varun");
        bookseat.put(15, "Thomas");
        bookseat.putIfAbsent(16, "Sara");
        for (Map.Entry<Integer, String> m : bookseat.entrySet()) {
            System.out.println(m.getKey() + " -> " + m.getValue());
        }

        while (!(x.equals("exit"))) {
            System.out.println("----------------------------*********************************----------------------------------");
            System.out.println("1.Book Concert Ticket\n2.Cancel Ticket\n3.Display Booked Seats\n4.Exit");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Enter the no. of tickets to be booked:");
                    n = Integer.parseInt(sc.nextLine());
                    for(int i =0;i<n;i++){
                        System.out.println("Enter Available Seat no.:");
                        key = Integer.parseInt(sc.nextLine());
                        System.out.println("Enter Name:");
                        value = sc.nextLine();
                        if(!(bookseat.containsKey(key))){
                            bookseat.put(key,value);
                        }
                    }
                    break;

                case 2:
                    System.out.println("Cancel Ticket and make your seat available for some other fan to enjoy the concert!!");
                    System.out.println("Enter the no. of tickets to be cancelled:");
                    n = Integer.parseInt(sc.nextLine());
                    for(int i =0;i<n;i++){
                        System.out.println("Enter Seat no.:");
                        key = Integer.parseInt(sc.nextLine());
                        System.out.println("Enter Name:");
                        value = sc.nextLine();
                        if(bookseat.containsKey(key)){
                            bookseat.remove(key,value);
                        }
                    }
                    break;

                case 3:
                    System.out.println("--------------------------------------Seats Booked-------------------------------------------");
                    for (Map.Entry<Integer, String> m : bookseat.entrySet()) {
                        System.out.println(m.getKey() + " -> " + m.getValue());
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
