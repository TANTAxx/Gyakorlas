package hu.masterfield.exercise2;

public class Hozzavalo extends Gabona {
    private double mennyiseg;

    public Hozzavalo(int id, String nev, double feherje, double zsir, double szenhidrat, double kaloria, double mennyiseg) {
        super(id, nev, feherje, zsir, szenhidrat, kaloria);
        this.mennyiseg = mennyiseg;
    }

    public Hozzavalo(Gabona gabona, double mennyiseg) {
        super(
                gabona.getId(),
                gabona.getNev(),
                gabona.getFeherje(),
                gabona.getZsir(),
                gabona.getSzenhidrat(),
                gabona.getKaloria()
        );
        this.mennyiseg = mennyiseg;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer(
                "Hozzavalo{" + super.toString());
        sb.append("mennyiseg=").append(mennyiseg);
        sb.append('}');
        return sb.toString();
    }

    public double getMennyiseg() {
        return mennyiseg;
    }

    public void setMennyiseg(double mennyiseg) {
        this.mennyiseg = mennyiseg;
    }
}
