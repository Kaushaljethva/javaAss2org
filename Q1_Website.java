
public class Q1_Website{
        String websiteName = "Amazon";

        void showWebsite(){
            System.out.println("Website name " + websiteName);
        }
}

class Product extends Q1_Website{
    String productName = "Moblie";
    double price = 1500;

    void showProduct(){
        System.out.println("Prodcuname " + productName);
        System.out.println("Price "+price);
    };

}

class Order extends Product{
    int quantity = 1;
    double totalAmount;
    double deliveryCharge;

    void showOrder(){
    totalAmount = price*quantity;
    System.out.println("Total Amount " + totalAmount);
    
    if(totalAmount>=2000){
        deliveryCharge=0;
        System.out.println("Free Deleviry");
    }
    else{
        deliveryCharge=100;
        System.out.println("Delivery charge 100");
    }
    totalAmount = totalAmount + deliveryCharge;
     System.out.println("Total Amount " + totalAmount);
}
}

 class Test{
public static void main(String[] args){
    Order obj = new Order();
    obj.showWebsite();
    obj.showProduct();
    obj.showOrder();
    
 }
}