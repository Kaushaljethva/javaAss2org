
import java.util.Scanner;

class Q14_Library {

    String bookNames[];
    String authorNames[];
    int totalBooks;

    Q14_Library(int totalBooks){
        this.totalBooks = totalBooks;
        bookNames = new String[totalBooks];
        authorNames = new String[totalBooks];
    }

    void accpetBooks(){

        Scanner s = new Scanner(System.in);
        System.out.println("----------------ENter the Details---------------");

        for(int i=0;i<totalBooks;i++){
            System.out.println("Enter booknames :- "+i);
            bookNames[i] = s.nextLine();

            System.out.println("Enter Book Authors Name :- "+i);
            authorNames[i] = s.nextLine();
        }
    }

    void display(){
        for(int i=0;i<totalBooks;i++){
        System.out.println("BookName is :- " + bookNames[i]);
        System.out.println("Book Authors Name is  :- " +authorNames[i]);
    }
    }

    void serchbooks(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter book Name :- ");
        String serchbook = s.nextLine();
        int count =0 ;

        for(int i=0;i<totalBooks;i++){
            if(bookNames[i].equalsIgnoreCase(serchbook)){
                count++;
            }
        }

        System.out.println("This boook" + serchbook + " " + "Number is "+count);
    }

    void serchAuthors(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Authors Name : ");
        String serchauthor = s.nextLine();
        int count =0;

        for(int i=0;i<totalBooks;i++){
            if(authorNames[i].equalsIgnoreCase(serchauthor)){
                count++;
            }
        }

        System.out.println("This boook authors" + serchauthor + " " + "Number is "+count);
        
    }
}

class Test{
    public static void main(String[] args){
        Scanner s =new Scanner(System.in);
        System.out.println("Enter total Number of Books : -");
        int n = s.nextInt();

     Q14_Library b = new Q14_Library(n);
     b.accpetBooks();
     b.display();
     b.serchbooks();
     b.serchAuthors();

    }
}