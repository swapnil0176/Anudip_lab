
/*Q5)Create a parent class called "Person" with attributes such as name, age, and a method called "speak". 
Create a child class called "Student" that inherits from Person and has an additional attribute called "grade"
and a method called "study". Create an object of the Student class and call both the "speak" and "study" methods.*/
package com.AngularJava.ThursdayLab.Anudip_lab;
class Person
{
	String name;
	int age;
	public void speak()
	{
		System.out.println("Speak");
	}
}
class Student extends Person 
{
	String grade;
	public void study()
	{
		System.out.println("Study");
	}
}
public class StudentTeacher21Dec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student();
		s.speak();
		s.study();
	}

}