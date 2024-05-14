/*Q2.Write a JAVA program which will generate the threads:
 To display 20 terms of Fibonacci series.
 To display 1 to 9999 in reverse order.*/
package thursdayLab5;

public class Generate_Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tread_fabonacci f=new Tread_fabonacci();
		f.start();
		Thread_Reverse r=new Thread_Reverse();
		r.start();
	}

}
