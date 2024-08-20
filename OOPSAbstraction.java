abstract class Animal {
  public void walk() {
  }

  public void Grawl() {
    System.out.println("GRRRRRRRRRRR");
  }

}

class Dog extends Animal {
  public void walk() {
    System.out.println("walks on 4 legs");
  }
}

class Chicken extends Animal {
  public void walk() {
    System.out.println("walks on 2 legs");
  }
}

public class OOPSAbstraction {
  public static void main(String[] args) {
    Dog dg1 = new Dog();
    dg1.walk();
    dg1.Grawl();
  }
}
