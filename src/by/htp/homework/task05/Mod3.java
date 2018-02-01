package by.htp.homework.task05;

import java.util.Scanner;

public class Mod3 {
	
	public static void main (String[] args) {
		int i = 0, x = 0, chet = 0, del3 = 0, mod3 = 0;
				
		Scanner conin = new Scanner(System.in);
		
		System.out.println("Количество целых чисел?" );
		if (conin.hasNextInt()) {
		    i = conin.nextInt();
		}
		
		while (i != 0) {
			System.out.println("Введите целое число" );
			x = conin.nextInt();
			//System.out.println("i=" + i);
			//System.out.println("x=" + x);
			if (x%2 == 0) {
				chet++;
			}
			if (x%3 == 0) {
				del3 += x;
			}
			if (Math.abs(x) < 3) {
				mod3++;
			}

			i--;
		}
		
		System.out.println("Количество четных  " + chet);
		System.out.println("Сумма кратных трем " + del3);
		System.out.println("Количество чисел, модуль которых меньше трех " + mod3);
		
		
									
	}

}
