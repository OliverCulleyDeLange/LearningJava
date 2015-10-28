package uk.co.oliverdelange.basicjava;

public class PrimitiveVariables {

    public static void main(String[] args) {
        defineVariablesOfAllTypes();
    }

    public static void defineVariablesOfAllTypes() {
        //Integers
        byte aByte = 127; // An 8 bit number | -128 to 127
        short aShort = 32767; // A 16 bit number | -32,768 to 32,767
        int anInt = 2147483647; // A 32 bit number | -2^31 to 2^31-1
        long aLong = 999999999; // A 64 bit number | Supposedly -2^63 to 2^63-1
        //Floating points
        float aFloat = 98765.43210f;  // A 32 bit floating point number
        double aDouble = 12345.6789; // A 64 bit floating point number
        //Booleans
        boolean aBoolean = true;
        //Characters
        char aChar = 42; // A character - but not the character itself - the 16 bit unicode character
        //String
        String aString = "This is a string";
    }
}
