package by.htp.homework.task02;

import java.util.Scanner;

public class ExpressionValue {
	public static void main (String[] args) {
		double a = 0, b = 0, c = 0, val;
		
		
		Scanner conin = new Scanner(System.in);
		
		System.out.println("¬ведите число а--->" );
		if (conin.hasNextDouble()) {
		    a = conin.nextDouble();
		}
		
		System.out.println("¬ведите число b--->" );
		if (conin.hasNextDouble()) {
		    b = conin.nextDouble();
		}
		
		System.out.println("¬ведите число c--->" );
		if (conin.hasNextDouble()) {
		    c = conin.nextDouble();
		}
		
		val = a*a + (b - c)*(b - c) + Math.log(b*b-1);		
		
		
		System.out.println(" Expression Value is--->" +val);
		
	}

}
