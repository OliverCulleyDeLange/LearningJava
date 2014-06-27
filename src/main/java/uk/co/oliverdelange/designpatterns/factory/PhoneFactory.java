package uk.co.oliverdelange.designpatterns.factory;

public class PhoneFactory {

    public Phone nokia() {
        return new BrickPhone("Nokia", new Price(9,99));
    }

    public Phone samsung() {
        return new Phone("Samsung", new Price(15,99));
    }
}
