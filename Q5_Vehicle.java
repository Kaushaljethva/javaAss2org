import java.util.Scanner;
public class Q5_Vehicle {
    String vehicleName;
    double rentPerDay;

    void showVehicle(){
        System.out.println("VehicleName "+vehicleName);
        System.out.println("RentPerDay "+rentPerDay);
    }
}

class Car extends Q5_Vehicle {
    int day;
    double totalRent;
    double discount;

    void showCar(){
        super.showVehicle();
        totalRent = rentPerDay*day;

        if(day>=7){
            
            discount = totalRent*0.15;
            System.out.println("Day Grater then 7 so discount " +discount);

        }
        else{
            System.out.println("Nothing Discount");
        }

        System.out.println("total Rent Without Discount "+totalRent);
        totalRent = totalRent - discount;
        System.out.println("After Discount "+totalRent);
    }
}

class Bike extends Q5_Vehicle {
    int day;
    double totalRent;
    double discount;

    void showBike(){
        super.showVehicle();
        totalRent = rentPerDay*day;

        if(day>=5){
            
            discount = totalRent*0.10;
            System.out.println("Day Grater then 7 so discount " +discount);

        }
        else{
            System.out.println("Nothing Discount");
        }
        System.out.println("total Rent Without Discount "+totalRent);
        totalRent = totalRent - discount;
        System.out.println("After Discount "+totalRent);
    }
}

class Test{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter vehilc name for car :");
        
        Car c = new Car();
        c.vehicleName = s.nextLine();
        c.rentPerDay = 1000;
        c.day = 7;
        c.showCar();

        Bike b = new Bike();
        b.vehicleName = "Hero";
        b.rentPerDay = 200;
        b.day =2;
        b.showBike();

    }
}