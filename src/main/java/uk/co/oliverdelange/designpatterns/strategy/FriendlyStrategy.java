package uk.co.oliverdelange.designpatterns.strategy;

import static uk.co.oliverdelange.basicjava.HelloWorld.print;

public class FriendlyStrategy implements FootballGameStrategy {
    @Override
    public void playGame() {
        print("Executing strategy for a friendly football game");
    }
}
