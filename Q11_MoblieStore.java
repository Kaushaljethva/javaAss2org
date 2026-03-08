

class Q11_MoblieStore{

    static String storeName = " JK Store";

    static void display(){
        System.out.println("Store Name "+storeName);
    }

    double CalculatePrice(int price){
        return price;
    }

    double CalculatePrice(int price,int qunatity){
        return price*qunatity;
    }

    public static void main(String[] args){
        Q11_MoblieStore m = new Q11_MoblieStore();
        m.display();
        System.out.println("Price " + m.CalculatePrice(1234));
        System.out.println("Price " + m.CalculatePrice(1234,12));
    }
    
}