package thursdayLab10;

//A class teacher has decided to split her entire class into four groups, namely Sapphire,
//Perl, Ruby, and Emerald for sports competitions. For dividing the students into these
//four groups, she has followed the pattern given below:
//
//Sapphire - 1, 5, 9, 13, 17, 21, ...
//
//Perl - 2, 6, 10, 14, 18, 22, ...
//
//Ruby - 3, 7, 11, 15, 19, 23, ...
//
//Emerald - 4, 8, 12, 16, 20, 24, ...
//
//All the students are represented by their roll numbers. Based on the above pattern, given the
//roll number as input, print the group the student belongs to. Note that the roll number
//can be any positive integer and not necessarily less than 25.



import java.util.LinkedList;
import java.util.Scanner;

public class StudentGroups {
 int n;
 Scanner sc = new Scanner(System.in);
 LinkedList sapphire=new LinkedList();
 LinkedList perl=new LinkedList();
 LinkedList ruby=new LinkedList();
 LinkedList emerald=new LinkedList();
 void divideStudents() {
     Scanner sc = new Scanner(System.in);
     System.out.println("How many students in your class");
     n= sc.nextInt();
     
     for (int i = 1; i <= n; i++) {
         switch (i%4){
             case 1->{
                 sapphire.add(i);
             }
             case 2->{
                 perl.add(i);
             }
             case 3->{
                 ruby.add(i);
             }
             case 0->{
                 emerald.add(i);
             }
         }
     }
     display();
 }
 void display(){
     System.out.println("Student groups are");//display group wise information
     System.out.println("Sapphire Group:- "+sapphire);
     System.out.println("Perl Group:- "+perl);
     System.out.println("ruby Group:- "+ruby);
     System.out.println("Emerald Group:- "+emerald);
     System.out.println("Enter student roll no do you want to search");
     int temp_roll=sc.nextInt();
     if(temp_roll<=n) {
     switch (temp_roll%4){// reminder are between 0-3 only
         case 1-> System.out.println("Student present in sapphire group");
         case 2-> System.out.println("Student present in perl group");
         case 3-> System.out.println("Student present in Ruby group");
         case 0-> System.out.println("Student present in emerald group");
     }
     }
     else
     {
    	 System.out.println("Invalid rollNo!!!!");
     }
 }

 public static void main(String[] args) {
     new StudentGroups().divideStudents();
 }
}