package org.bodenseeCodeAcademy;

public class StringType {
    public static void main(String[] args) {

        String greeting= "Welcome to BCA! ";
        System.out.println(greeting);

        String greetUpperCase= "Welcome to BCA! ";
        greetUpperCase= greetUpperCase.toUpperCase();

        System.out.println(greetUpperCase);
        String greetLowerCase= "Welcome to BCA! ".toLowerCase();

        System.out.println(greetLowerCase);
        String greetWithSpaces= "   Welcome to BCA!      ";

        greetWithSpaces=greetWithSpaces.trim();
        System.out.println(greetWithSpaces);

        String searchFor="BCA";
        int firstIndex= greeting.indexOf(searchFor);
        System.out.println("First Index Of "+searchFor+ " in the String : "+greeting+" is = "+firstIndex);

        boolean isTheStringContainsSearchFor= greeting.contains(searchFor);
        System.out.println(greeting+" contains "+searchFor +" is= "+isTheStringContainsSearchFor);

//        greeting=greeting.substring(0,11);
        System.out.println(greeting);



        System.out.println("Length of the greeteing String="+greeting.length());

        String lastPart=greeting.substring(11,16); //Magic Numbers!!
        System.out.println("last part of greeting= "+lastPart);

        String cleanLastPart=greeting.substring(greeting.indexOf(searchFor));
        System.out.println("Last Part ="+cleanLastPart);

        //change Welcome to BCA! -->Welcome to Friedrichshafen!
        //1.Way
        //1. find the index of BCA!
        int indexofBCA=greeting.indexOf(searchFor);
        System.out.println("indexofBCA "+indexofBCA);
        //2.take the required part of the string
        String firstPart=greeting.substring(0,indexofBCA);
        System.out.println("first Part = "+firstPart);

        String newGreeting=  firstPart+"Friedrichshafen!";

        System.out.println(newGreeting);

        //2.way
        String toReplace="Friedrichshafen";
        String newEasyGreeting=greeting.replace(searchFor,toReplace);
        System.out.println(newEasyGreeting);
    }
}
