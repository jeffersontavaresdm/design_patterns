package behavioral.strategy;

import behavioral.strategy.actions.AnimalAction;
import behavioral.strategy.actions.AnimalActionStrategy;
import behavioral.strategy.provider.StrategyProvider;

public class StrategyTest {

  public static void main(String[] args) {
    var strategyFactory = new StrategyProvider();

    AnimalActionStrategy animalActionStrategy = strategyFactory.getStrategy(AnimalAction.ACTION_02.getAction());
    animalActionStrategy.execute();

    System.out.println("\n------------------------\n");

    animalActionStrategy = strategyFactory.getStrategy("");
    animalActionStrategy.execute();
  }
}
