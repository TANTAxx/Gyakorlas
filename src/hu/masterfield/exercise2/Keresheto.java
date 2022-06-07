package hu.masterfield.exercise2;

public interface Keresheto {
    /* Gabona példánnyal visszatérő függvény. A példány mezői föltöltve az index alapján.*/
    Gabona getGabona(int index);

    /*  Gabonák tömbjét képes visszaadni, amihez az excercise1.GabonakDataSource adatait használja föl.
        A rendezés a Gabona osztály alapértelmezett rendezése szerint készüljön.*/
    Gabona[] getGabonaList();


}
