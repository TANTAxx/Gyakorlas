package hu.masterfield.exercise4;

import java.io.Serializable;

public class Zoldseg implements Serializable, Comparable {

    private int id;
    private String nev;
    private double feherje;
    private double zsir;
    private double szenhidrat;
    private double kaloria;

    public Zoldseg(int id, String nev, double feherje, double zsir, double szenhidrat, double kaloria) {
        this.id = id;
        this.nev = nev;
        this.feherje = feherje;
        this.zsir = zsir;
        this.szenhidrat = szenhidrat;
        this.kaloria = kaloria;
    }

    public Zoldseg(String[] data) {
        this.id = Integer.parseInt(data[0]);
        this.nev = data[1];
        this.feherje = Double.parseDouble(data[2]);
        this.zsir = Double.parseDouble(data[3]);
        this.szenhidrat = Double.parseDouble(data[4]);
        this.kaloria = Double.parseDouble(data[5]);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Zoldseg{");
        sb.append("id=").append(id);
        sb.append(", nev='").append(nev).append('\'');
        sb.append(", feherje=").append(feherje);
        sb.append(", zsir=").append(zsir);
        sb.append(", szenhidrat=").append(szenhidrat);
        sb.append(", kaloria=").append(kaloria);
        sb.append('}');
        return sb.toString();
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
    public int compareTo(Object o) {
        return Double.compare(kaloria, ((Zoldseg) o).kaloria);
    }
}
