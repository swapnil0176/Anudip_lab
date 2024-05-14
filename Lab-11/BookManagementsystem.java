//Write an application to create a book managment system to do the following process :
//
//Add book
//
//Update book
//
//Delete book
//
//add author to each by using collection framwork.



package thursdayLab11;


import java.util.*;
public class BookManagementsystem 
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
					+ "2) Update book\n"
					+ "3) Delete book\n"
					+ "4) Exit"
					+ "\nEnter your choice=");
			choice=sc.nextInt();
			switch(choice)
			{
				case 1:
					addBook();
					break;
					
				case 2:
					updateBook();
					break;
					
				case 3:
					deleteBook();
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
	
	public void updateBook()
	{
		
	}
	
	public void addBook() {
		System.out.println("\nEnter your favourite Book name: ");
		book=sc.next();
		books.add(book);
		
	}
	public static void main(String[] args)
	{
		BookManagementsystem b=new BookManagementsystem();
		b.choices();
	}
}