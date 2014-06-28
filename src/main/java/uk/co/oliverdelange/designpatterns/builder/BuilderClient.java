package uk.co.oliverdelange.designpatterns.builder;

import static uk.co.oliverdelange.basicjava.HelloWorld.print;

public class BuilderClient {

    public static void main(String[] args) {

        // I want an address with the bare minimum through a handy static factory method
        Address address1 = getBasicAddress();
        // Or you can simply new up a builder and build it into a Variable
        Address address2 = new Address.AddressBuilder("2", "SL2 5DX").build();
        Address address3 = new Address.AddressBuilder("666", "D3V 1L")
                .withStreet("Nightmare road")
                .withCity("Devil Island")
                .withCounty("Middle earth shire")
                .withCountry("Middle Earth")
                .build();

        print(address1.getAddressString());
        print(address2.getAddressString());
        print(address3.getAddressString());
    }

    private static Address getBasicAddress() {
        return new Address.AddressBuilder("1", "SL1 4DX").build();
    }
}
