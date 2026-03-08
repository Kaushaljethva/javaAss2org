

class Q16_Unuversity {
    String universityName = "Gujarat Univery";

    void show(){
        System.out.println("University Name :- "+universityName);
    }
}

class Undergraduate extends Q16_Unuversity {
    int marks;

    void show1(){
        if(marks>=50){
            System.out.println("Addminson Eligelbe");
        }
        else{
            System.out.println("Addminson not Eligelbe");
        }
    }
}

class Postgraduate extends Q16_Unuversity {
    int marks;
    
    void show2(){
        if(marks>=50){
            System.out.println("Addminson Eligelbe");
        }
        else{
            System.out.println("Addminson not Eligelbe");
        }
    }
}

class Test{
    public static void main(String[] args){
        Undergraduate u = new Undergraduate();
        u.marks = 67;
        u.show();
        u.show1();

        Postgraduate p = new Postgraduate();
        p.marks = 40;
        p.show();
        p.show2();
    }
}