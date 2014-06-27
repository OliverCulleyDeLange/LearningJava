package uk.co.oliverdelange.designpatterns.singleton;

public class BasicSingleton {
    //Used so that there is only one instance of a class.
    private static BasicSingleton instance = null;

    public static BasicSingleton getInstance() {
        if (instance == null) { // Lazy instantiation
            instance = new BasicSingleton();
        }
        return instance;
    }

    // private constructor so nothing can instantiate it from the outside world
    private BasicSingleton() {}
}
