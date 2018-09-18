package com.andrewfromfarnorth;

import java.util.Random;

public class VagueList {
    private int[] cont;

    public VagueList() {
        System.out.println("Test");
    }
    VagueList(int[] cont) {
        this.cont = cont;
    }

    int getLength() {
        final Random random = new Random();
        final int randomInt = random.nextInt(cont.length);
        final int i = randomInt * 2;
        return i;
    }

    int getMember(int index) {
        final Random random = new Random();
        final int randomInt = random.nextInt(3) - 1;
        final int result = cont[(index + randomInt) % cont.length] ;
        return result;
    }

}
