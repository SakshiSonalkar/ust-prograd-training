 import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CurrencyConverterApp {
    public static void main(String[] args) throws IOException,IllegalArgumentException{
        String x=" ",fromCurrency,toCurrency;
        double convertedAmount;
        double amount;
        int choice;
        CurrencyConverter currencyConverter= new CurrencyConverter();
        Scanner sc = new Scanner(System.in);
        File file = new File("./src/log.txt");
        file.createNewFile();
        FileWriter fileWriter = new FileWriter("log.txt");
        fileWriter.write("Program Started\n");
        System.out.println("------------------------------------------CURRENCY CONVERTER APP------------------------------------------------");
        while(x!="exit"){
            System.out.println("1.Change Currency\n2.Exit");
            choice=sc.nextInt();
            fileWriter.append("User selected option" + choice +" in menu\n");
            switch(choice){
                case 1:
                    System.out.println("You can convert currency to CAD or INR or USD or EUR or GBP");
                    System.out.println("Enter fromCurrency");
                    fromCurrency=sc.next();
                    fileWriter.append("User selected fromCurrency=" + fromCurrency +"\n");
                    System.out.println("Enter the amount to be converted to respective currency: ");
                    amount = sc.nextDouble();
                    fileWriter.append("User entered amount " + amount +"\n");
                    System.out.println("Enter toCurrency");
                    toCurrency=sc.next();
                    fileWriter.append("User selected toCurrency=" + toCurrency +"\n");
                    convertedAmount=currencyConverter.currencyConversion( amount, fromCurrency, toCurrency);
                    System.out.println("Converted Amount: " + convertedAmount);
                    System.out.println("-->" + amount + " " + fromCurrency + " = " + convertedAmount + " " + toCurrency);
                    fileWriter.append("User got the convertedAmount as " + convertedAmount +"\n----->" + amount + " " + fromCurrency + " = " + convertedAmount + " " + toCurrency + "\n");
                    break;
                case 2:
                    x="exit";
                    fileWriter.append("User exited the menu\n");
                    break;
                default:
                    System.out.println("Enter valid option");
                    fileWriter.append("User needs to enter valid option\n");
                    break;
            }
        }
        fileWriter.append("Program Ended");
        fileWriter.close();
    }
}
