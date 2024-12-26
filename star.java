package Christmasassignment;
import java.util.Scanner;

public class star {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner b = new Scanner(System.in);
		
		System.out.println("Enter the number of rows you want:（The number should be odd)");
		int h = b.nextInt();
		
		if (h%2==0) {
			System.out.println("Please enter an odd number");
			h = b.nextInt();
			}
		
		int i ;
		int n ;
		int count = h/2+1;

		
		for(i=1;i<=count;i++) {
			for(n=1;n<=count -i;n++) {
				System.out.print(" ");
				}
			for(n=1;n<=(2*i-1);n++) {
				System.out.print("*");
				}
				System.out.println();
			}
		
		
		for(i=count-1;i>=0;i--) {
			for(n=1;n<=count -i;n++) {
				System.out.print(" ");
				}
			for(n=1;n<=(2*i-1);n++) {
				System.out.print("*");
				}
				System.out.println();
			}

		
		b.close();
		
	}

}
