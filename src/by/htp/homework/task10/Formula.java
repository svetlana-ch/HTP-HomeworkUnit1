package by.htp.homework.task10;

import java.util.Scanner;

public class Formula {

	public static void main(String[] args) {
		double x = 0, Fx;
		

		Scanner sc = new Scanner(System.in);

		System.out.println("¬ведите x:  ");
		if (sc.hasNextDouble()) {
			x = sc.nextDouble();
		}
		
		if (x <= -3) {
			Fx = 9;
		}
		else {
			Fx =  1/(x*x +1);				
		}
		
		System.out.println("F(x) = " + Fx);
		

	}

}
