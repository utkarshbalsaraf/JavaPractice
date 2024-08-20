interface Animal {
  int eyes = 2;
  public void walk();
}

class Dog implements Animal {
  public void walk() {
    System.out.println("walks on 4 legs and "+ eyes+" eyes");
  }
}

class Chicken implements Animal {
  public void walk() {
    System.out.println("walks on 2 legs");
  }
}

public class OOPsInterface {
  public static void main(String[] args) {
    Dog dg1 = new Dog();
    dg1.walk();
  }
}
