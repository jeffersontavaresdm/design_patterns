package design_patterns.creational.singleton;

/**
 * Double-Checked Locking Singleton Pattern
 */
public class SingletonDoubleCheckedLocking {
  private static volatile SingletonDoubleCheckedLocking instance;

  private SingletonDoubleCheckedLocking() { }

  public static SingletonDoubleCheckedLocking getInstance() {
    if (instance == null) {
      synchronized (SingletonDoubleCheckedLocking.class) {
        if (instance == null) {
          instance = new SingletonDoubleCheckedLocking();
        }
      }
    }

    return instance;
  }
}
