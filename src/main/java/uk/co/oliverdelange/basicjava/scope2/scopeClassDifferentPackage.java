package uk.co.oliverdelange.basicjava.scope2;

import static uk.co.oliverdelange.basicjava.HelloWorld.print;

public class ScopeClassDifferentPackage {
    public static void publicStaticVoid() {
        print("public - ScopeClassDifferentPackage");
    }
    protected static void protectedStaticVoid() {
        print("protected - ScopeClassDifferentPackage");
    }
    private static void privateStaticVoid() {
        print("private - ScopeClassDifferentPackage");
    }
    static void defaultStaticVoid() {
        print("default - ScopeClassDifferentPackage");
    }
}
