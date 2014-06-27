package uk.co.oliverdelange.designpatterns.factory;

public class Price {

    private int pounds, pence;
    private String string;

    public int getPounds() {
        return pounds;
    }

    public int getPence() {
        return pence;
    }

    public String getString() {
        return string;
    }

    public Price(int pounds, int pence) {
        this.pounds = pounds;
        this.pence = pence;
        this.string = "£" + pounds + "." + pence;
    }
}
