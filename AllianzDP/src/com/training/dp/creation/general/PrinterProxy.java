package com.training.dp.creation.general;


public class PrinterProxy extends Printer {

    private final Printer printer;

    @Override
    public void print(final Customer customerParam) {
        System.out.println("Print i�lemi ba�l�yor");
        this.printer.print(customerParam);
        System.out.println("Print i�lemi bitti");
    }

    public PrinterProxy(final Printer printerParam) {
        this.printer = printerParam;
    }
}
