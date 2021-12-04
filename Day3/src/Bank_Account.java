import java.util.Scanner;


class CustomerDetails {
    private long accNo;
    private String accType;
    private String ifscCode;
    private long balanceAmt;
    private String custName;
    private long depAmt;
    private long withAmt;

    Scanner scanner = new Scanner(System.in);

    public void addCustomer(){
        System.out.println("Enter name of the customer:");
        custName = scanner.next();
        System.out.println("Enter Account number:");
        accNo = scanner.nextLong();
        System.out.println("Enter Account Type:");
        accType = scanner.next();
        System.out.println("Enter IFSC Code:");
        ifscCode = scanner.next();
        System.out.println("Enter balance amount:");
        balanceAmt = scanner.nextLong();
    }

    public void showDetails() {
        System.out.println("Name of the Customer: " + custName);
        System.out.println("Account Number: " + accNo);
        System.out.println("Account Type: " + accType);
        System.out.println("IFSC Code: " + ifscCode);
        System.out.println("Balance Amount: " + balanceAmt);
    }

    public  void depositAmount(){
        System.out.println("Enter Deposit Amount:");
        depAmt = scanner.nextLong();
        balanceAmt = balanceAmt + depAmt;
        System.out.println("Current Balance: " + balanceAmt);
    }

    public void withdrawAmount(){
        System.out.println("Enter Amount to withdraw:");
        withAmt = scanner.nextLong();
        if (withAmt > balanceAmt){
            System.out.println("Insufficient Balance");
        } else {
            balanceAmt = balanceAmt - withAmt;
        }
        System.out.println("Current Balance: " + balanceAmt);
    }

}

 public class Bank_Account {
       public static void main(String[] args){
           CustomerDetails c = new CustomerDetails();
           Scanner sc = new Scanner(System.in);
           int choice;
           long accNo;
           String x=" ";
           while(x!="exit"){
               System.out.println("-------------------------------------------********************---------------------------------------------");
               System.out.println("1.Add new Account holder\n2.Deposit Amount in the Bank\n3.Withdraw Amount\n4.Account Details of the Customer\n5.Exit");
               choice=sc.nextInt();
               switch(choice){
                   case 1:
                       c.addCustomer();
                       break;

                   case 2:
                       c.depositAmount();
                       break;

                   case 3:
                       c.withdrawAmount();
                       break;

                   case 4:
                       c.showDetails();
                       break;

                   case 5:
                        x="exit";
                        break;

                   default:
                       break;
               }
           }

       }
}
