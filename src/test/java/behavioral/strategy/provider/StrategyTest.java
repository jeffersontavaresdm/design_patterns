package behavioral.strategy.provider;

import design_patterns.behavioral.strategy.actions.AnimalAction;
import design_patterns.behavioral.strategy.actions.AnimalActionStrategy;
import design_patterns.behavioral.strategy.actions.AnimalRunning;
import design_patterns.behavioral.strategy.provider.StrategyProvider;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StrategyTest {

  @Test
  void shouldCreateRunningStrategyClass() {
    StrategyProvider provider = new StrategyProvider();

    AnimalActionStrategy strategy = provider.getStrategy(AnimalAction.ACTION_01.getAction());

    Assertions.assertEquals(AnimalRunning.class, strategy.getClass());
  }
}