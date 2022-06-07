package hu.masterfield.exercise3;

import java.util.*;

public class Exercise3 {
    public static void main(String[] args) {
    }

    public List<Alapanyag> sortByNev(List<Alapanyag> alapanyagList) {
        alapanyagList.sort(new Comparator<Alapanyag>() {
            @Override
            public int compare(Alapanyag o1, Alapanyag o2) {
                return o1.getNev().compareTo(o2.getNev());
            }
        });
        return alapanyagList;
    }

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

    public Alapanyag getMaxCal(List<Alapanyag> alapanyagList) {
        Alapanyag maxAlapanyag = Collections.max(alapanyagList, new Comparator<Alapanyag>() {
            @Override
            public int compare(Alapanyag o1, Alapanyag o2) {
                return Double.compare(o1.getKaloria(), o2.getKaloria());
            }
        });
        return maxAlapanyag;
    }
    public Set<Alapanyag> getUniqueList(List<Alapanyag> alapanyagList){
        Set<Alapanyag> uniqeList = new HashSet<>(alapanyagList);
        return uniqeList;
    }
    public int getDuplicateNum(List<Alapanyag> alapanyagList){
        return alapanyagList.size() - getUniqueList(alapanyagList).size();
    }

}
