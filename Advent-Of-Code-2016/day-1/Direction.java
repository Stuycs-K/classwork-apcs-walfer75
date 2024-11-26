import java.util.*;
import java.io.*;
public class Direction {

  private ArrayList<String> directions = new ArrayList<String>();
  private String repeat;

  public ArrayList<String> getDirections() {
    return directions;
  }

  public String getRepeated() {
    return repeat;
  }

  public String getRepeat() {
    ArrayList<String> seen = new ArrayList<String>();
    for (int i = 0; i < directions.size(); i++) {
      String key = directions.get(i);
      for (int j = 0; j < seen.size(); j++) {
        if (key.equals(seen.get(j))) {
          repeat = key;
          return key;
        }
      }
      seen.add(key);
    }
    return null;
  }

  public void seenList(String filename) {
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
      directions.add("(" + x + ", " + y + ")");
    } 
  }


   
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
}
