import java.util.Scanner;

public class TheJourneyCalApp 
{
public static void main(String []args)
{
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter speed and time as realnumbers");
	double speed=scan.nextDouble();
	double time=scan.nextDouble();
	JourneyCalculator journeyCalculator = new JourneyCalculator();

	System.out.printf(" %.2f",journeyCalculator.calculateDistance(60.0, 1.5));
	
}
}
