package by.htp.homework.task08;

import java.util.Scanner;

public class Real {

	public static void main(String[] args) {
		double a = 0, b = 0, c = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("¬ведите число а:  ");
		if (sc.hasNextDouble()) {
			a = sc.nextDouble();
		}
		
		System.out.println("¬ведите число b:  ");
		if (sc.hasNextDouble()) {
			b = sc.nextDouble();
		}
		
		System.out.println("¬ведите число c:  ");
		if (sc.hasNextDouble()) {
			c = sc.nextDouble();
		}
		
		double[] mass = {a, b, c};

		for (double x : mass) {
			//System.out.println(x);
			if (x >= 0) {
				x = Math.pow(x, 2);
				System.out.println(x + " ");
			}
			else {
				x = Math.pow(x, 4);
				System.out.println(x + " ");
			}
			
			
		}
	}

}
