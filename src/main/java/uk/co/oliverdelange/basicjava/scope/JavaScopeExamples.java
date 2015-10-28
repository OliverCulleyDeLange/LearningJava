package uk.co.oliverdelange.basicjava.scope;

import uk.co.oliverdelange.basicjava.scope2.ScopeClassDifferentPackage;

import static uk.co.oliverdelange.basicjava.HelloWorld.print;

public class JavaScopeExamples {

    public static void main(String[] args) {
        // Methods contained in this Class
        publicStaticVoid();
        protectedStaticVoid();
        privateStaticVoid();
        defaultStaticVoid();

        // Methods contained in Class within same package as this Class
        ScopeClassSamePackage.publicStaticVoid();
        ScopeClassSamePackage.protectedStaticVoid();
        //Can't access private methods.
        ScopeClassSamePackage.defaultStaticVoid();

        // Methods contained in a Class within a different Package
        ScopeClassDifferentPackage.publicStaticVoid();
        //Can't access protected methods.
        //Can't access private methods.
        //Can't access default methods.

        //TODO Scope concerned with subclassing & Polymorphism
    }


    public static void publicStaticVoid() { //Can only be accessed from its package
        print("Public - JavaScopeExamples");
    }
    protected static void protectedStaticVoid() { //Can only be accessed from its package
        print("protected - JavaScopeExamples");
    }
    private static void privateStaticVoid() {
        print("private - JavaScopeExamples");
    }
    static void defaultStaticVoid() {
        print("default - JavaScopeExamples");
    }
}
