package uk.co.oliverdelange.designpatterns.strategy;

public class FootballGameContext {

    FootballGameStrategy strategy;

    public FootballGameContext(FootballGameStrategy strategy){
        this.strategy = strategy;
    }

    public void executeStrategy() {
        this.strategy.playGame();
    }
}
