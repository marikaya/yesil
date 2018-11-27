package com.training.dp.creation.general;


public class CustomerPrefixDeco extends Customer {

    private final Customer customer;

    public CustomerPrefixDeco(final Customer customerParam) {
        this.customer = customerParam;
    }

    @Override
    public String getName() {
        return "Say�n " + this.customer.getName();
    }

    @Override
    public String getSurname() {
        return this.customer.getSurname();
    }

}
