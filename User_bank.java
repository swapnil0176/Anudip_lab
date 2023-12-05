package com.AngularJava.DailyPrograms;

public class User_bank extends Staff_bank
{
    int user_choice;
    char next_opt;
    public void Bank_operation()
    {
        do
        {
            System.out.println("1:Deposit\n2:Withdraw\n3:Blaance Check\n4:Any bank operation\n5:View Your details");
            user_choice=sc.nextInt();
            switch(user_choice)
            {
                case 1:
                    depo_process();
                    break;
                case 2:
                    with_process();
                    break;
                case 3:
                    Main_balance();
                    break;
                case 4:
                    cus_supp();
                    break;
                case  5:
                    ac_user_display();
                    break;
                default:
                    System.out.println("Invalid Choice");
                    break;
            }
            System.out.println("Want to select any other operation Y/N");
            next_opt=sc.next().charAt(0);
        }
        while(next_opt=='Y'||next_opt=='y');

        System.out.println("Thanks for visiting bank of Baroda");
    }


}
