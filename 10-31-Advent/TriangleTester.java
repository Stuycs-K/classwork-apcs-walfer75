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
          ((s1 + s2) > s3) &&
          ((s2 + s3) > s1) &&
          ((s3 + s1) > s2)
        ) {
          total ++;
        }
        input.nextLine();
      }
    }  catch (FileNotFoundException ex) {
      //File not found what should you do?
      System.out.println("File not found");
      return (0); //you can return from a void function just don't put a value.
    }
    return(total);
  }

  public static int countTrianglesB(String filename){
    int total = 0;

  }
}
