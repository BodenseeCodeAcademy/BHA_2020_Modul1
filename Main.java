package org.bca.java.encapsulation;

public class Main {

    public static void main(String[] args) {

        Printer printer= new Printer(100,false);

        writePrinterStatus(printer);

        for(int i=0;i<20;i++) {
            printer.simulatePrinting();
        }

        writePrinterStatus(printer);

        printer.fillUpToner(50);

        writePrinterStatus(printer);

    }

    private static void writePrinterStatus(Printer printer) {
        System.out.println("Is duplex="+printer.isDuplex());
        System.out.println("Toner Level="+printer.getTonerLevel());
        System.out.println("Number pages printed="+printer.getNumberOfPagesPrinted());
    }

}
