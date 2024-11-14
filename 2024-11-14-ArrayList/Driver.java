import java.util.ArrayList;
public class Driver {
  public static void main(String[] args) {
    for (int i = 0; i < 5; i++) {
      ArrayList<String> thing = ArrayListPractice.createRandomArray(10);
      System.out.println(thing.toString());
      ArrayListPractice.replaceEmpty(thing);
      System.out.println(thing.toString() + "\n");
  }
}
}
