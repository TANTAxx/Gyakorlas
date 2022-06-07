package hu.masterfield.exercise2;

import hu.masterfield.exercise1.GabonakDataSource;

import java.util.Arrays;

public class Gabona implements Keresheto, Comparable {
    private int id;
    private String nev;
    private double feherje;
    private double zsir;
    private double szenhidrat;
    private double kaloria;

    public Gabona() {
    }

    public Gabona(int id, String nev, double feherje, double zsir, double szenhidrat, double kaloria) {
        this.id = id;
        this.nev = nev;
        this.feherje = feherje;
        this.zsir = zsir;
        this.szenhidrat = szenhidrat;
        this.kaloria = kaloria;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public double getFeherje() {
        return feherje;
    }

    public void setFeherje(double feherje) {
        this.feherje = feherje;
    }

    public double getZsir() {
        return zsir;
    }

    public void setZsir(double zsir) {
        this.zsir = zsir;
    }

    public double getSzenhidrat() {
        return szenhidrat;
    }

    public void setSzenhidrat(double szenhidrat) {
        this.szenhidrat = szenhidrat;
    }

    public double getKaloria() {
        return kaloria;
    }

    public void setKaloria(double kaloria) {
        this.kaloria = kaloria;
    }

    @Override
    public Gabona getGabona(int index) {
        String[] gabonaData = GabonakDataSource.getGabonak()[index];
        Gabona gabona = new Gabona(
                Integer.parseInt(gabonaData[0]),
                gabonaData[1],
                Double.parseDouble(gabonaData[2]),
                Double.parseDouble(gabonaData[3]),
                Double.parseDouble(gabonaData[4]),
                Double.parseDouble(gabonaData[5])
        );
        return gabona;
    }

    @Override
    public Gabona[] getGabonaList() {
        int gabonakLength = GabonakDataSource.getGabonak().length;
        Gabona[] gabonak = new Gabona[gabonakLength];
        for (int i = 0; i < gabonakLength; i++) {
            gabonak[i] = getGabona(i);
        }
        Arrays.sort(gabonak);

        return gabonak;
    }

    @Override
    public int compareTo(Object o) {
        return (int) ((this.szenhidrat - ((Gabona) o).getSzenhidrat()) * 100);
    }

    @Override
    public String toString() {
        return "Gabona{" +
                "id=" + id +
                ", nev='" + nev + '\'' +
                ", feherje=" + feherje +
                ", zsir=" + zsir +
                ", szenhidrat=" + szenhidrat +
                ", kaloria=" + kaloria +
                '}';
    }
}
