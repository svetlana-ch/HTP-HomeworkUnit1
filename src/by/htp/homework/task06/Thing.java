package by.htp.homework.task06;

import java.util.Random;

public class Thing {
	public static void main(String[] args) {

		int n = 0;
		float realNumber = 0;
		int count = 0;

		System.out.println("Программа генерирует от 2 до 1000 случайных вещественных чисел");
		
		n = (int)(Math.random()*999 + 2);

		System.out.println("В текущем запуске программы сгенерировано " + n + " числа(ел)");

		float[] mass = new float[n];
				
		for (int i = 0; i < n; i++) {			
			realNumber = (float)(Math.random()/Math.random()/Math.random()/Math.random());			
			mass[i] = realNumber;
			System.out.print(mass[i] + " ");
			mass[i] = (int)mass[i];		
		}
		
		for (float x : mass) {
			//System.out.println(x);
			if ((x % 2 == 0) && x > 15) {
				count++;
			}
		}
		
		System.out.println("\nСреди усеченных четных и больше 15 " + count + " числа(ел)");
				

	}

}
