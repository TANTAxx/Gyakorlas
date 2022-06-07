package hu.masterfield.exercise3;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class Exercise3UnitTests {

    Exercise3 ex3 = new Exercise3();
    List<Alapanyag> alapanyagList = new AlapanyagokDatasource().getAlapanyagok();

    @Test
    void test1() {
        List<Alapanyag> list = ex3.sortByNev(alapanyagList);
        assertNotNull(list);
    }

    @Test
    void test2() {
        List<Alapanyag> list = ex3.sortByNev(alapanyagList);
        assertEquals(198, list.size());
    }

    @Test
    void test3() {
        List<Alapanyag> list = ex3.sortByNev(alapanyagList);
        assertEquals(120, list.get(0).getId());
    }

    @Test
    void test4() {
        List<Alapanyag> list = ex3.sortByNev(alapanyagList);
        assertEquals(163, list.get(list.size() - 1).getId());
    }

    @Test
    void test5() {
        List<Alapanyag> list = ex3.sortBySzenhidrat(alapanyagList);
        assertEquals(17, list.get(0).getId());
    }

    @Test
    void test6() {
        List<Alapanyag> list = ex3.sortBySzenhidrat(alapanyagList);
        assertEquals(97, list.get(list.size() - 1).getId());
    }

    @Test
    void test7() {
        Alapanyag maxCal = ex3.getMaxCal(alapanyagList);
        assertEquals(191, maxCal.getId());
    }

    @Test
    void test8() {
        Alapanyag maxCal = ex3.getMaxCal(alapanyagList);
        assertEquals(709, maxCal.getKaloria());
    }
}
