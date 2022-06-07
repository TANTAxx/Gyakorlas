package hu.masterfield.exercise1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class Exercise1UnitTests {

    @Test
    void test1() {
        String[][] gabonak = GabonakDataSource.getGabonak();

        double energia = Exercise1.getCal(gabonak, 5, 300);
        assertEquals(1017, energia);
    }

    @Test
    void test2() {
        String[][] gabonak = GabonakDataSource.getGabonak();

        String gabonaData = Exercise1.getGabonaData(gabonak, 5);
        assertEquals("5. Búzapehely - Fehérje:12g Zsír:2g Szénhidrát:66g Kalória:339kcal", gabonaData);
    }

    @Test
    void test3() {
        String[][] gabonak = GabonakDataSource.getGabonak();

        int maxCalIndex = Exercise1.getMaxCalIndex(gabonak);
        assertEquals(14, maxCalIndex);
    }

    @Test
    void test4() {
        String[][] gabonak = GabonakDataSource.getGabonak();

        String[] fogyokurasak = Exercise1.getFogyokuras(gabonak);
        assertNotNull(fogyokurasak);
    }

    @Test
    void test5() {
        String[][] gabonak = GabonakDataSource.getGabonak();

        String[] fogyokurasak = Exercise1.getFogyokuras(gabonak);
        assertEquals(fogyokurasak.length, 12);
    }
}
