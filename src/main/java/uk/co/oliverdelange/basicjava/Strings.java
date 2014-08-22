package uk.co.oliverdelange.basicjava;

public class Strings {
    public static void main(String[] args) {
        //Some strings to play with
        String firstNameString = new String("Olly"); // New string object will be created
        String firstNamesObjectReference = firstNameString; // References same object as firstNameString
        String firstNameMadeAgain = new String("Olly"); // New String object creaated as not using string pool
        String firstNameStringPool = "Olly"; // New string created in string pool

        String secondNameString = new String("de Lange"); // New String object creaated as not using string pool
        String notDuplicateSecondName = new String("de Lange"); // New String object creaated as not using string pool
        String secondNameStringPool = "de Lange"; // Will look for 'de Lange' in string pool, if found - reference it, otherwise create it.
        String duplicateSecondNameStringPool = "de Lange"; //So this will reference the same string as secondNameStringPool

        System.out.println(firstNameString == firstNameMadeAgain); // False as they are seperate objects
        System.out.println(firstNameString.equals(firstNameMadeAgain)); // True as they are made up of same character array

        System.out.println(firstNameString == firstNamesObjectReference); // True as they reference same object

        System.out.println(secondNameStringPool == duplicateSecondNameStringPool); // True as they reference the same string in the string pool

        String needsTrimming = "  some   text   ";
        System.out.println(needsTrimming.trim()); // Will remove white space either side but not inside string


        System.out.println(firstNameString.contains("ly")); // True
        System.out.println(firstNameString.contains("oly")); // False

        System.out.println(firstNameString.charAt(1) + " should be l"); // indexing starts at 0 so its the second letter

        System.out.println(firstNameString.concat(secondNameString)); // Ollyde Lange

        System.out.println(firstNameStringPool.length() + " should equal 4"); // 4 characters in string...

        System.out.println(firstNameString.replace('O', 'A')); // Ally

        System.out.println(firstNameString.substring(1,2)); // l because doesn't include letter at last index

    }
}
