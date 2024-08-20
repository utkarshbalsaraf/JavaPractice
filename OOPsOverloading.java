class Student {
  public void printInfo(String name) {
    System.out.println("This is your name " + name);
  }

  public void printInfo(int age) {
    System.out.println("This is your Age " + age);
  }

  public void printInfo(String name, int age) {
    System.out.println("This is your name " + name + " and this is age " + age);
  }
}

public class OOPsOverloading {
  public static void main(String[] args) {
    Student s1 = new Student();
    s1.printInfo(20);
    s1.printInfo("Utkarsh");
    s1.printInfo("Utkarsh", 24);
  }
}
