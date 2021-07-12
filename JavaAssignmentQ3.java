//Assignment solved for Q3 by Pradnya Ghadge
import java.util.Scanner;
public class JavaAssignmentQ3{

	public static void main(String[] args) {
		System.out.println("-------Java Assignment Question 2---------");
		
		System.out.println("For First Innings: ");
		Inning i1 = new Inning();
		i1.caluclate();
		System.out.println("-----------------------------------------");
		
		System.out.println("For Second Innings : ");
		Inning i2 = new Inning();
		i2.caluclate();
		System.out.println("-----------------------------------------");
		
		System.out.println("For Third Innings : ");
		Inning i3 = new Inning();
		i3.caluclate();
		System.out.println("-----------------------------------------");
		
		System.out.println("For Fourth Innings : ");
		Inning i4 = new Inning();
		i4.caluclate();
		System.out.println("-----------------------------------------");
		
		System.out.println("For Fifth Innings : ");
		Inning i5 = new Inning();
		i5.caluclate();
		System.out.println("-----------------------------------------");
		
		System.out.println("Average Score of all Innings : ");
		System.out.println((float)(i1.total_runs+i2.total_runs+i3.total_runs+i4.total_runs+i5.total_runs)/5);
		System.out.println("Total runs of all Innings : \n"+(i1.total_runs+i2.total_runs+i3.total_runs+i4.total_runs+i5.total_runs));

		System.out.println("-----------------------------------------");
		
		System.out.println("Average per ball : ");
		System.out.println((float)(i1.total_runs+i2.total_runs+i3.total_runs+i4.total_runs+i5.total_runs)/(i1.balls_played+i2.balls_played+i3.balls_played+i4.balls_played+i5.balls_played));

		System.out.println("-----------------------------------------");
		
		System.out.println("Total six scored : ");
		System.out.println(i1.six+i2.six+i3.six+i4.six+i5.six);

		System.out.println("-----------------------------------------");
		
		System.out.println("Total one scored : ");
		System.out.println(i1.one+i2.one+i3.one+i4.one+i5.one);

		System.out.println("-----------------------------------------");
		
		System.out.println("Total two scored : ");
		System.out.println(i1.two+i2.two+i3.two+i4.two+i5.two);
		
		System.out.println("-----------------------------------------");
		
		System.out.println("Total three scored : ");
		System.out.println(i1.three+i2.three+i3.three+i4.three+i5.three);

		System.out.println("-----------------------------------------");
		
		System.out.println("Total four scored : ");
		System.out.println(i1.four+i2.four+i3.four+i4.four+i5.four);

		System.out.println("-----------------------------------------");
		
		System.out.println("Total zero scored : ");
		System.out.println(i1.zero+i2.zero+i3.zero+i4.zero+i5.zero);
		
		System.out.println("-----------------------------------------");
		
	
	}

}

class Inning{
	
	int balls_played;
	int six = 0;
	int one = 0;
	int two = 0;
	int three = 0;
	int four = 0;
	int zero = 0;
	int total_runs=0;
	
	void caluclate() {
		
		Scanner sc = new Scanner(System.in);
		int overNo;
		System.out.println("Enter the total number of Over played by the batsman : ");
		overNo = sc.nextInt();
		
		balls_played= 6*overNo;
		for(int i=0;i<balls_played;i++) {
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
		}
	
	
	
}
