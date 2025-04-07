package design_patterns.creational.singleton;

public class SingletonTest {

  public static void main(String[] args) {
    SingletonBillPugh instance1 = SingletonBillPugh.getInstance();
    SingletonBillPugh instance2 = SingletonBillPugh.getInstance();

    System.out.println("instance 1: " + instance1);
    System.out.println("instance 2: " + instance2);

    System.out.println("---------------------------");

    var instance3 = SingletonDoubleCheckedLocking.getInstance();
    var instance4 = SingletonDoubleCheckedLocking.getInstance();

    System.out.println("instance 3: " + instance3);
    System.out.println("instance 4: " + instance4);
  }
}
