package thursdayLab5;

import java.io.IOException;
public class ChainedException 
{
       public static void main(String[] args) {
        try {
            // This method simulates an exception being thrown
            methodWithException();
        } catch (Exception e) {
            // Print the details of the first exception
            System.out.println("Caught exception: " + e.getMessage());

            // Check if the exception has a chained exception
            if (e.getCause() != null) {
                // Print the details of the chained exception
                System.out.println("Chained exception: " + e.getCause().getMessage());
            }
        }
    }

    // A method that throws an exception with a chained exception
    private static void methodWithException() throws Exception {
        try {
            // Simulate an exception
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            // Wrap the caught exception in a new exception and throw it
            throw new Exception("An error occurred during the operation.", e);
        }
    }
}

