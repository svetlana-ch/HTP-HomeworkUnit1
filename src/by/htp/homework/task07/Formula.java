package by.htp.homework.task07;

import java.util.Scanner;

public class Formula {

	public static void main(String[] args) {
		double a = 0, b = 0, c = 0, d = 0, res = 0;
		
		Scanner sc = new Scanner(System.in);
				
		System.out.println("������� ����� �:  ");
		if (sc.hasNextFloat()) {
			a = sc.nextFloat();
		}
		
		System.out.println("������� ����� b:  ");
		if (sc.hasNextFloat()) {
			b = sc.nextFloat();
		}
		
		System.out.println("������� ����� c:  ");
		if (sc.hasNextFloat()) {
			c = sc.nextFloat();
		}
		
		System.out.println("������� ����� d:  ");
		if (sc.hasNextFloat()) {
			d = sc.nextFloat();
		}
		
		if (c == 0 || d == 0) {
			System.out.println("������ �� ���� ������");
		}
		else {
			res = (a/c)*(b/d) - (a*b-c)/c*d;
			System.out.println("�������� ��������� �����:  " + res);
		}
		
		

	}

}
