/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roll.the.dice.till.the.snake.eyes;

/**
 *
 * @author ada
 */
public class RollTheDiceTillTheSnakeEyes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      System.out.println("It took " + rollFor(2) + " rolls to get snake eyes.");
   }  // end main()
      /**
    * Simulator of rolling the dice
    */
   public static int rollFor( int a ) {
       if ( a < 2 || a > 12 );
       int die1, die2;  // Numbers between 1 and 6 representing the dice.
       int roll;        // Total showing on dice.
       int rollCt;      // Number of rolls made.
       rollCt = 0;
       do {
          die1 = (int)(Math.random()*6) + 1;
          die2 = (int)(Math.random()*6) + 1;
          roll = die1 + die2;
          rollCt++;
       } while ( roll != a );
       return rollCt;
     }
    
}
