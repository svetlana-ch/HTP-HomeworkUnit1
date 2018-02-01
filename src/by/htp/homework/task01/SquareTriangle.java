package by.htp.homework.task01;

import java.util.Scanner;

public class SquareTriangle {

	public static void main (String[] args) {
		double a, b, c, sq;
		
				
		Scanner conin = new Scanner(System.in);
		
		System.out.println("First catheter--->" );
		a = conin.nextDouble();
		
		System.out.println("Second catheter--->" );
		b = conin.nextDouble();
				
		
		c = Math.sqrt(a*a + b*b);
		
		sq = (a*b)/2;
		
		System.out.println("Hypotenuse is--->" +c);
		System.out.println("Square is--->" +sq);
		
	}
	
	
	
}
