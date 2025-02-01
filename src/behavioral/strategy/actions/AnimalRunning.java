package behavioral.strategy.actions;

public class AnimalRunning implements AnimalActionStrategy {

  @Override
  public void execute() {
    System.out.println("RUNNING!!!");
  }
}
