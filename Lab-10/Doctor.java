//Q4)Create arraylist of doctor(id,name,specility) and generate addDoctor(),displayDoctors(),updateDoctor() methods.

package thursdayLab10;


import java.util.ArrayList;
import java.util.Scanner;

public class Doctor {
    String d_name,specialist;
    int id;
    Doctor(int id,String d_name,String specialist){
        this.id=id;
        this.d_name=d_name;
        this.specialist=specialist;
    }
    ArrayList<Doctor> doctor=new ArrayList();
    Scanner sc= new Scanner(System.in);

    public Doctor() {}

    void addDoctor(){
    	
        System.out.println("Enter doctor id");
        id=sc.nextInt();//accept doctor id
        System.out.println("Enter doctor name");
        d_name=sc.next();//accept doctor name
        System.out.println("Enter doctor specialist");
        specialist=sc.next();//accept doctor specialist
        doctor.add(new Doctor(id,d_name,specialist));
    }
    void displayDoctors(){
        System.out.println("Doctor Details");
        for(Doctor d:doctor){
            System.out.println("Id:- "+d.id+"\tName:- "+d.d_name+"\tSpecialist:- "+d.specialist);
        }
    }
    void updateDoctor(){
        boolean flag=false;
        System.out.println("Enter doctor id to modify");
        int id= sc.nextInt();//accept id from user
        for(Doctor d:doctor){
            if(d.id==id) {//search id in arraylist
                System.out.println("Enter doctor name");
                d.d_name=sc.next();//update name of doctor
                System.out.println("Enter doctor speciality");
                d.specialist=sc.next();//update doctor speciality
                flag=true;
                break;
            }
        }
        if(flag){
            System.out.println("Information is updated");
        }
        else
            System.out.println("Doctor id NOT found");
    }
    public void displayMenu(){
        do {
            System.out.println("--->-->-> Menu <-<--<---\n" +
                    "1)Add doctor" +
                    "\n2)Display doctor details" +
                    "\n3)Update detail" +
                    "\n4)Exit");
            System.out.println("Enter choice");
            switch (sc.nextInt()){
                case 1->addDoctor();//call add doctor information function
                case 2->displayDoctors();//call display information function
                case 3->updateDoctor();//call update function to modify details
                case 4->System.exit(0);
                default -> System.out.println("Enter valid case ");
            }
        }while(true);
    }
    public static void main(String[] args) {
        Doctor doctor1 =new Doctor();
        doctor1.displayMenu();//call to menu method
    }
}