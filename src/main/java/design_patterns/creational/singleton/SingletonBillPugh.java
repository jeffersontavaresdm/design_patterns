package design_patterns.creational.singleton;

/**
 * Bill Pugh Singleton Pattern
 */
public class SingletonBillPugh {

  private SingletonBillPugh() { }

  private static final class InstanceHolder {
    private static final SingletonBillPugh instance = new SingletonBillPugh();
  }

  public static SingletonBillPugh getInstance() {
    return InstanceHolder.instance;
  }
}

