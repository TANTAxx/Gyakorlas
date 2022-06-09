package hu.masterfield.exercise1;

public class Exercise1 {
    public static void main(String[] args) {
        String[][] gds = GabonakDataSource.getGabonak();
        // System.out.println(getGabonaData(gds, 5));
        //System.out.println(Arrays.toString(getFogyokuras(gds)));
        // System.out.println(getCal(gds,5,300));
       // System.out.println(getMaxCalIndex(gds));
        System.out.println(getMinCalIndex(gds));
    }

    /*
    * 1.A programozási nyelv alapjai:
    * Adott indexű gabona összes adatával tér vissza
    * Bemenet gabona tömb és az adott gabona indexe
    * Kimenete String formátumú a következő adatokkal
    * //"5. Búzapehely - Fehérje:12g Zsír:2g Szénhidrát:66g Kalória:339kcal"a//
    */
    public static String getGabonaData(String[][] gabonak, int i) {
        StringBuilder gabonaData = new StringBuilder();
        gabonaData.append(gabonak[i][0]);
        gabonaData.append(". ");
        gabonaData.append(gabonak[i][1]);
        gabonaData.append(" - ");
        gabonaData.append("Fehérje:");
        gabonaData.append(gabonak[i][2]);
        gabonaData.append("g Zsír:");
        gabonaData.append(gabonak[i][3]);
        gabonaData.append("g Szénhidrát:");
        gabonaData.append(gabonak[i][4]);
        gabonaData.append("g Kalória:");
        gabonaData.append(gabonak[i][5]);
        gabonaData.append("kcal");

        return gabonaData.toString();


    }
    /*
    * Azon termék nevek tömbje, amelyeknek kalória értéke kisebb az átlag kalória értéknél
    * Bemenet gabona tömb
    * Kimenet String formátumú az átlagnál alacsonyabb energiatartalmú gabonák minden adatával
    */

    public static String[] getFogyokuras(String[][] gabonak) {
        // átlagolás
        double osszeg = 0;
        for (String[] gabona : gabonak) {
            osszeg += Double.parseDouble(gabona[5]);
        }
        double atlag = osszeg / gabonak.length;
        //  System.out.println(atlag);
        int fSzamlalo = 0;
        for (String[] gabona : gabonak) {
            if (Double.parseDouble(gabona[5]) < atlag) {
                fSzamlalo++;
            }
        }
        String[] fogyokurasak = new String[fSzamlalo];
        int index = 0;
        for (int i = 0; i < gabonak.length; i++) {
            if (Double.parseDouble(gabonak[i][5]) < atlag) {
                fogyokurasak[index++] = getGabonaData(gabonak, i);
            }
        }
        return fogyokurasak;
    }
    /*
    * Adott id-vel rendelkező, adott mennyiségű gabona kalória értékét adja vissza
    * A táblázat mindig 100 g termék adatait tartalmaza!
    * Bemenet gabonak tömb, egy gabona id és egy grammban kifejezet mennyiség
    * Kimenete egy double tipusú tört az adott gabona kalória tartalmával */
    public static double getCal(String[][] gabonak, int gabonaId, int mennyiseg) {
        return Double.parseDouble(gabonak[gabonaId][5]) * mennyiseg / 100;
    }

    /* Legmagasabb energiájú gabona indexének keresése
    * Bemenet egy gabona tömb , Kimenet egy gabona index (egész) */
    public static int getMaxCalIndex(String[][] gabonak) {
        double maxCal = 0;
        int maxCalIndex= 0;
        for (int i = 0; i < gabonak.length; i++) {
            if (getCal(gabonak, i, 100) > maxCal) {
                maxCal = getCal(gabonak, i, 100);
                maxCalIndex = i;
            }
        }
        return maxCalIndex;
    }
    /* Legkisebb energiájú gabona indexének keresése
     * Bemenet egy gabona tömb , Kimenet egy gabona index (egész) */
    public static int getMinCalIndex(String[][] gabonak){
        double minCal = 500;
        int minCalIndex = 500;
        for (int i = 0; i < gabonak.length; i++) {
            if(getCal(gabonak,i,100) < minCal){
                minCal = getCal(gabonak,i,100);
                minCalIndex = i;
            }
        }
        return minCalIndex;
    }

}
