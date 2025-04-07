package design_patterns.behavioral.strategy.actions;

public class AnimalSwimming implements AnimalActionStrategy {

  @Override
  public void execute() {
    System.out.println("SWIMMING!!!");
  }
}
