
public class Q3_Account {
    String accountHolderName ;
    double balance ;

    void showDetails(){
        System.out.println("Holder Name "+accountHolderName);
        System.out.println("Balnce "+balance);
    }
}

class SavingsAccount extends Q3_Account {
    double interestRate ;

    void showDetails(){
        super.showDetails();
        if(balance>=5000){
            interestRate = balance * interestRate/100;
            System.out.println("Cutting To interet "+interestRate);
        }
        else{
            System.out.println("No inteste balcne less than 5000");
        }
    }

   
}

class CurrentAccount extends Q3_Account {
    double withdrawalAmount;

    void showDetails(){
        super.showDetails();
        if(balance>=withdrawalAmount){
            System.out.println("Suceesfull to withdraw "+withdrawalAmount);
        }
        else{
            System.out.println("Insufficient Balcne ");
        }
    }

}

class Test{
    public static void main(String[] args){
        
        
        SavingsAccount s = new SavingsAccount();

        s.accountHolderName = "Jethva";
        s.balance = 50000;
        s.interestRate = 5;
        s.showDetails();

        CurrentAccount c = new CurrentAccount();
        c. accountHolderName = "Kaushal";
        c.balance = 20000;
        c.withdrawalAmount = 6000;
        c.showDetails();
        

    }
}