package hu.szamalk.idomok;

public class Gomb extends FaIdom {
    private double sugar;

    public Gomb(double sugar) {
        this.sugar = sugar;
    }

    public double terfogat() {
        return (4.0 / 3.0) * Math.PI * Math.pow(sugar, 3);
    }

    @Override
    public String toString() {
        return "Gomb{sugar=" + sugar + ", terfogat=" + terfogat() + ", suly=" + suly() + "}";
    }
}
