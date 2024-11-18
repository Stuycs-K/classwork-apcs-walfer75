
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class Direction {

  public static int distance(String filename) {
    ArrayList<String> directionList = new ArrayList<String>();
    File file = new File(filename);
    Scanner input = new Scanner(file);
    try {
      while(input.hasNext) {
        String s = input.next();
        directionList.add(s);
      }
    }catch(FileNotFoundException e) {
      System.out.println("FileNotFoundException");
      return 0;
    }
    System.out.println(directionList.toString());
    return 0;
  }
}
