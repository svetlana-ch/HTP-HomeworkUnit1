package by.htp.homework.task04;

import java.util.Scanner;

public class FootballTeam {
	
	public static void main (String[] args) {
		double a = 0, b = 0, c = 0;
		
		
		Scanner conin = new Scanner(System.in);
		
		System.out.println("������� ����� �--->" );
		if (conin.hasNextDouble()) {
		    a = conin.nextDouble();
		}
		
		System.out.println("������� ����� b--->" );
		if (conin.hasNextDouble()) {
		    b = conin.nextDouble();
		}
		
		if (a == b) {
			
			System.out.println("����� ����� ���!" );
			
		}
		else {			
			System.out.println("������� ����� c--->" );
			if (conin.hasNextDouble()) {
			    c = conin.nextDouble();			   
			}
			
			System.out.println(a + b + c);
			
			System.out.println(a*a + b*b);
			
			System.out.println("\"��� ������� ���������� �������\"" );
			
		}
		
						
	}

}
