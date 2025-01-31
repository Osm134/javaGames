import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class hangman_game {

     String[] fturits = {"aple", "guava", "orvange", "lemon"};
    String select ;
   static int attempts ;
    static  char [] guess;

    public hangman_game(){
        Random myrd = new Random();
        select = fturits[myrd.nextInt(fturits.length)];
        attempts = select.length();
        guess = new char[select.length()] ;
        for(int i = 0 ; i < select.length(); i++){
            guess[i] = '_';
        }
    }
    //
    public static void display(){
       for(char ch: guess){
           System.out.print( ch + " " );
       }
        System.out.println(" no of atmpts left  = " + attempts);
    }
    public boolean isvalid(char ch1){
      for(int i =  0 ; i < select.length() ; i++){
          if(select.charAt(i) == ch1){
              guess[i] = ch1;
             // attempts--;
              return true ;

          }
      }
      return false ;
    }
    public boolean winner(){
        for(int i =  0 ; i < select.length() ; i++) {
           return select.charAt(i) == guess[i];
        }
       return false ;
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        hangman_game one = new hangman_game();
        String rand =  one.select;



        while(one.attempts != 0){
            display();
            System.out.println(" guess the  character : ");
            char ch4 = sc.next().charAt(0);

            if(one.isvalid(ch4)){
               attempts--;
                System.out.println("you enterd the correct" + "atempts remaining = " + attempts);
               // display();

            }
            else{
                attempts--;
                System.out.println("please enter the correct " + "atempts remaining = " + attempts);
                //display();

            }
        }
        if(attempts == 0 && one.winner()){
            System.out.println("you won the game");

        }
        else{
            System.out.println("loss");
        }

    }



        }
