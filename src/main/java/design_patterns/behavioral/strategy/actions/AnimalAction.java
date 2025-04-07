package design_patterns.behavioral.strategy.actions;

public enum AnimalAction {

  ACTION_01("Running"),
  ACTION_02("Jumping"),
  ACTION_03("Swimming");

  private final String action;

  AnimalAction(String action) {
    this.action = action;
  }

  public String getAction() {
    return action;
  }
}
