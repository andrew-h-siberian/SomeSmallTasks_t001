package com.andrewfromfarnorth;

//import java.util.logging.*;
//import java.util.regex.*;


public class Main {

    public static void main(String[] args) {
        /*int x = 2;
        System.out.println(5 / x);*/
        int[] array = {1, 3, 5, 7, 9};
        VagueList vagueList = new VagueList(array);
        System.out.println(vagueList.getLength());
        System.out.println(vagueList.getLength());
        System.out.println("element number " + 4 + " is " + vagueList.getMember(4));
        System.out.println("element number " + 4 + " is " + vagueList.getMember(4));
    }
}
