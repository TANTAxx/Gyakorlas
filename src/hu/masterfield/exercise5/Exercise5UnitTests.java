package hu.masterfield.exercise5;

import hu.masterfield.exercise2.Gabona;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class Exercise5UnitTests {

    @Test
    void test1() {
        exercise5.createTable();
    }

    @Test
    void test2() {
        exercise5.insertRecords();
    }

    @Test
    void test3() {
        exercise5.retriveRecords();
    }

    @Test
    void test4() {
        List<Gabona> list = exercise5.getGabonaList();
        assertNotNull(list);
    }

    @Test
    void test5() {
        List<Gabona> list = exercise5.getGabonaList();
        assertEquals(34, list.size());
    }

    @Test
    void test6() {
        List<Gabona> list = exercise5.getGabonaList();
        assertEquals(33, list.get(0).getId());
    }

    @Test
    void test7() {
        List<Gabona> list = exercise5.getGabonaList();
        assertEquals(0, list.get(list.size() - 1).getId());
    }

    @Test
    void test8() {
        exercise5.updateRecord(new String[]{"11", "Kifli (sós, tejes)", "20", "6", "116", "616"});
        List<Gabona> list = exercise5.getGabonaList();
        System.out.println(list);
        assertEquals(11, list.get(22).getId());
        assertEquals(20, list.get(22).getFeherje());
        assertEquals(6, list.get(22).getZsir());
        assertEquals(116, list.get(22).getSzenhidrat());
        assertEquals(616, list.get(22).getKaloria());
    }

}
