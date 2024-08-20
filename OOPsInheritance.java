
class Shape {
  public void area() {
    System.out.println("Display Area");
  }
}

class Triangle extends Shape {
  public void area(int l, int h) {
    System.out.println((0.5) * l * h);
  }
}

class Circle extends Shape {
  public void area(int r) {
    System.out.println((3.14) * r * r);
  }
}

class EquilatralTriangle extends Triangle {
  public void area() {
    System.out.println("Display Area");
  }
}

public class OOPsInheritance {
  public static void main(String[] args) {
    Shape shape = new Shape();
    EquilatralTriangle eqt = new EquilatralTriangle();
    shape.area();
    eqt.area(2, 5);
  }
}
