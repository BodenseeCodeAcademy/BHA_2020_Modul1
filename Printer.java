package org.bca.java.encapsulation;

public class Printer {


 private   int tonerLevel =100;
 private   int numberOfPagesPrinted =0;
 private   boolean duplex;

    public Printer(boolean duplex) {
        this.duplex=duplex;
    }

    public Printer(int tonerLevel,boolean duplex) {
        this(duplex);
        if(tonerLevel>0&&tonerLevel<=100){
            this.tonerLevel=tonerLevel;
        }
    }

    public void fillUpToner(int level){
        int newLevel =tonerLevel+level;
        if(newLevel>100){
            newLevel=100;
        }
        tonerLevel=newLevel;
    }

    public void simulatePrinting(){
        if(tonerLevel>0){
            numberOfPagesPrinted++;
            tonerLevel--;
        }
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public void setTonerLevel(int tonerLevel) {
        this.tonerLevel = tonerLevel;
    }

    public int getNumberOfPagesPrinted() {
        return numberOfPagesPrinted;
    }

    public boolean isDuplex() {
        return duplex;
    }

    public void setDuplex(boolean duplex) {
        this.duplex = duplex;
    }
}
