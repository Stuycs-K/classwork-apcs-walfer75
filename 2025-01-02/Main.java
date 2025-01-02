public class Main {
  public static void main(String[] args) {
    Fib i = new Fib();
    int n = Integer.parseInt(args[0]);
    System.out.println(i.fibonacci(n));
    //46-47 under 10 seconds
    //46 is the last before wraparound
  }
}
