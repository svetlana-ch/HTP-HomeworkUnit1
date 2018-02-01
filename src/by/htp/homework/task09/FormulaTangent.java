package by.htp.homework.task09;

import java.util.Scanner;

public class FormulaTangent {

	public static void main(String[] args) {
		double a = 0, b = 0, h = 0, x, Fx;

		Scanner sc = new Scanner(System.in);

		System.out.println("¬ведите начало отрезка а:  ");
		if (sc.hasNextDouble()) {
			a = sc.nextDouble();
		}
		
		System.out.println("¬ведите конец отрезка  b:  ");
		if (sc.hasNextDouble()) {
			b = sc.nextDouble();
		}
		
		System.out.println("¬ведите шаг h:  ");
		if (sc.hasNextDouble()) {
			h = sc.nextDouble();
		}
				
		System.out.println(" x:                     Fx:");
		
		for (double i = a; i <= b; i +=h ) {
			
			System.out.println(i + "          " + (2*Math.tan(i/2) + 1));			
			
		}
		
		

	}

}
