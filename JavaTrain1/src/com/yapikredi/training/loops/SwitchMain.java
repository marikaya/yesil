package com.yapikredi.training.loops;

import java.util.Scanner;

public class SwitchMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Se�iminiz : ");
		int nextInt = scanner.nextInt();

		switch (nextInt) {
		case 1:
			System.out.println("1 se�ildi");
			break;
		case 2:
			System.out.println("2 se�ildi");
			break;
		case 3:
			System.out.println("3 se�ildi");
			break;
		case 4:
			System.out.println("4 se�ildi");
			break;
		case 5:
			System.out.println("5 se�ildi");
			break;

		default:
			System.out.println("Yaln�� se�ildi");
			break;
		}
		
		if (nextInt > 5) {
			System.err.println("Error 5 den b�y�k");
		} else if (nextInt == 5) {
			System.out.println("5 se�ildi");
		} else if (nextInt == 4) {
			System.out.println("4 se�ildi");
		} else if (nextInt == 3) {
			System.out.println("3 se�ildi");
		} else if (nextInt == 2) {
			System.out.println("2 se�ildi");
		} else if (nextInt == 1) {
			System.out.println("1 se�ildi");
		}
		
	}
}
