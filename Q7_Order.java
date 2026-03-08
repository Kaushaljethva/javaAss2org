
abstract class Q7_Order{

    int oid;
    String pname;
    int qunatity;
    double price;

    abstract void displaydetalis();
    
}

abstract class Payment{
    double amount;

    abstract void processpayment();
}

class CreditCard extends Payment{
    void processpayment(){
        // amount = price*qunatity;
        
        System.out.println("Total Payment  " + amount );
    }
}

class PayPalPayment extends Payment{
    void processpayment(){
    //  amount = price*qunatity;
        
     System.out.println("Total Payment  " + amount );
    }
}

class Orderdetails extends Q7_Order{  
    void displaydetalis(){
        System.out.println("Order id "+ oid);
        System.out.println("Product Name " + pname);
        System.out.println("Qunatity " + qunatity);
        System.out.println("Price " + price);
    }
}

class PaymentMethod extends Payment{
    
    void processpayment(){
        // amount = price*qunatity;
        
        System.out.println("Total Payment is " + amount );
    }
}

class test{
    public static void main(String[] args){
        Orderdetails o = new Orderdetails();
        o.oid = 12;
        o.pname = "Machine";
        o.qunatity = 3;
        o.price = 2345.5;
        o.displaydetalis();

        Payment p = new CreditCard();
        p.amount = o.price * o.qunatity;
        p.processpayment();
    }
}

