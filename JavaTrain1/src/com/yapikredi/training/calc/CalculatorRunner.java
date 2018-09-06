package com.yapikredi.training.calc;

import java.util.Scanner;

public class CalculatorRunner {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		
		Scanner scanner = new Scanner(System.in);
		while (true) {
			// Show MENU
			System.out.println("1-Toplama");
			System.out.println("2-��karma");
			System.out.println("3-B�lme");
			System.out.println("4-�arpma");
			System.out.println("5-��k��");
			System.out.println("Se�iminiz : ");
			// Get Selection
			int secim = scanner.nextInt();
			// Check selection 
			if (secim > 4 || secim < 1) {
				break;
			}
			
			// Get Values for operation
			System.out.println("Birinci value : ");
			double firstDouble = scanner.nextDouble();
			
			System.out.println("�kinci value : ");
			double secondDouble = scanner.nextDouble();
			
			double result = 0; 
			
			// Operation
			switch (secim) {
			case 1:
				result = calculator.add(firstDouble, secondDouble);
				break;
			case 2:
				result = calculator.subs(firstDouble, secondDouble);
				break;
			case 3:
				result = calculator.div(firstDouble, secondDouble);
				break;
			case 4:
				result = calculator.mult(firstDouble, secondDouble);
				break;
			default:
				continue;
			}
			
			// Show Result 
			System.out.println("Result : " + result);

		}

		
	}
}
