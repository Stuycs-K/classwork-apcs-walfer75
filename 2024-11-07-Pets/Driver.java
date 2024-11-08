/* Before replacing getName() method, Bird class spoke its original name.
However after replacing getName() method, bird class' speak uses overwritten method to print name.
*/
/* The Bird object created from an instance of Animal doesn't work
This is because the is-a relationship suggests that Animal is a subclass of Bird, which is false.
The object Bird cannot instantiate because it will be missing information since the constructor for Animal doesn't have the required parameters*/
public class Driver {
  public static void main (String[] args){
   Animal a1 = new Animal("chhhhhh", 2, "Jeff");
   a1.speak();

   Bird b1 = new Bird("cawwwcaww", 3, "angel", 2.2, "red");
   b1.speak();
   System.out.println(b1.getName());

   Animal a2 = new Bird("chirpchirp", 5, "Birdo", 6.4, "blue");
   a2.speak();
   /*
   Bird b2 new Animal("screech", 4, "Raven", 9.9, "purple");
   b2.speak()
   */
  }
}
