package uk.co.oliverdelange.designpatterns.strategy;

import static uk.co.oliverdelange.basicjava.HelloWorld.print;

public class ChampionshipStrategy implements FootballGameStrategy {
    @Override
    public void playGame() {
        print("Executing strategy for a championship football game");
    }
}
