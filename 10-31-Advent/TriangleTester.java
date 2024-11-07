import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TriangleTester {

  public static int countTrianglesA(String filename) {
    int total = 0;
    try {
      File file = new File(filename);
      Scanner input = new Scanner(file);
      while (input.hasNextLine()) {
        int s1 = input.nextInt();
        int s2 = input.nextInt();
        int s3 = input.nextInt();
        if (
          s1 < s2 + s3 &&
          s2 < s3 + s1 &&
          s3 < s1 + s2
        ) {
          total += 1;
        }
      }
    } catch(FileNotFoundException e) {
      System.out.println("File not Found");
      return 0;
    }
    return total;
  }

  public static int countTrianglesB(String filename) {
    int total = 0;
    try {
      File file = new File(filename);
      Scanner input = new Scanner(file);
      while (input.hasNext()) {
        int[] l1 = new int[3];
        int[] l2 = new int[3]; 
        int[] l3 = new int[3];
        for (int i = 0; i < 3; i++) {
          l1[i] = input.nextInt();
          l2[i] = input.nextInt();
          l3[i] = input.nextInt();
        }
        if (
          l1[0] < l1[1] + l1[2] &&
          l1[1] < l1[0] + l1[2] &&
          l1[2] < l1[0] + l1[1]
        ) {
          total += 1;
        }
        if (
          l2[0] < l2[1] + l2[2] &&
          l2[1] < l2[0] + l2[2] &&
          l2[2] < l2[0] + l2[1]
        ) {
          total += 1;
        }
        if (
          l3[0] < l3[1] + l3[2] &&
          l3[1] < l3[0] + l3[2] &&
          l3[2] < l3[0] + l3[1]
        ) {
          total += 1;
        }
      }
    } catch (FileNotFoundException e) {
      System.out.println("File not found");
      return 0;
    }
    return total;
  }
}
