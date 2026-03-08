
import java.util.Scanner;
class Q13_Course {
    String studentNames[];
    String courseNames[];
    int num;

     Q13_Course (int num){
        this.num = num;
        studentNames= new String[num];
        courseNames  = new String[num];

    }

    void acceptDetails(){

        Scanner s = new Scanner(System.in);
        System.out.println("Enter details");

        for(int i=0;i<num;i++){
            System.out.println("Enter Student name : "+i);
            studentNames[i] = s.nextLine();

            System.out.println("Enter student Corse : "+i);
            courseNames[i] = s.nextLine();

        
        }
    }

    void display(){
        for(int i=0;i<num;i++){
            System.out.println("Studet Name "+studentNames[i]);
            System.out.println("Course Name :"+courseNames[i]);
        }
    }

    void countStudentsinCourse(){
        int count =0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Course Name");

        String serchcourse = s.nextLine();

        for(int i=0;i<num;i++){
            if(courseNames[i].equalsIgnoreCase(serchcourse)){
                count++;
            }
        }

        System.out.println("Total students enrool in " +serchcourse + " " + count);
    }
}

class Test{
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter total number of students ");
        int n = s.nextInt();

        Q13_Course obj = new Q13_Course(n);
        obj.acceptDetails();
        obj.display();
        obj.countStudentsinCourse();

        s.close();
    }
}