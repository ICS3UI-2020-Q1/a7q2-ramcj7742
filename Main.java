import java.util.Scanner;
/**
 * prints the factors of the entered number
 * @author Jaden Ramcharan
 */
public class Main {
  //factors users number
  public static void factors(int userNum){
    for(int i = 1; i <= userNum; i++){
      int remainder = userNum % i;
      //checks to see if number divides evenly
      if(remainder == 0){
        System.out.println(i);
      }
    }
  }

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // creates scanner for user input
    Scanner input = new Scanner(System.in);

    //gets number from user
    System.out.println("Please enter the number you want factored");
    int userNum = input.nextInt();

    //displays to user
    factors(userNum);
  }
}
