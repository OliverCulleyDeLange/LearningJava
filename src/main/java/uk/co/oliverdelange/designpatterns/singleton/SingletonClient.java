package uk.co.oliverdelange.designpatterns.singleton;

public class SingletonClient {

    public static void main(String[] args) {
         BasicSingleton singleton = BasicSingleton.getInstance();

        singleton.doSomething();

        BasicSingleton hopefullyTheSameSingleton = BasicSingleton.getInstance();

        hopefullyTheSameSingleton.doSomething();
    }
}
