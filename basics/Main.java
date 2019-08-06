// oracle docs https://docs.oracle.com/javase/8/docs/api/java/time/LocalDateTime.html
import java.time.LocalDateTime;

public class Main {
  public static void main(String[] args) {
    System.out.println("Hello World!");

    // call pluralize
    int rabbitCount = 0;
    System.out.println("I own " + rabbitCount + " " + pluralize("rabbit", rabbitCount) + ".");
    int pupCount = 1;
    System.out.println("I own " + pupCount + " " + pluralize("pup", pupCount) + ".");
    int catCount = 2;
    System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

    // call Flipping Coins
    flipNHeads(2);

    // call Command Line Clock
    clock();
  }


  // Pluralize
  // Write a function called pluralize that accepts a word and a number and returns a string with the word pluralized with an “s” if the number is zero, or greater than one.
  
  public static String pluralize(String animal, int num) {
    if( num == 0 || num > 1){
      animal = animal + "s";
    }
    return animal;
  }


  // Flipping Coins
  // Write a function called flipNHeads that accepts an integer n and flips coins until n heads are flipped in a row. Simulate coin flipping by choosing a random number between 0 and 1. Numbers below .5 are considered tails. Numbers at and above .5 are considered heads. Print out heads or tails on one line for each flip. Print It took FLIPS flips to flip N heads in a row. once n heads have been in a row.

  public static void flipNHeads(int target){
    int count = 0;
    int heads = 0;
    while (heads < target){
      double flip = Math.random();
      if ( flip < 0.5 ) {
        System.out.println("tails");
        heads = 0;
      } else {
        System.out.println("heads");
        heads++;
      }
      count++;
    }
    System.out.println("It took " + count + " flips to flip " + target + " heads in a row.");
  }


  // Command Line Clock
  // Write a method clock that uses Java’s built-in LocalDateTime object to constantly print out the current time to the console, second by second. The program should run until someone manually kills it with CTRL-C or presses the “stop” button in their IDE. Each time should only be printed once. Your program should detect when the seconds increase and only print something out when the timestamp changes.
  // Stretch Goals
  // Upgrade the command line clock to show how fast the program is processing itself between time updates. Display the speed in hertz, kilohertz, megahertz, or gigahertz (Hz, kHz, MHz, GHz).

  public static void clock(){
    int currentSecond = 0;
    long speedCount = 0;
    
    while (true) {
      speedCount++;

      LocalDateTime now = LocalDateTime.now();
      int hour = now.getHour();
      int minute = now.getMinute();
      int second = now.getSecond();

      // stack overflow pad an integer https://stackoverflow.com/questions/473282/how-can-i-pad-an-integer-with-zeros-on-the-left
      String hours = String.format("%02d", hour);
      String minutes = String.format("%02d", minute);
      String seconds = String.format("%02d", second);
      
      if (second != currentSecond){
        double kHz = speedCount * .001;
        currentSecond = second;
        System.out.println(hours + ":" + minutes + ":" + seconds + " " + kHz + " kHz");  
        speedCount = 0;   
      }
    }
  }
}