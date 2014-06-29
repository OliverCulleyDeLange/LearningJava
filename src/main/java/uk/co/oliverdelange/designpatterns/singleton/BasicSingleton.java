package uk.co.oliverdelange.designpatterns.singleton;

import static uk.co.oliverdelange.basicjava.HelloWorld.print;

public class BasicSingleton {
    //Used so that there is only one instance of a class.
    private static BasicSingleton instance = null;

    public static BasicSingleton getInstance() {
        if (instance == null) { // Lazy instantiation
            instance = new BasicSingleton();
        }
        return instance;
    }

    public static void doSomething() {
        print("Doing something with my singleton - " + instance.toString());
    }

    // private constructor so nothing can instantiate it from the outside world
    private BasicSingleton() {}
}
