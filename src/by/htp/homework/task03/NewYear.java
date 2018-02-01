package by.htp.homework.task03;

import java.util.Scanner;

public class NewYear {
	
	public static void main (String[] args) {
		double a = 0, b = 0, c = 0;
		
		
		Scanner conin = new Scanner(System.in);
		
		System.out.println("Введите число а--->" );
		if (conin.hasNextDouble()) {
		    a = conin.nextDouble();
		}
		
		System.out.println("Введите число b--->" );
		if (conin.hasNextDouble()) {
		    b = conin.nextDouble();
		}
		
		if (a > b) {
			
			System.out.println("Введите число c--->" );
			if (conin.hasNextDouble()) {
			    c = conin.nextDouble();
			    System.out.println(b + c);
			}
			
		}
		
		
		if (a == b) {
			
			System.out.println("Конец" );
			
		}
		
		
		if (a < b) {
			
			System.out.println("Введите число c--->" );
			if (conin.hasNextDouble()) {
			    c = conin.nextDouble();
			    System.out.println(a + b + c + " Новый год!");
			}
		}
		
				
	}

}
