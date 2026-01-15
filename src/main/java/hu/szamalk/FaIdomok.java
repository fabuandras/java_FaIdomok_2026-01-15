package hu.szamalk;

import java.util.ArrayList;
import java.util.List;

public class FaIdomok {
    private List<FaIdom> idomok;

    public FaIdomok() {
        idomok = new ArrayList<>();
    }

    public double osszSuly() {
        double osszeg = 0;
        for (FaIdom f : idomok) {
            osszeg += f.suly();
        }
        return osszeg;
    }

    public double osszGombSuly() {
        double osszeg = 0;
        for (FaIdom f : idomok) {
            if (f instanceof Gomb) {
                osszeg += f.suly();
            }
        }
        return osszeg;
    }

    public FaIdom minV() {

        return null;
    }

    public FaIdom mavV() {

        return null;
    }

    public void run() {
        idomok.add(new Gomb(3));
        idomok.add(new Hasab(2, 4, 5));
        idomok.add(new Gomb(1.5));
    }
}
