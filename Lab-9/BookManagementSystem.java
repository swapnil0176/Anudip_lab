/*3. write a program to create Book management system.using linked list
create class name Book,and perform following actions:
Attributes:
bookid,bookName,bookPrice,authorName,library name(static),availability
method:
createBook() will store book details.(add  3 books).
deleteBook() will delete book by Id
displayBook()will display book details
*/

package thursdayLab9;

import java.util.*;
public class BookManagementSystem 
{
	String book;
	Scanner sc=new Scanner(System.in); 
	LinkedList<String> books=new LinkedList<>();
	public void choices()
	{
		int choice;
		do
		{
			System.out.print("*********** Operations ***********\n"
					+ "1) Insert book\n"
					+ "2) Delete book\n"
					+ "3) Display book\n"
					+ "4) Exit"
					+ "\nEnter your choice=");
			choice=sc.nextInt();
			switch(choice)
			{
				case 1:
					inserteBook();
					break;
					
				case 2:
					deleteBook();
					break;
					
				case 3:
					displayBook();
					break;
					
				case 4:
					System.exit(0);
					break;
					
					default:
						System.out.println("\nEnter your choice");
			}
		}while(true);
	}
	public void displayBook() {
		if(book.isEmpty())
		{
			System.out.println("Kindly add items first");
		}
		else
		{
			System.out.println("My Items are: ");
		}
		Iterator it_list=books.iterator();
		while(it_list.hasNext())
		{
			System.out.println(it_list.next());
		}
		
	}
	public void deleteBook() {
		System.out.println("\nEnter your book: ");
		book=sc.next();
		books.remove(book);
		
	}
	public void inserteBook() {
		System.out.println("\nEnter your favourite Book name: ");
		book=sc.next();
		books.add(book);
		
	}
	public static void main(String[] args)
	{
		BookManagementSystem b=new BookManagementSystem();
		b.choices();
	}
}