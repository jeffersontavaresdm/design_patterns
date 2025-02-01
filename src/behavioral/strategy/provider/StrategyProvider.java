package behavioral.strategy.provider;

import behavioral.strategy.actions.AnimalActionStrategy;
import behavioral.strategy.actions.AnimalAction;
import behavioral.strategy.actions.AnimalActionStrategyJumping;
import behavioral.strategy.actions.AnimalActionStrategyRunning;
import behavioral.strategy.actions.AnimalActionStrategySwimming;

import java.util.Map;

public class StrategyProvider {
  private final Map<String, AnimalActionStrategy> strategies = Map.of(
      AnimalAction.ACTION_01.getAction(), new AnimalActionStrategyRunning(),
      AnimalAction.ACTION_02.getAction(), new AnimalActionStrategyJumping(),
      AnimalAction.ACTION_03.getAction(), new AnimalActionStrategySwimming()
  );

  public AnimalActionStrategy getStrategy(String action) {
    return strategies.getOrDefault(action, () -> System.out.println("INVALID ACTION!!!"));
  }
}
