package uk.co.oliverdelange.designpatterns.strategy;

public class StrategyClient {

    public static void main(String[] args) {

        // We can save the strategy in a context and execute it from there
        FootballGameContext gameContext = new FootballGameContext(new FriendlyStrategy());
        gameContext.executeStrategy();

        FootballGameContext gameContext2 = new FootballGameContext(new ChampionshipStrategy());
        gameContext2.executeStrategy();

        // Or execute the strategy without using the context
        executeWithoutContext(new WorldCupStrategy());
    }

    public static void executeWithoutContext(FootballGameStrategy footballGameStrategy) {
        footballGameStrategy.playGame();
    }

}
