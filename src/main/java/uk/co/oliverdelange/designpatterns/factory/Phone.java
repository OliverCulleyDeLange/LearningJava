package uk.co.oliverdelange.designpatterns.factory;

public class Phone {

    private String name;
    private Price price;

    public String getName() {
        return name;
    }

    public Price getPrice() {
        return price;
    }

    public Phone(String name, Price price) {
        this.name = name;
        this.price = price;
    }


}
