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
  //replaced with the word "Empty".    boolean aBig = a.size() < b.size()
  }

  public static ArrayList<String> makeReversedList( ArrayList<String> original){
    ArrayList<String> result = new ArrayList<String>();
    for(int i = original.size() - 1; i >= 0; i--){
      result.add(original.get(i));
    }
    return result;
  //return a new ArrayList that is in the reversed order of the original.
  }

  public static ArrayList<String> mixLists( ArrayList<String> a,  ArrayList<String> b){
    int min = Math.min(a.size(), b.size());
    ArrayList<String> result = new ArrayList<String>();
    for (int i = 0; i < min; i++) {
      result.add(a.get(i));
      result.add(b.get(i));
      }
      if (a.size() < b.size()) {
        for (int i = min; i < b.size(); i++) {
          result.add(b.get(i));
        }
      }
      else {
        for (int i = min; i < a.size(); i++) {
          result.add(a.get(i));
        }
      }
      return result;
  //return a new ArrayList that has all values of a and b in alternating order that is:
  //a[0], b[0], a[1], b[1]...
  //If one list is longer than the other, just attach the remaining values to the end.
}
}
