package design_patterns.behavioral.strategy.provider;


import design_patterns.behavioral.strategy.actions.*;

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
