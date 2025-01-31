import java.util.Scanner;

public class tower_of_hanoi {


    public static void tower(int n ,String sourse , String help , String destiny){
        if( n<= 0 ){
            return;
        }
       if(n == 1 ){
           System.out.println( "rod : {] " + n + " move from " + sourse + " to " +  destiny + " usning " + help );
       }
        else {
            tower(n-1 , sourse , destiny ,help);
           System.out.println( "rod " + n + " move from " + sourse + " to " +  destiny + " using " + help );
           tower(n-1 , help , sourse ,destiny);
       }

    }

    public static void main(String[] args) {

        tower(1 ," A " , " B " ," C ");
    }
}
