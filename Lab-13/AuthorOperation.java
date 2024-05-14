package com.lab13;
import java.sql.Connection;// Library For Create Coonection with DataBase.
import java.sql.DriverManager;
import java.sql.PreparedStatement;// Library for Create and Execute the SQL Statements.
import java.sql.ResultSet;//Library for Retrive and Display Data form the datatbase and display on the java application

public class AuthorOperation extends BookManagement1// extend the functionality of Book_Mnagenet class to Author_operation class
{
	int author_id; // variable for store author id.
	String author_name , author_email, author_phone;// variables for stored the values of author_name , author_email, author_phone.
	public void add_Author() // function to add Author details using throws exception passing the Connection conn object for connect with the database.
	{
		try {
			Connection conn = setConnection();

			char ch;// variables for stored user choice.
			do {

				String qur = "insert into author_details (author_id,author_name,author_email,author_phone) value(?,?,?,?)";// insert sql query for insert data into the  Author_details table.
				PreparedStatement ps = conn.prepareStatement(qur);// // execute the sql statement using prepared statement.
				System.out.println("Enter Author ID : ");
				ps.setInt(1, sc.nextInt());// set the author values using set() of PreparedStatement.
				System.out.println("Enter Author Name : ");
				ps.setString(2, sc.nextLine());//Accept author_email form user
				System.out.println("Enter Author Email : ");
				ps.setString(2, sc.nextLine());//Accept author_Phone form user
				System.out.println("Enter Author Phone Number : ");
				ps.setString(4, sc.nextLine());
				int count = ps.executeUpdate();// storing the execute result into the return value integer.
				if (count > 0)// checks the data added or not into the table
				{
					System.out.println("Record Added Successfully");
				} else {
					System.out.println("Failed");
				}
				System.out.println("DO YOU WANT TO ADD MORE AUTHOR DATA Y/N");
				ch = sc.next().charAt(0);//accepting input from user choice for adding more data in the table
			} while (ch == 'Y' || ch == 'y');
		}catch (Exception e){e.printStackTrace();}
	}

	
	public void edit_Author() // function to edit  Author details using throws exception passing the Connection conn object for connect with the database.
	{
		char ch;
		do {

			System.out.println("What Do You Update In Your Author Record");// display the fields user want to update from the table
			System.out.println("------------------------------------------");
			System.out.println("1. AUTHOR NAME");
			System.out.println("2. AUTHOR EMAIL");
			System.out.println("3. AUTHOR PHONE NUMBER");
			switch (sc.nextInt()) {
				case 1:
					try (Connection conn=setConnection()){

						// csase 1 for update Author name

						author_id = sc.nextInt();//Accept Author id from user

						System.out.println("Enter The New Name Of The Author");
						author_name = sc.nextLine();// Accept new name of the Author from user

						PreparedStatement ps = conn.prepareStatement("UPDATE  author_details SET author_name = ? WHERE author_id = ?");// update sql query for update data into the table
						System.out.println("Enter Author Id You want to Update Author Name: ");
						ps.setString(1, sc.nextLine());// set the new name for the Author
						ps.setInt(2, author_id);// set the Author id

						int count = ps.executeUpdate();// storing the execute result into the return value integer
						if (count > 0)// checks the data update or not into the table
						{
							System.out.println("Author Name Updated Successfully");
						} else {
							System.out.println("Author Name Not Updated");
						}
					}catch (Exception e) {
						e.printStackTrace();

					}

				case 2:
					try {
						Connection conn=setConnection();
						// csase 2 for update Author Email

						sc.nextLine();
						System.out.println("Enter The New Email For Author");
						author_email = sc.nextLine();// Accept new Author Email of the Author from user

						PreparedStatement ps1 = conn.prepareStatement("UPDATE author_details SET author_name = ? WHERE author_id = ?");// update sql query for update data into the table
						System.out.println("Enter Author Id You want to Update Author Email: ");
						author_id = sc.nextInt();//Accept Author id from user
						ps1.setString(1, author_email);// set the new Author Email for the Author
						System.out.println("Enter Author Id You want to Update Author Email: ");
						ps1.setInt(2, sc.nextInt());// set the Author Id

						int count1 = ps1.executeUpdate();// storing the execute result into the return value integer
						if (count1 > 0)// checks the data update or not into the table
						{
							System.out.println("Author Email Updated Successfully");
						} else {
							System.out.println("Author Email Not Updated");
						}
					}catch (Exception e){
						e.printStackTrace();
					}
					break;
					
					
				case 3:
					
					// csase 3 for update Author Phone Number
					try{
						Connection conn=setConnection();
						System.out.println("Enter Author Id You want to Update Phone Number Of Author: ");
						author_id=sc.nextInt();//Accept Author id from user
						sc.nextLine();
						System.out.println("Enter The New Phone Number Of The Author");
						author_phone=sc.toString();// Accept new Author Phone of the Author from user

						PreparedStatement ps2 =conn.prepareStatement("UPDATE author_details SET author_phone = ? WHERE author_id = ?");// storing the execute result into the return value integer
						ps2.setString(1, author_phone);// set the new Author Phone number for the Author
						ps2.setInt(2, author_id);// set the Author Id

						int count2=ps2.executeUpdate();// storing the execute result into the return value integer
						if(count2>0)// checks the data update or not into the table
						{
							System.out.println("Book Price Updated Successfully");
						}
						else
						{
							System.out.println("Book Price Not Updated");
						}

						}catch (Exception e){
							e.printStackTrace();
						}
					break;
				
				default :
					System.out.println("Enter Valid Choice");
					break;
				}
				System.out.println("DO YOU WANT TO UPDATE MORE AUTHOR DATA Y/N");
				ch=sc.next().charAt(0);// Accept user input from user for more data update again
		}while(ch=='Y'||ch=='y');
		
	}
	
	public void author_delete() // function to delete Author details using throws exception passing the Connection conn object for connect with the database.
	{
		Connection conn=setConnection();
		char ch;// variable to stroed value for perform delete operation again.

			try {
				do
				{
				System.out.println("Enter Author Id You Want To Delete Author Data");
				author_id = sc.nextInt();// accept Author id from user for delete Author details

				PreparedStatement ps = conn.prepareStatement("delete from author_details WHERE author_id=?");// create sql statement for delete Author data from Author_details table.
				ps.setInt(1, author_id);// set Author id for delete book data
				int count = ps.executeUpdate();//storing the execute result into the return value integer
				if (count > 0)// checks the Author data deleted or not into the table
				{
					System.out.println("Author Data Deleted Successfully");
				} else {
					System.out.println("Author Data Not Deleted");
				}
				System.out.println("DO YOU WANT TO DELETE MORE AUTHOR DATA Y/N");
				ch = sc.next().charAt(0);
				}while(ch=='Y'||ch=='y');
			}catch (Exception e){e.printStackTrace();}

			
	}
	
	
	public void get_author_byId()// function to get Author details by using Author_id using throws exception passing the Connection conn object for connect with the database.
	{
		try {
			Connection conn = setConnection();
			char ch;// variable to stored values  for get more Author data by using Author_id form the table.
			do {
				String qur = "select *from author_details where author_id=?";// sql query for retrive data from table
				System.out.println("Enter Author Id : ");
				author_id = sc.nextInt();//accepting Author id from user to retrive Author details.
				PreparedStatement ps = conn.prepareStatement(qur);// create sql statement using preparedstatement.
				ps.setInt(1, author_id);// set the Author id
				ResultSet rs = ps.executeQuery();// execute the sql query and stored into result set for retrive and display Author data.
				while (rs.next()) // next method used to retrive data each row one by one
				{
					// Retrieve by column name
					int author_id = rs.getInt("author_id");
					String author_name = rs.getString("author_name");
					String author_email = rs.getString("author_email");
					String author_phone = rs.getString("author_phone");


					// Display All Data Of Author Table.
					System.out.println("Author ID: " + author_id);
					System.out.println("Author Name: " + author_name);
					System.out.println("Author Email: " + author_email);
					System.out.println("Author Phone: " + author_phone);
					System.out.println("----------------------------");
				}
				System.out.println("DO YOU WANT TO GET MORE AUTHOR DATA BY ENTERING AUTHOR ID Y/N");
				ch = sc.next().charAt(0);//Accept user input from user for get more Author data  again by using Author id.
			} while (ch == 'Y' || ch == 'y');
		}catch (Exception e){
			e.printStackTrace();
		}
	}
	
	
	public void all_author_details() // function to get all Author details  using throws exception passing the Connection conn object for connect with the database.
	{
		try {
			Connection conn = setConnection();
			PreparedStatement ps = conn.prepareStatement("Select *from author_details"); // create sql statement for display all Authors data form table to java application.
			ResultSet rs = ps.executeQuery();// execute the sql query and stored into result

			while (rs.next()) // next method used to retrive data each row one by one
			{
				// Retrieve by column name
				int author_id = rs.getInt("author_id");
				String author_name = rs.getString("author_name");
				String author_email = rs.getString("author_email");
				String author_phone = rs.getString("author_phone");


				// Display All Data Of Author Table.
				System.out.println("Author ID: " + author_id);
				System.out.println("Author Name: " + author_name);
				System.out.println("Author Email: " + author_email);
				System.out.println("Author Phone: " + author_phone);
				System.out.println("----------------------------");
			}
		}catch (Exception e){
			e.printStackTrace();

		}
	}
	
	
	public static void main(String s[])
	{
		AuthorOperation ao = new AuthorOperation();
	}


}
