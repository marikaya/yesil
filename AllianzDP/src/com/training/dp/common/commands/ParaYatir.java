package com.training.dp.common.commands;

import com.training.dp.common.Customer;
import com.training.dp.common.ICommand;

public class ParaYatir implements ICommand {

    @Override
    public String menuDescription() {
        return "Para yat�r";
    }

    @Override
    public String commandDescription() {
        return "Yat�raca��n�z miktar� giriniz :";
    }

    @Override
    public void executeCommand(final Customer customerLoc,
                               final int amount) {
        customerLoc.setTlAmount(customerLoc.getTlAmount() + amount);

    }

}
