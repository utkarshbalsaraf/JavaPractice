
class Pen {
  String color;
  String type;

  public void write() {
    System.out.println("I am writing with pen");
  }

  public void printColor() {
    System.out.println("Color of pen is :" + color);
  }

  public void printType() {
    System.out.println("Type of pen is :" + type);
  }
}

public class OOPs {
  public static void main(String[] args) {

    Pen pen1 = new Pen();
    pen1.color = "Black";
    pen1.type = "Ballpoint";
    pen1.write();
    pen1.printColor();
    pen1.printType();

    Pen pen2 = new Pen();
    pen2.write();
    pen2.color = "Red";
    pen2.type = "gel pen";
    pen2.printColor();
    pen2.printType();

  }
}