package design_patterns.behavioral.strategy.actions;

public class AnimalActionStrategyRunning implements AnimalActionStrategy {

  @Override
  public void execute() {
    System.out.println("RUNNING!!!");
  }
}
