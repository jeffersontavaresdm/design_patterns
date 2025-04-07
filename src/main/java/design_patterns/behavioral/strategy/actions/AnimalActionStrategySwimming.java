package design_patterns.behavioral.strategy.actions;

public class AnimalActionStrategySwimming implements AnimalActionStrategy {

  @Override
  public void execute() {
    System.out.println("SWIMMING!!!");
  }
}
