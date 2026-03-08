
import java.util.Scanner;

class Q12_Product {
    String ProductNames[];
    double Prices[];
    int size;

    Q12_Product(int size){
            this.size = size;
            ProductNames = new String[size];
            Prices = new double[size];
    }

    void accpetProduct(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Product Details");

        for(int i=0;i<size;i++){
            System.out.println("Enter name for product "+i);
            ProductNames[i] = s.nextLine();

            System.out.println("Enter price for product "+i);
            Prices[i] = s.nextDouble();
            s.nextLine();
        }
        
    }

    void display(){
        
        for(int i=0;i<size;i++){
            System.out.println("Procet name "+ProductNames[i].toUpperCase());
            System.out.println("Proeet Price "+Prices[i]);
        }
    }

    void dimosteexpensive(){
        if(size==0){
            return;
        }

        double maxPrice = Prices[0];
        int index=0;

        for(int i=1;i<size;i++){
            if(Prices[i]>maxPrice){
                maxPrice=Prices[i];
                index = i;
            }
        }

        System.out.println("MostExpensive Product");
        System.out.println("Name"+ProductNames[index].toUpperCase());
        System.out.println("Price"+Prices[index]);
    }

   
}

class Test {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of Prouduct ");
        int n = sc.nextInt();

        Q12_Product p = new Q12_Product(n);
        p.accpetProduct();
        p.display();
        p.dimosteexpensive();
    }
}