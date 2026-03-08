
abstract class Q4_Employee {
    String empName;
    double basicSalary;

    abstract void calculateSalray();
}

class FullTimeEmployee extends Q4_Employee {
    double bonus;

    void calculateSalray(){
        if(basicSalary>=30000){
            bonus = 5000;
          
        }
        else{
            bonus=2000;
           
        }
    
    basicSalary = basicSalary +bonus;
    System.out.println("Ename "+empName);
     System.out.println("Bouns "+bonus);
    System.out.println("Basci Salary "+basicSalary);
    }

    

}

class PartTimeEmployee extends Q4_Employee {
    int hoursWorked;
    double hourlyRate;

    void calculateSalray(){
        double salary = hoursWorked * hourlyRate;
         System.out.println("Ename "+empName);
         System.out.println("Salry "+salary);

    }
}

class Test{
    public static void main(String[] args){
        FullTimeEmployee f = new FullTimeEmployee();
        f.empName = "Kaushal";
        f.basicSalary= 10000;
        f.calculateSalray();

        PartTimeEmployee p = new PartTimeEmployee();
        p.empName = "Jethva";
        p.hoursWorked = 6;
        p.hourlyRate = 600;
        p.calculateSalray();

    }
}