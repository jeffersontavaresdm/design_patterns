package behavioral.strategy.provider;

import behavioral.strategy.actions.AnimalActionStrategy;
import behavioral.strategy.actions.AnimalAction;
import behavioral.strategy.actions.AnimalJumping;
import behavioral.strategy.actions.AnimalRunning;
import behavioral.strategy.actions.AnimalSwimming;

import java.util.Map;

public class StrategyProvider {
  private final Map<String, AnimalActionStrategy> strategies = Map.of(
      AnimalAction.ACTION_01.getAction(), new AnimalRunning(),
      AnimalAction.ACTION_02.getAction(), new AnimalJumping(),
      AnimalAction.ACTION_03.getAction(), new AnimalSwimming()
  );

  public AnimalActionStrategy getStrategy(String action) {
    return strategies.getOrDefault(action, () -> System.out.println("INVALID ACTION!!!"));
  }
}
