import java.util.Scanner;
public class Q6_Account {
    int accountNumber;
    double balance;

    void showAccount(){
        System.out.println("AccountNumber "+accountNumber);
        System.out.println("Balance "+balance);
    }
}

class Transcation extends Q6_Account {
    double withdrawAmount;

    void withdraw(){
        if(withdrawAmount<=balance){
            System.out.println("Allow to Withdraw "+withdrawAmount);
        }
        else{
            System.out.println("Insufficient Amount "+withdrawAmount);
        }
    }
}

class Test{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        Transcation t = new Transcation ();
        System.out.println("Enter acconunaumner ");
        t.accountNumber = s.nextInt();

        System.out.println("Enter balacne");
        t.balance = s.nextDouble();

        System.out.println("Enter withdraw Amont");
         t.withdrawAmount = s.nextDouble();
        
        t.showAccount();
        t.withdraw(); 


    }
}