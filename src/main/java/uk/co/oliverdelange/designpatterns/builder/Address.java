package uk.co.oliverdelange.designpatterns.builder;

import java.lang.reflect.Field;

public class Address {

    private final String houseNumber; // Required
    private final String street; // Optional
    private final String town; // Optional
    private final String city; // Optional
    private final String county; // Optional
    private final String country; // Optional
    private final String postcode; // Required

    public String getHouseNumber() {
        return houseNumber;
    }

    public String getStreet() {
        return street;
    }

    public String getTown() {
        return town;
    }

    public String getCity() {
        return city;
    }

    public String getCounty() {
        return county;
    }

    public String getCountry() {
        return country;
    }

    public String getPostcode() {
        return postcode;
    }

    public String getAddressString() {
        StringBuilder builder = new StringBuilder();
        for (Field field : Address.class.getDeclaredFields()) {
            try {
                Object fieldValue = field.get(this);
                if (fieldValue != null) {
                    builder.append(fieldValue);
                    if (field.getName() != "houseNumber") {
                        builder.append(", ");
                    } else  {
                        builder.append(" ");
                    }
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        builder.delete(builder.length()-2, builder.length());
        return builder.toString();
    }

    // Private constructor that only takes a builder
    private Address(AddressBuilder builder) {
        this.houseNumber = builder.houseNumber;
        this.street = builder.street;
        this.town = builder.town;
        this.city = builder.city;
        this.county = builder.county;
        this.country = builder.country;
        this.postcode = builder.postcode;
    }

    public static class AddressBuilder {
        private final String houseNumber; // Required
        private String street; // Optional
        private String town; // Optional
        private String city; // Optional
        private String county; // Optional
        private String country; // Optional
        private final String postcode; // Required

        public AddressBuilder(String houseNumber, String postcode) {
            this.houseNumber = houseNumber;
            this.postcode = postcode;
        }

        //Builders
        public AddressBuilder withStreet(String street) {
            this.street = street;
            return this;
        }
        public AddressBuilder withTown(String town) {
            this.town = town;
            return this;
        }
        public AddressBuilder withCity(String city) {
            this.city = city;
            return this;
        }
        public AddressBuilder withCounty(String county) {
            this.county = county;
            return this;
        }
        public AddressBuilder withCountry(String country) {
            this.country = country;
            return this;
        }
        
        // Build method that return the actual object we're building
        public Address build() {
            return new Address(this);
        }
    }
}
