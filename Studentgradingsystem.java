package Christmasassignment;
import java.util.Scanner;

public class Studentgradingsystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner b = new Scanner(System.in);
		
		System.out.println("What's your name?");
		String input= b.next();
		
		
		System.out.println("What is your first subject grade?");
		double num1 = b.nextDouble();
		System.out.println("What is your second subject grade?");
		double num2 = b.nextDouble();
		System.out.println("What is your third subject grade?");
		double num3 = b.nextDouble();
		
		
		double sum = num1+num2+num3;
		System.out.println("Total score:"+num1 +"+"+num2+ "+" +num3+ "=" +sum);
		
		
		double average= sum/3;
		System.out.println("Average score:"+average);
		
		
		if (average >=90){
			System.out.println("Your grade is A");
		}
		else if (average>=80){
			System.out.println("Your grade is B");
		}
		else if (average>=70) {
			System.out.println("Your grade is C");
		}
		else if (average>=60) {
			System.out.println("Your grade is D");
		}
		else if (average<60) {
			System.out.println("Your grade is F");
		}
	
	}

}
