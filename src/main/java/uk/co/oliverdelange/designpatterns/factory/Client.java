package uk.co.oliverdelange.designpatterns.factory;

import static uk.co.oliverdelange.basicjava.HelloWorld.print;

public class Client {

    public static void main(String[] args) {
        PhoneFactory factory = new PhoneFactory();

        Phone myOldPhone = factory.nokia();
        Phone myNewPhone = factory.samsung();

        print("My old phone was a " + myOldPhone.getName());
        print("My new phone costs " + myNewPhone.getPrice().getString());

    }
}
