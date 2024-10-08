import java.util.Arrays;
public class ArrayDemo{
  public static void main(String[]args){
    int[] test = {16, 6, 4, 2};
    System.out.println("My method: " + arrayToString(test) + "\nBuilt in method: " + Arrays.toString(test));
    int[][] test1 = {{3, 2, 1}, {3, 2, 1}, {1, 2, 3}};
    System.out.println("\nMy Method: " + arrToString(test1) + "\nBuilt in method: " + Arrays.deepToString(test1));
    int[][] test2 = {{0, 0, 2, 3, 4}, {4, 2, 4, 0}, {0, 0, 3, 5}};
    System.out.println("\nMy Method: " + countZeros2D(test2) + ", which should be 5");
    System.out.println("\nMy Method(arr2Dsum): " + arr2DSum(test2) + ", which should be 27"); 
    

    int[][] test3 = {{-3, -6, 2, 3}, {2, -3, 6, -4}, {4, -2, -3, 9}, {2, 3, 5, 3}};
    System.out.println("\nReplace Negative Before: " + Arrays.deepToString(test3));
    replaceNegative(test3); //Now its [[1, 0, 2, 3], [2, 1, 6, 0], [4, 0, 1, 9], [2, 3, 5, 3]]
    System.out.println("\nAfter: " + Arrays.deepToString(test3));

    System.out.println("\nCopy test: " + Arrays.deepToString(copy(test3)));
    String checker = "the same";
    if (test3 != copy(test3)) {
      checker = "not the same";
    }
    System.out.print("\tThey are " + checker);

    System.out.println("\n\nswapRC tester: " + Arrays.deepToString(swapRC(test3)));

    System.out.println("\nhtmlTable tester: " + htmlTable(test3));
    //write your tests here!
    //You can now use Arrays.toString(yourArray) instead of writing arrayToString again.
    //Compare Arrays.toString(yourArray) to YOUR arrayToString() method to make sure yours is correct
    //do not use any other Arrays.method()

  }

  //0. Include your prior methods to help you print a 1D/2D array of ints.
  public static String arrayToString(int[]nums){
    String result = "[";
    for(int i = 0; i < nums.length  - 1; i++) {
        result += nums[i] + ", ";
    }
    result += nums[nums.length - 1] + "]";
    return result;
  }

  //The name of different methods can be the same,
  //as long as the parameters are different! (type and/or quantity must be different)
  //Pro tip: you should be using your 1D arrToString in this method!
  public static String arrToString(int[][]ary){
    String returnable = "[";
    for (int i = 0; i < ary.length - 1; i++) {
      returnable += arrayToString(ary[i]) + ", ";
    }
    returnable += arrayToString(ary[ary.length - 1]) + "]";
    return returnable;
  }

  //1. Calculate and return how many elements equal zero in the 2D array.
  public static int countZeros2D(int[][] nums){
    int zeroCounter = 0;
    for (int i = 0; i < nums.length; i++) {
      for (int j = 0; j < nums[i].length; j++) {
        if (nums[i][j] == 0) {
          zeroCounter++;
        }
      }
    }
    return zeroCounter;
  }

  //2. Calculate the sum of a 2d array
  /*Return the sum of all of the values in the 2D array
   *Use a nested loop instead of a helper method*/
  public static int arr2DSum(int[][]nums){
    int counter = 0;
    for (int i = 0; i < nums.length; i++) {
      for (int j = 0; j < nums[i].length; j++) {
        counter += nums[i][j];
      }
    }
    return counter;
  }
  //3. Modify a given 2D array of integer as follows:
  //Replace all the negative values:
  //-When the row number is the same as the column number replace
  //that negative with the value 1
  //-All other negatives replace with 0
  public static void replaceNegative(int[][] vals){
    for (int i = 0; i < vals.length; i++) {
      for (int j = 0; j < vals[i].length; j++) {
        if (vals[i][j] < 0) {
          if (i == j) {
            vals[i][j] = 1;
          }
          else {
            vals[i][j] = 0;
          }
        }
      }
    }
  }

  //4. Make a copy of the given 2d array.
  //When testing : make sure that changing the original does NOT change the copy.
  //DO NOT use any built in methods that "copy" an array.
  //You SHOULD write a helper method for this.
  //If you don't see a good way to do that, you should stop and look at prior methods.
  public static int[] copyHelper(int[] nums) {
    int[] copy = new int[nums.length];
    for (int i = 0; i < nums.length; i++) {
      copy[i] = nums[i];
    }
    return copy;
  }

  public static int[][] copy(int[][] nums){
    int[][] copy = new int[nums.length][];
    for (int i = 0; i < nums.length; i++) {
      copy[i] = copyHelper(nums[i]);
    }
    return copy;
  }

  //5. Rotate an array by returning a new array with the rows and columns swapped.
  //   You may assume the array is rectangular and neither rows nor cols is 0.
  //   e.g. swapRC({{1,2,3},{4,5,6}}) returns {{1,4},{2,5},{3,6}}
  public static int[][] swapRC(int[][]nums){
    int[][] result = new int[nums[0].length][nums.length];
    for(int i = 0; i < nums[0].length; i++) {
        for (int x = 0; x < nums.length; x++) {
            result[i][x] = nums[x][i];
        }
    }
    return result;
  }

  //6. Make an HTML table by putting a table tag around the entire 2d array,
  //   tr tags around each row, and td tags around each value.
  //   You may use a helper method
  //   Note there is no whitespace in the string, it all one line with no spaces/tabs.
  //   e.g. htmlTable(new int[][]{{1,2},{3}})  returns:
  // "<table><tr><td>1</td><td>2</td></tr><tr><td>3</td></tr></table>"
  public static String htmlTable(int[][]nums){
    String result = "<table>";
    for (int i = 0; i < nums.length; i++) {
      result += "<tr>";
      for (int j = 0; j < nums[i].length; j++) {
        result += "<td>" + nums[i][j] + "</td>";
      }
      result += "</tr>";
    }
    return result + "</table>";
  }
}
