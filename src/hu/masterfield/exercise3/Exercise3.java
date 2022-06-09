package hu.masterfield.exercise3;

import java.util.*;

public class Exercise3 {
    public static void main(String[] args) {
    }

    //Rendezd sorba az adatszerkezetet a név alapján (ASCII kód alapú) ABC rendbe, Ékezetes karakterek a végére kerüljenek
    // Comparatort használj!
    public List<Alapanyag> sortByNev(List<Alapanyag> alapanyagList) {
        alapanyagList.sort(new Comparator<Alapanyag>() {
            @Override
            public int compare(Alapanyag o1, Alapanyag o2) {
                return o1.getNev().compareTo(o2.getNev());
            }
        });
        return alapanyagList;
    }
// hasonló mind az első de a Double tipusnka van külön compare függvénye amit tudunk használni
    public List<Alapanyag> sortBySzenhidrat(List<Alapanyag> alapanyagList) {
        alapanyagList.sort(new Comparator<Alapanyag>() {
            @Override
            public int compare(Alapanyag o1, Alapanyag o2) {
                // return (int) (o1.getSzenhidrat() - o2.getSzenhidrat());
                return Double.compare(o2.getSzenhidrat(), o1.getSzenhidrat());
            }
        });
        return alapanyagList;
    }
// hasonló mind az első de a Double tipusnka van külön compare függvénye amit tudunk használni
    public Alapanyag getMaxCal(List<Alapanyag> alapanyagList) {
        Alapanyag maxAlapanyag = Collections.max(alapanyagList, new Comparator<Alapanyag>() {
            @Override
            public int compare(Alapanyag o1, Alapanyag o2) {
                return Double.compare(o1.getKaloria(), o2.getKaloria());
            }
        });
        return maxAlapanyag;
    }
    //Néhány elem ismétlődik Olyan kolleckiót kell vissza adni ami gondoskodik az egyediségről
    public Set<Alapanyag> getUniqueList(List<Alapanyag> alapanyagList){
        Set<Alapanyag> uniqeList = new HashSet<>(alapanyagList);
        return uniqeList;
    }
    //Adja vissza hogy hány elem ismétlődik
    public int getDuplicateNum(List<Alapanyag> alapanyagList){
        return alapanyagList.size() - getUniqueList(alapanyagList).size();
    }

}
