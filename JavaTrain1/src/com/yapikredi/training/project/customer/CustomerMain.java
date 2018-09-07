package com.yapikredi.training.project.customer;

import java.util.List;
import java.util.Scanner;

import com.yapikredi.training.java.Customer;

public class CustomerMain {
	public static void main(String[] args) {
		CustomerManager customerManager = new CustomerManager();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Username : ");
		String username = scanner.nextLine();
		System.out.println("Password : ");
		String password = scanner.nextLine();
		Customer loggedCustomer = customerManager.login(username, password);
		if (loggedCustomer == null) {
			System.out.println("Username yada Password yanl��.");
		} else {
			switch (loggedCustomer.getCustomerType()) {
			case ALTIN:
				System.out.println("ALTIN M��terimiz ho� geldiniz. Reklam Alt�n");
				break;
			case GUMUS:
				System.out.println("GUMUS M��terimiz ho� geldiniz");
				break;
			case PLATINIUM:
				System.out.println("PLATINYUM M��terimiz ho� geldiniz.Reklam Paltinyum");
				break;
			default:
				break;
			}
			System.out.println(loggedCustomer);
		}
		List<ICommand> allCommand = loggedCustomer.getAllCommand();
		while (true) {
			for (int i = 0; i < allCommand.size(); i++) {
				System.out.println((i + 1) + "-" + allCommand.get(i).getMenuDesc());
			}
			System.out.println((allCommand.size() + 1) + "-Exit" );
			System.out.println("Se�iminiz : ");
			int nextInt = scanner.nextInt();
			if (nextInt >= allCommand.size() + 1 || nextInt < 1) {
				break;
			}
			ICommand iCommand = allCommand.get(nextInt - 1);
			iCommand.execute(scanner, loggedCustomer);
		}
	}
}
