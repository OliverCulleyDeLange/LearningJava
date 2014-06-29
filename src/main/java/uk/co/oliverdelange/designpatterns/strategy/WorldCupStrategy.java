package uk.co.oliverdelange.designpatterns.strategy;

import static uk.co.oliverdelange.basicjava.HelloWorld.print;

public class WorldCupStrategy implements FootballGameStrategy {
    @Override
    public void playGame() {
        print("Executing strategy for a world cup football game");
    }
}
