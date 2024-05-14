package com.lab13;
import java.util.*;// Scanner class Library
import java.sql.DriverManager;//Library For Driver Register & Load 
import java.sql.Connection;// Library For Create Coonection with DataBase
public class BookManagement1
{
	int choice;//Accept choice from user to perfrom Operation on book and author
	char ch;// Sub_Choice for Perfrom Operation one or more Times.
	Scanner sc=new Scanner(System.in);//Scanner class for take input from user.
	public Connection setConnection(){
		String url="jdbc:mysql://localhost:3306/anudip";// Datatbase Mysql Server Path
		String user="root";// Mysql Server Username
		String pwd="Sampada";//Mysql Server Password
		Connection con=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");// Driver Path for register and load the drivers
			Connection conn = DriverManager.getConnection(url, user, pwd);// crete connection object to stored and connect java application with mysql server.
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return con;
	}
	public void my_operations() {
		BookOperation bo = new BookOperation();// Create Book class object to perform book Operation
		AuthorOperation ao = new AuthorOperation();//Create Author class object to perform Author Operation
		
			try {

					// List of Operations.
					do
					{
							System.out.println("------------------------------------------");
							System.out.println("1:ADD BOOK");
							System.out.println("2:EDIT BOOK");
							System.out.println("3:DELETE BOOK");
							System.out.println("4:GET BOOK DETAILS BY ID");
							System.out.println("5:VIEW ALL BOOKS DETAILS");
							System.out.println("6:ADD AUTHOR");
							System.out.println("7:EDIT AUTHOR DETAILS");
							System.out.println("8:DELETE AUTHOR");
							System.out.println("9:GET AUTHOR DETAILS BY ID");
							System.out.println("10:VIEW ALL AUTHOR DETAILS");
							System.out.println("11:ASSIGN AUTHOR TO A BOOK");
							
							System.out.println("------------------------------------------");
							System.out.print("Select Your Book Operation You Want to Perform : ");
							
							// Accept choice using scanner class from user to perform operations.
							choice=sc.nextInt();
							switch(choice)
							{
							case 1:
								bo.add_book();// call add book function from Book_Operation for added book data.
								break;
								
							case 2:
								bo.edit_book();// call edit book function from Book_Operation for edit book data.
								break;
								
							case 3:
								bo.delete_book();// call delete book function from Book_Operation for delete book data.
								break;
							case 4:
								
								bo.get_book_byId();// call get book data function from Book_Operation for retrive book data by using by id.
								break;
								
							case 5:
								bo.all_books_details();// call all book details function from Book_Operation for Display all book data.
								break;
								
							case 6:
								ao.add_Author();// call add author function from Author_Operation for added Author data.
								break;
								
							case 7:
								ao.edit_Author();// call edit author function from Author_Operation for edit Author data.
								break;
								
							case 8:
								ao.author_delete();// call delete author function from Author_Operation for delete Author data.
								break;
								
							case 9:
								ao.get_author_byId();// call get author data function from Author_Operation for retrive author data by using author id.
								break;
								
							case 10:
								ao.all_author_details();// call all author details function from Author_Operation for Display all Author data.
								break;
								
							case 11:
								bo.assign_author();// call assign author function to assign author_id to book_details table
								break;
								
							default:
								System.out.println("Enter Valid Choice Operation");// default case for invalid choice 
							}
						System.out.println("DO YOU WANT TO PERFORM ANY BOOK OPERATION OR AUTHOR OPERATION Y/N");// asking to user for perform more book operation & author operation again.
						ch=sc.next().charAt(0);// accept choice from user
					}while(ch=='Y'||ch=='y');
			}
					
			catch (Exception e) 
			{
				e.printStackTrace();
			}
			System.out.println("Thank You For Store Books Visist Again !");

	}
	public static void main(String[] args)
	{
		System.out.println("Welcome to Swapnil Book Store");
		BookManagement1 bm = new BookManagement1();// create object of Book_Mnagenet.
		bm.my_operations();// call function to perform operation using class object

	}

}
