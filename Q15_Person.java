
class Q15_Person {
    String name;
    int age;

    void showDetails(){
        System.out.println("Person Name is : - "+ name);
        System.out.println("Person Age is : - "+ age);
    }
}

class Student extends Q15_Person {
    int rollNo;

    void showDetails(){
        super.showDetails();

        System.out.println("Student Rollno : - "+rollNo);
    }
}

class Result extends Student{
    int marks;
    String grade;

    void calculateGrade(){
        

        
       
       if(marks>=80){
        grade="A";
       }
       else if(marks>=60){
        grade="B";
       }
       else if(marks>=40){
        grade = "c";
       }
       else{
        grade = "Fail";
       }
    }

    void showDetails(){
        super.showDetails();
        System.out.println("Marks :- "+marks);
        System.out.println("Grade is : - " +grade);
    }
}

class Test{
    public static void main(String[] args){
        Result r = new Result();
        r.name = "Kaushal";
        r.age = 19;
        r.rollNo = 2119;
        r.marks = 79;
        r.calculateGrade();
        r.showDetails();
        
    }
}