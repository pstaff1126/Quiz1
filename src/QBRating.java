import java.util.Scanner;

public class QBRating {
	
	public static void qbRating() {
		Scanner rating= new Scanner(System.in);
		System.out.println("How many passing attemts?");
		Double att=rating.nextDouble();
		System.out.println("How many completions were made?");
		double comp=rating.nextDouble();
		System.out.println("How many passing yards?");
		double yards=rating.nextDouble();
		System.out.println("How many touchdowns were thrown?");
		double td=rating.nextDouble();
		System.out.println("How many interceptions were thrown?");
		double interceptions=rating.nextDouble();
		
		double a=(comp/att-.3)*5;
		double b=(yards/att-3)*(.25);
		double c=(td/att)*20;
		double d=(2.375-((25*interceptions/att)));
		double qbrating=(((a+b+c+d)/6)*100);
		System.out.println("The quarterback has a qb rating of " + qbrating);
	}
	public static void main(String args[]) {
		QBRating.qbRating();
		
	}
}
