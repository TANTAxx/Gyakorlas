package hu.masterfield.exercise2;

import hu.masterfield.exercise1.Exercise1;
import hu.masterfield.exercise1.GabonakDataSource;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class Exercise2UnitTests {

    @Test
    void test1() {
        Gabona[] gabonak = new Gabona().getGabonaList();
        assertNotNull(gabonak);
    }

    @Test
    void test2() {
        Gabona[] gabonak = new Gabona().getGabonaList();
        assertEquals(34, gabonak.length);
    }

  /*  @Test
    void test3() {
        Gabona[] gabonak = new Gabona().getGabonaList();
        Hozzavalo hozzavalo = new Hozzavalo(gabonak[6], 200);
        assertEquals(4, hozzavalo.getId());
    }

    @Test
    void test4() {
        Gabona[] gabonak = new Gabona().getGabonaList();
        System.out.println(Arrays.toString(gabonak));
        Hozzavalo hozzavalo = new Hozzavalo(gabonak[6], 200);
        assertEquals(51, hozzavalo.getSzenhidrat());
    }

    @Test
    void test5() {
        Gabona[] gabonak = new Gabona().getGabonaList();
        Hozzavalo hozzavalo = new Hozzavalo(gabonak[6], 200);
        assertEquals(200, hozzavalo.getMennyiseg());
    }


   */
    @Test
    void test6() {
        Gabona gabona = new Gabona();
        assertNotNull(gabona);
    }

    @Test
    void test7() {
        Gabona gabona = new Gabona(99, "Búzacsíra", 25d, 25d, 25, 999);
        assertNotNull(gabona);
    }

    @Test
    void test8() {
        Gabona gabona = new Gabona(99, "Búzacsíra", 25d, 25d, 25, 999);
        assertEquals(99, gabona.getId());
    }
}
