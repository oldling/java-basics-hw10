public class ExampleException {
  public static int rectangleArea(int a, int b) throws IllegalArgumentException{
    if (a > 0 && b > 0) {
      return a * b;
    } else {
      throw new IllegalArgumentException("Length and width should  more then 0");
    }

  }
}


