import java.util.ArrayList;
import java.util.Scanner;
// checking the task is completed or not
class task{
    String input2 ;
    boolean complet;

    public task(String input2) {
        this.complet = false ;
        this.input2 = input2;
    }


    public boolean markasread(){
        return complet = true;
    }

    @Override
    public String toString() {
        return (complet? "[✔]" : "[]" ) + input2;
    }

}
public class TO_DO_LIST {
    public ArrayList<task> list ;
//    boolean taskcomplete = false ;

    public TO_DO_LIST() {
        this.list = new ArrayList<>();
        // this.taskcomplete = taskcomplete;
    }

    public void addtask( String  input){
        list.add(new task(input));
    }
    public void deleteitem(int index){
        list.remove(index);

    }
    public void view (){
        for(int i = 0 ; i < list.size() ; i++){
            System.out.println(  i + 1 + " " +  list.get(i));
        }
    }
    public  void markasread1(int index){
        list.get(index).markasread();

    }

    //public boolean enter

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        TO_DO_LIST mylist =new TO_DO_LIST();
       // if(mylist.)
        while(true){
            System.out.println("your list is created ");
            System.out.println("1.Add item");
            System.out.println("2.delete a item");
            System.out.println("3. mark as tick ");
            System.out.println("4. view the list");
            System.out.println("5. exit");
            System.out.println();
            System.out.println("choose a option below ");
            int choose = sc.nextInt();
            switch (choose){
                case 1 :
                    System.out.println("enter your list  to be added");
                    sc.nextLine();
                    String inp = sc.nextLine();
                    mylist.addtask(inp );
                    break;
                case 2 :
                    System.out.println("enter the index of the item to be delted");
                    int n = sc.nextInt();
                    mylist.deleteitem(n);
                    break;
                case 3 :
                    System.out.println("enter the index which you wanted to tick as read");
                   int ind =  sc.nextInt();
                    mylist.markasread1(ind);
                    break;
                case 4 :
                    mylist.view();
                    break;

                case 5 :
                    System.out.println("thank you for creating");
                    return;

                default:
                    System.out.println("invalid key");

            }

        }

    }
}
