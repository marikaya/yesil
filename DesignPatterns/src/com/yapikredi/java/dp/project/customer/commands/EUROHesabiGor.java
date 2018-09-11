package com.yapikredi.java.dp.project.customer.commands;

import java.util.Scanner;

import com.yapikredi.java.dp.project.customer.Account;
import com.yapikredi.java.dp.project.customer.Customer;
import com.yapikredi.java.dp.project.customer.EAccountType;

public class EUROHesabiGor implements ICommand {

	@Override
	public String getMenuDesc() {
		return "EURO Hesab� g�r";
	}

	@Override
	public void execute(final Scanner scanner, final Customer customer) {
		Account account = customer.getAccount(EAccountType.EURO);
		if (account == null) {
			System.out.println("EURO Hesab�n�z yok. Bankaya dan���n");
		}
		System.out.println(account);
	}

}
