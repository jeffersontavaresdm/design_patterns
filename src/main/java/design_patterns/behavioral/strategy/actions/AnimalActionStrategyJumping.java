package design_patterns.behavioral.strategy.actions;

public class AnimalActionStrategyJumping implements AnimalActionStrategy {

  @Override
  public void execute() {
    System.out.println("JUMPING!!!");
  }
}
