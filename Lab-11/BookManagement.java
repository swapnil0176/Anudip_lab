package thursdayLab11;

import java.util.ArrayList;
import java.util.Scanner;

public class BookManagement {
    String book_name,book_author;
    int book_id;
    BookManagement(int book_id,String book_name,String book_author){
        this.book_id=book_id;
        this.book_name=book_name;
        this.book_author=book_author;
    }
    ArrayList<BookManagement> book=new ArrayList();
    Scanner sc= new Scanner(System.in);

    public BookManagement() {}

    void addBook(){
        System.out.println("Enter book id");
        book_id=sc.nextInt();//accept book id
        System.out.println("Enter book name");
        book_name=sc.next();//accept book name
        System.out.println("Enter book author");
        book_author=sc.next();//accept book author
        book.add(new BookManagement(book_id,book_name,book_author));
    }
    void displayBooks(){
        System.out.println("Book Details");
        for(BookManagement b: book){
            System.out.println("Id:- "+b.book_id+"\tName:- "+b.book_name+"\tAuthor:- "+b.book_author);
        }
    }
    void updateBook(){
        boolean flag=false;
        System.out.println("Enter book id to modify");
        int id= sc.nextInt();//accept id from user
        for(BookManagement b:book){
            if(b.book_id==id) {//search id in arraylist
                System.out.println("Enter book name");
                b.book_name=sc.next();//update name of book
                System.out.println("Enter book author");
                b.book_author=sc.next();//update book author
                System.out.println("Enter book id");
                b.book_id=sc.nextInt();//update book id
                flag=true;
                break;
            }
        }
        if(flag){
            System.out.println("Information is updated");
        }
        else
            System.out.println("book id NOT found");
    }
    public void displayMenu(){
        do {
            System.out.println("  Menu  \n" +
                    "1)Add Book" +
                    "\n2)Display Books" +
                    "\n3)Update detail" +
                    "\n4)Exit");
            System.out.println("Enter choice");
            int ch= sc.nextInt();
            switch (ch)
            {
                case 1: 
                	addBook();//call add book information function
                	break;
                case 2:
                	displayBooks();
                	break;  //call display information function
                case 3:
                	updateBook();
                	break;//call update function to modify details
                case 4:
                	System.exit(0);
                	break;
                default :
                	System.out.println("Enter valid case ");
            }
        }while(true);
    }
    public static void main(String[] args) {
       BookManagement b  =new BookManagement();
        b.displayMenu();//call to menu method
    }
}

