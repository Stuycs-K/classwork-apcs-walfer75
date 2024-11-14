import java.util.ArrayList;
public class ArrayListPractice {
  public static ArrayList<String>createRandomArray(int size) {
    ArrayList<String> result = new ArrayList<String>();
    for (int i = 0; i < size; i++) {
      int x = (int) (Math.random() * 11);
      if (x == 0) {
        result.add("");
      }
      else {
        result.add("" + x);
      }
    }
    return result;
  }

  public static void replaceEmpty( ArrayList<String> original){
    for (int i = 0; i < original.size(); i++) {
      if (original.get(i) == "") {
        original.set(i, "Empty");
      }
    }
  //Modify the ArrayList such that it has all of the empty strings are
  //replaced with the word "Empty".
  }
}
