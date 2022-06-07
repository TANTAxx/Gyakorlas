package hu.masterfield.exercise3;

import java.util.Objects;

public class Alapanyag {

    private int id;
    private String nev;
    private double feherje;
    private double zsir;
    private double szenhidrat;
    private double kaloria;


    @Override
    public int hashCode() {
        return Objects.hash(id, nev, feherje, zsir, szenhidrat, kaloria);
    }

    public int getId() {
        return id;
    }

    public String getNev() {
        return nev;
    }

    public double getFeherje() {
        return feherje;
    }

    public double getZsir() {
        return zsir;
    }

    public double getSzenhidrat() {
        return szenhidrat;
    }

    public double getKaloria() {
        return kaloria;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Alapanyag{");
        sb.append("id=").append(id);
        sb.append(", nev='").append(nev).append('\'');
        sb.append(", feherje=").append(feherje);
        sb.append(", zsir=").append(zsir);
        sb.append(", szenhidrat=").append(szenhidrat);
        sb.append(", kaloria=").append(kaloria);
        sb.append("}\n");
        return sb.toString();
    }

    public Alapanyag(int id, String nev, double feherje, double zsir, double szenhidrat, double kaloria) {
        this.id = id;
        this.nev = nev;
        this.feherje = feherje;
        this.zsir = zsir;
        this.szenhidrat = szenhidrat;
        this.kaloria = kaloria;
    }
}
