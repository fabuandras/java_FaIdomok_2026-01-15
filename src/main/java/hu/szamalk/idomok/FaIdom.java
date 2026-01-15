package hu.szamalk.idomok;

public abstract class FaIdom {
    protected double fajSuly = 0.8;

    public static double getFajsuly() {
        return FaIdom.getFajsuly();
    }

    public abstract double terfogat();

    public double suly() {
        return terfogat() * fajSuly;
    }

    @Override
    public String toString() {
        return "Faldom{terfogat=" + terfogat() + ", suly=" + suly() + "}";
    }

    public abstract int getA();

    public abstract int getB();

    public abstract int getM();
}