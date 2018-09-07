package com.yapikredi.training.project.customer.commands;

import java.util.Scanner;

import com.yapikredi.training.java.Customer;
import com.yapikredi.training.project.customer.Account;
import com.yapikredi.training.project.customer.CustomerUtils;
import com.yapikredi.training.project.customer.EAccountType;
import com.yapikredi.training.project.customer.ICommand;

public class TLParaYatir implements ICommand{

	@Override
	public void execute(Scanner scanner, Customer customer) {
		CustomerUtils.paraYatir(scanner, customer, EAccountType.TL);
	}

	@Override
	public String getMenuDesc() {
		return "TL Para yat�r";
	}

}
