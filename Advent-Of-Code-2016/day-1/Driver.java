import java.util.*;
import java.io.*;
public class Driver {

  public static int place(String filename) {
    ArrayList<String> directionList = new ArrayList<String>();
    try {
      File file = new File(filename);
      Scanner input = new Scanner(file);
      while(input.hasNext()) {
        String s = input.next();
        directionList.add(s);
      }
    }catch(FileNotFoundException e) {
      System.out.println(e + "FileNotFoundException");
      return 0;
    }
    for (int i = 0; i < directionList.size(); i++) {
      directionList.set(i, directionList.get(i).replace(",", ""));
    }


    int direction = 0;
    int x = 0;
    int y = 0;

    for (int i = 0; i < directionList.size(); i++) {
      String dir = directionList.get(i).substring(0,1);
      int amount = Integer.parseInt(directionList.get(i).substring(1));
      if(dir.equals("R")) {
        direction += 1;
      }
      else {
        direction -= 1;
      }
      direction = (direction + 4) % 4;
      System.out.println(direction);
      if (direction == 0) {
        y += amount;
      }
      if(direction == 2) {
        y -= amount;
      }
      if(direction == 1) {
        x += amount;
      }
      if(direction == 3) {
        x -= amount;
      }
      System.out.println(x +", " + y);
    }
    return Math.abs(x) + Math.abs(y);
  }

  public static void main(String[] args) {
    System.out.println(place("input.txt"));
  }
}
