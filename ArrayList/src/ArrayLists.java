import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayLists {
    public static void main(String[] args) {

//      Integer | Float | Boolean
        ArrayList<Integer> list1 = new ArrayList<>();

        //Add Elemnets
        list1.add(0);
        list1.add(2);
        list1.add(3);

        System.out.println(list1);

        //Get Function
        int element = list1.get(0);
        System.out.println(element);

        //add elements in between
        list1.add(1,1);
        System.out.println(list1);

        //set elements in between
        list1.set(0,5);
        System.out.println(list1);

        //delete elements
        list1.remove(3);
        System.out.println(list1);

        //find elements in arraylist
        int size = list1.size();
        System.out.println(size);

        //loops(iterate over Arraylist)
        for(int i=0;i<list1.size();i++){
            System.out.print(list1.get(i));
        }
        System.out.println();

        //sorting
        Collections.sort(list1);
        System.out.println(list1);
    }
}