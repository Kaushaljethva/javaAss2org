
public class Q2_Student{
    String studentName = "Kaushal";
    int rollNo = 2119;
    int marks = 80;

    void showStudent(){
        System.out.println("Student Name "+studentName );
        System.out.println("Student Rollno "+rollNo);
        System.out.println("Student Marks "+marks);
    }

}

class Result extends Q2_Student{
    String grade;

   public void calculateGrade(){
        if(marks>=75){
            grade = "Distinctin";
       
            
            
        }
        else if(marks>=60){
            grade = "First Class";
          
        }
        else if(marks>=50){
            grade = "Second Class";
          

        }
        else{
           grade = "Fail";
        }

        
    }
     void showResult(){
        System.out.println("Grade is "+grade);
        }
}

class Test{
    public static void main(String[] args){
        Result obj = new Result();
        obj.showStudent();
        obj.calculateGrade();
        obj.showResult();
        
    }
}