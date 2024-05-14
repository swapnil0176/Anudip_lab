//2.   A class teacher has decided to split her entire class into four groups, namely Sapphire, Perl, Ruby, and Emerald 
//for sports competitions. For dividing the students into these four groups, she has followed the pattern given below:
//Sapphire - 1, 5, 9, 13, 17, 21, ...
//Perl - 2, 6, 10, 14, 18, 22, ...
//Ruby - 3, 7, 11, 15, 19, 23, ...
//Emerald - 4, 8, 12, 16, 20, 24, ...
//All the students are represented by their roll numbers. Based on the above pattern, given the roll number as input,
//print the group the student belongs to. Note that the roll number can be any positive integer and not necessarily less than 25.
//
package thursdayLab10;

import java.util.Scanner;

public class GroupAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter roll number: ");
        int rollNumber = sc.nextInt();
       
        int groupSize = 4;
        int groupNumber = (rollNumber - 1) % groupSize + 1;

        switch (groupNumber) {
            case 1:
                System.out.println("Student is present Sapphire Group");
                break;
            case 2:
                System.out.println("Student is present Perl Group");
                break;
            case 3:
                System.out.println("Student is present Ruby Group");
                break;
            case 4:
                System.out.println("Student is present Emerald Group");
                break;
            default:
                System.out.println("Invalid roll number");
        }
	}

}
