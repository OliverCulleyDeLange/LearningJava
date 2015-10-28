package uk.co.oliverdelange.basicjava.scope;

import static uk.co.oliverdelange.basicjava.HelloWorld.print;

public class ScopeClassSamePackage {
    public static void publicStaticVoid() { //Can only be accessed from its package
        print("Public - ScopeClassSamePackage");
    }
    protected static void protectedStaticVoid() { //Can only be accessed from its package
        print("protected - ScopeClassSamePackage");
    }
    private static void privateStaticVoid() {
        print("private - ScopeClassSamePackage");
    }
    static void defaultStaticVoid() {
        print("default - ScopeClassSamePackage");
    }
}
