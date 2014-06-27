package uk.co.oliverdelange.basicjava;

import static uk.co.oliverdelange.basicjava.HelloWorld.print;

public class AccessModifiers {
    //TODO access modifiers for variables, interfaces, enums etc

    // public = Access anywhere
    // static = accessed via classname.method
    // void = no return object
    public static void main(String[] args) {
        print("Printed from public static void main method");
    }

    private void privateMethod() {
        print("Printed from private method in " + this.getClass().toString());
    }

    protected void protectedMethod() {

    }

    synchronized void synchronisedMethod() {
        print("This method is Thread Safe");
    }

    void defaultAccessMethod() {

    }
}