import java.util.Arrays;
import java.util.Scanner;

public class tic_toe {
  public static char a[][] = new char[3][3];



    //
   public static char currentPlayer = 'X';

    // to display the
    public static void display (){
        System.out.println("------------");
        for(int i = 0 ; i< 3 ; i++ ){
            System.out.print( "| ");
            for(int j = 0 ; j < 3 ; j++){
                System.out.print(a[i][j] + " | ");

            }
            System.out.println("\n------------");
        }
    }
     public static boolean isvalid(int row , int col){
        return row < 3 && col >=0 && col <3 && row >= 0 && a[row][col] ==' ';

     }
     // to check winner
    public  static boolean winner(){
        for(int i = 0 ; i < 3 ; i++){
            if((a[i][0] == a[i][1] && a[i][1]== a[i][2]  && a[i][2]!= ' ') ||
                    (a[0][i]== a[1][i] && a[1][i] == a[2][i] && a[2][i] != ' ')){
                return true;
            }
        }
        if(a[0][0] == a[1][1] && a[1][1] == a[2][2] && a[2][2] != ' ' || a[0][2] == a[1][1] && a[2][0] == a[1][1] && a[1][1] != ' '){
            return true;
        }
        return false ;
    }
    // to check wether is draw
    public static boolean draw(){
        for(int i =  0; i < 3 ; i++){
            for(int j = 0  ; j < 3 ; j++){
                if(a[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true ;
    }


    public static void main(String[] args) {
        boolean gamerun = true ;
        Scanner sc = new Scanner(System.in);
        for(int i = 0 ; i < 3 ; i++ ){
            for(int j=  0 ; j< 3 ; j++){
                a[i][j] = ' ';
            }
        }
        while (gamerun) {
            display();
            System.out.println("please enter the values between row = 1-3  And col = 1-3");
            int row = sc.nextInt() - 1;
            int col = sc.nextInt() - 1;
            if (isvalid(row, col)) {

                a[row][col] = currentPlayer;

                if (winner()) {
                    display();
                    System.out.println("the winner is " + currentPlayer);
                    gamerun = false;
                } else if (draw()) {
                    display();
                    System.out.println("the match was draw");
                    gamerun = false ;

                } else {
                    //display();
                    currentPlayer = currentPlayer == 'X' ? 'O' : 'X';
                    

                }

            } else {
                System.out.println("invalid move");
            }
        }




    }
}

