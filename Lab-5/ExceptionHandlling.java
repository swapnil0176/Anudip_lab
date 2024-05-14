// Q3).Java program to demonstrate working of chained exceptions 
package thursdayLab5;


public class ExceptionHandlling 
{ 
    public static void main(String[] args) 
    { 
        try
        { 
            NumberFormatException ex = new NumberFormatException("Exception"); 
            ex.initCause(new NullPointerException("This is actual cause of the exception")); 
            throw ex; 
        } 
  
        catch(NumberFormatException ex) 
        { 
            // displaying the exception 
            System.out.println(ex); 
            // Getting the actual cause of the exception 
            System.out.println(ex.getCause()); 
        } 
    } 
}
