package hu.masterfield.exercise2;

import java.util.Arrays;

public class TEST {
    public static void main(String[] args) {
        Gabona gabona =  new Gabona();
        Gabona gabona2 =  new Gabona(1,"pehely",1,1,1,1);
        System.out.println(gabona2);
        System.out.println(Arrays.toString(gabona.getGabonaList()));

        Hozzavalo hozzavalo =  new Hozzavalo(gabona2,100);
        System.out.println(hozzavalo);
    }
}
