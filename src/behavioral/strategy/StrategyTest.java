package behavioral.strategy;

import behavioral.strategy.actions.AnimalAction;
import behavioral.strategy.actions.AnimalActionStrategy;
import behavioral.strategy.provider.StrategyProvider;

public class StrategyTest {

  public static void main(String[] args) {
    var provider = new StrategyProvider();

    AnimalActionStrategy animalStrategy = provider.getStrategy(AnimalAction.ACTION_02.getAction());
    animalStrategy.execute();

    System.out.println("\n------------------------\n");

    animalStrategy = provider.getStrategy("");
    animalStrategy.execute();
  }
}
