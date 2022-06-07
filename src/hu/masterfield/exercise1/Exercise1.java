package hu.masterfield.exercise1;

public class Exercise1 {
    public static void main(String[] args) {
        String[][] gds = GabonakDataSource.getGabonak();
        // System.out.println(getGabonaData(gds, 5));
        //System.out.println(Arrays.toString(getFogyokuras(gds)));
        // System.out.println(getCal(gds,5,300));
        System.out.println(getMaxCalIndex(gds));
    }

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
        // "5. Búzapehely - Fehérje:12g Zsír:2g Szénhidrát:66g Kalória:339kcal", gabonaData

    }

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

    public static double getCal(String[][] gabonak, int gabonaId, int mennyiseg) {
        return Double.parseDouble(gabonak[gabonaId][5]) * mennyiseg / 100;
    }

    public static int getMaxCalIndex(String[][] gabonak) {
        double maxCal = 0;
        int maxCalIndex = 0;
        for (int i = 0; i < gabonak.length; i++) {
            if (getCal(gabonak, i, 100) > maxCal) {
                maxCal = getCal(gabonak, i, 100);
                maxCalIndex = i;
            }
        }
        return maxCalIndex;
    }

}
