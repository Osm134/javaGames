import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        ArrayList list = new ArrayList();
        list.add(12);
        list.add(23);
        list.add(24);
        list.add(26);
        System.out.println(list);
        list.remove(0);
        System.out.println(list);
        for(int i =  0 ; i < list.size() ; i++){
            System.out.println(list.get(i));
        }
    }
}