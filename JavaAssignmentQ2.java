//Assignment solved for Q2 by Pradnya Ghadge
import java.util.Scanner;

public class JavaAssignmentQ2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int six = 0;
		int one = 0;
		int two = 0;
		int three = 0;
		int four = 0;
		int zero = 0;
		int total_runs=0;
		int totalBallsPlayed =0;
		int overNo;
		System.out.println("-------Java Assignment Question 2---------");
		
		System.out.println("Total Overs played by the Batsman: ");
		overNo = sc.nextInt();
		totalBallsPlayed = 6*overNo;
		for(int i=0;i<totalBallsPlayed;i++) {
			int run = (int)(Math.random()*7);
			switch(run) {
			case 0: 
				zero++;
				break;
			case 1:
				one++;
				break;
			case 2:
				two++;
				break;
			case 3:
				three++;
				break;
			case 4:
				four++;
				break;
			case 6:
				six++;
				break;
			}
			total_runs = total_runs+run;
			
		
	}
		System.out.println("Six : "+six+"\nOne : "+one+"\nTwo : "+two+"\nThree : "+three+ "\nFour : " +four+"\nZeros : "+zero);
		System.out.println("Total runs : "+total_runs);
		System.out.println("Strike rate : "+(total_runs/30f)+" runs per ball");
		
	}
}
