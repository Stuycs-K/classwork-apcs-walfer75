import java.util.*;
import java.util.*;

public class Game {

  public static void main(String[] args) {
    Scanner userInput = new Scanner(System.in);

    //You can do the rest many times:

    System.out.println("Enter username: ");
    //Read one line of user input
    String userName = userInput.nextLine();
    System.out.println("Enter preferred language: ");
    String language = userInput.nextLine();
    System.out.println("Username is: " + userName + "\nPreferred language is " + language)
    Adventurer enemy = new CodeWarrior("John", 15, "English");
    Adventurer player = new CodeWarrior("userName", 10, language);
    //stats

    while(true) {
      if (enemy.getHP() <= 0) {
        System.out.println("Congrats you won!");
        return;      
      } 
      if (player.getHP() <= 0) {
        System.out.println("You lost");
        return;
      }

      System.out.println("What would you like to do? Type: (a)ttack / (sp)ecial / (su)pport / quit");
      String input = userInput.nextLine();
      if (input.equals("a") || input.equals("attack")) {
        player.attack(enemy);
      }
      else if (input.equals("sp") || input.equals("special")) {
        player.specialAttack(enemy);
      }
      else if (input.equals("su") || input.equals("support")) {
        player.support();
      
      else if (input.equals("quit")) {
        return;
      }

      int enemyTurn =(int) (Math.random() * 3) + 1;
      if (enemyTurn == 1) {
        enemy.attack(player);
      }
      else if (enemyTurn == 2) {
        enemy.special(player);
      }
      else if (enemyTurn == 3) {
        enemy.support();
      }

      System.out.println("End of turn:" + userName ": Caffiene = " + player.getCaffiene()  + ", Hp = " + player.getHP());
      System.out.println("End of turn: John: Caffiene = " + enemy.getCaffiene()  + ", Hp = " + enemy.getHP());
    }
  }
}
