public class MyClass {
  int x = 5;

  public static void main(String[] args) {
    int y = 5;//assigning new variable y
    MyClass myObj = new MyClass();

    System.out.println(myObj.x);
    x = y
    x *= y;
    System.out.println(myObj.x);
    x = y;
  }
}