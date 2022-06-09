package hu.masterfield.exercise4;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercise4 {
    public static void main(String[] args) {
        System.out.println(readFile("forrasok/zoldsegek.csv"));

    }

    public static List<Zoldseg> readFile(String fileName) {
        List<Zoldseg> zoldsegek = new ArrayList<>();

        try (FileReader reader = new FileReader(fileName);
             BufferedReader bufferedReader = new BufferedReader(reader);) {

            String sor;
            bufferedReader.readLine();
            while ((sor = bufferedReader.readLine()) != null) {
                if (sor.trim().length() > 0) {
                    zoldsegek.add(new Zoldseg(sor.split(";")));
                }
            }


        } catch (IOException hiba) {
            hiba.printStackTrace();
        }

        return zoldsegek;
    }

    public static void sortAndWriteFile(List<Zoldseg> zoldsegek) {
        Collections.sort(zoldsegek); // ezt a ZOLDSEG-osztályba compartoval rendezük kalória szerint!
        try (FileWriter writer = new FileWriter("forrasok/rendezett_zoldsegek.csv");
             PrintWriter pw = new PrintWriter(writer);) {
            pw.println("Sorszám;Megnevezés;Fehérje(g);Zsír(g);Szénhidrát(g);Kalória(kcal)");
            for (Zoldseg zoldseg : zoldsegek) {
                pw.println(
                        zoldseg.getId() + ";"
                                + zoldseg.getNev() + ";"
                                + zoldseg.getFeherje() + ";"
                                + zoldseg.getZsir() + ";"
                                + zoldseg.getSzenhidrat() + ";"
                                + zoldseg.getKaloria()
                );
            }
        } catch (IOException hiba) {
            hiba.printStackTrace();
        }
    }


}
