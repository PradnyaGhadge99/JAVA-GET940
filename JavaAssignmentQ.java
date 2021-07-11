//Assignment solved for Q1 by Pradnya Ghadge
import java.util.*;

public class JavaAssignmentQ {
	public static void main(String[] args) {
		float s = 1.20f;
		float u;
		float c;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("-------Java Assignment Question 1---------");
		System.out.println("-------ELECTRICITY BILL---------");
		System.out.println("Enter the number of electricity units used: ");
		u = sc.nextFloat();
		
		if(u<100)
		{
			c = u*s;
		}
		else if(u<=300)
		{
			c = ((100*s)+((u-100)*2));
		}
		else
		{
			c = ((100*s) + (200*2) + ((u-300)*3));
		}
		
		System.out.println("The ELectricity Bill for you is "+c +" Rs.");
	}

}
