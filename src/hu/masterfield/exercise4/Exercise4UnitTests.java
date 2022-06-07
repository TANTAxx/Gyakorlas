package hu.masterfield.exercise4;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class Exercise4UnitTests {

    @Test
    void test1() {
        List<Zoldseg> zoldsegek = Exercise4.readFile("forrasok/zoldsegek.csv");
        assertNotNull(zoldsegek);
    }

    @Test
    void test2() {
        List<Zoldseg> zoldsegek = Exercise4.readFile("forrasok/zoldsegek.csv");
        assertEquals(84, zoldsegek.size());
    }

    @Test
    void test3() {
        List<Zoldseg> zoldsegek = Exercise4.readFile("forrasok/zoldsegek.csv");
        Exercise4.sortAndWriteFile(zoldsegek);

        File file = new File("forrasok/rendezett_zoldsegek.csv");
        assertTrue(file.exists());
    }

    @Test
    void test4() {
        List<Zoldseg> zoldsegek = Exercise4.readFile("forrasok/rendezett_zoldsegek.csv");
        assertEquals(62, zoldsegek.get(0).getId());
    }

    @Test
    void test5() {
        List<Zoldseg> zoldsegek = Exercise4.readFile("forrasok/rendezett_zoldsegek.csv");
        assertEquals(84, zoldsegek.size());
    }

    @Test
    void test6() {
        List<Zoldseg> zoldsegek = Exercise4.readFile("forrasok/rendezett_zoldsegek.csv");
        assertEquals(65, zoldsegek.get(zoldsegek.size() - 1).getId());
    }

}
