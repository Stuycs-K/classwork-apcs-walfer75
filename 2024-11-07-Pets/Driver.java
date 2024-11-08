/* Before replacing getName() method, Bird class spoke its original name.
However after replacing getName() method, bird class' speak uses overwritten method to print name.
*/

public class Driver {
  public static void main (String[] args){
   Animal a1 = new Animal("chhhhhh", 2, "Jeff");
   a1.speak();

   Bird b1 = new Bird("cawwwcaww", 3, "angel", 2.2, "red");
   b1.speak();
   System.out.println(b1.getName());
  }
}
