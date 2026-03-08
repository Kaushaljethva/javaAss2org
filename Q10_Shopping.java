
class Q10_Shopping{

    double total = 0;

    double CalculateBill(int price,int quantity){
        return price*quantity;
    }

    double CalculateBill(int price , int qunatity , double discount){
        total= price*qunatity;
        if(qunatity>10){
            discount = total*0.10;
            
        }

        total = total-discount;
        return total;

        
    }

    double CalculateBill(double price){
        return price;
    }

    public static void main(String[] args){
        Q10_Shopping s = new Q10_Shopping();
        System.out.println("Total " + s.CalculateBill(122,12));
         System.out.println("Total " + s.CalculateBill(122,12,0));
          System.out.println("Total " + s.CalculateBill(122.8));


    }
}

