package uk.co.oliverdelange.basicjava.scope2;

import static uk.co.oliverdelange.basicjava.HelloWorld.print;

public class scopeClassDifferentPackage {
    public static void publicStaticVoid() {
        print("public - scopeClassDifferentPackage");
    }
    protected static void protectedStaticVoid() {
        print("protected - scopeClassDifferentPackage");
    }
    private static void privateStaticVoid() {
        print("private - scopeClassDifferentPackage");
    }
    static void defaultStaticVoid() {
        print("default - scopeClassDifferentPackage");
    }
}
