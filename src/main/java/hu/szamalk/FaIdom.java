package hu.szamalk;

public abstract class FaIdom {
    protected double fajSuly = 0.8;

    public abstract double terfogat();

    public double suly() {
        return terfogat() * fajSuly;
    }

    @Override
    public String toString() {
        return "Faldom{terfogat=" + terfogat() + ", suly=" + suly() + "}";
    }
}