package uk.co.oliverdelange.basicjava.scope;

import static uk.co.oliverdelange.basicjava.HelloWorld.print;

public class scopeClassSamePackage {
    public static void publicStaticVoid() { //Can only be accessed from its package
        print("Public - scopeClassSamePackage");
    }
    protected static void protectedStaticVoid() { //Can only be accessed from its package
        print("protected - scopeClassSamePackage");
    }
    private static void privateStaticVoid() {
        print("private - scopeClassSamePackage");
    }
    static void defaultStaticVoid() {
        print("default - scopeClassSamePackage");
    }
}
