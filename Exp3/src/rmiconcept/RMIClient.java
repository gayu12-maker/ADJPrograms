package rmiconcept;

import java.rmi.Naming;
import java.util.Scanner;

public class RMIClient {
	public static void main(String[] args) throws Exception{
		int x,y,result;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x:");
		x = sc.nextInt();
		System.out.println("Enter y:");
		y = sc.nextInt();

		Addition add =(Addition)Naming.lookup("rmi://localhost:2000/additionServer");

		result = add.multiply(x,y);
		System.out.println("Multiplication Result:"+result);
	}
}