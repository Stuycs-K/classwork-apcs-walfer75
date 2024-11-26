import java.util.*;
import java.io.*;

public class Driver {
    public static void main(String[] args) {
        Direction d1 = new Direction();
        d1.seenList("input.txt");
        String[] directionList = new String[d1.getDirections().size()];
        for (int i = 0; i < directionList.length; i++) {
            directionList[i] = d1.getDirections().get(i);
        }
        Arrays.sort(directionList);
        ArrayList<String> repeatList = new ArrayList<String>();
        for(int i = 0; i < directionList.length - 1; i++) {
            if(directionList[i].equals(directionList[i+1])) {
                repeatList.add(directionList[i]);
            }
        }
        System.out.println(repeatList.toString());
        //185, 186, 
    }
}