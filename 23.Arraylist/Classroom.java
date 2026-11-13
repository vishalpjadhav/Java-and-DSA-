import java.util.ArrayList;

public class Classroom {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // add elements
        System.out.println("-----------Insert Elements -----------");
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println(list);
        System.out.println("-----------Insert Elements At Particular position -----------");
        list.add(2, 200);
        System.out.println(list);
        // Access element
        System.out.println("-----------Access Elements -----------");
        int x = list.get(0);
        System.out.println(x);

        // update an element
        System.out.println("-----------update Elements -----------");
        list.set(1, 100);
        System.out.println(list);
        // remove Elements
        System.out.println("-----------Remove Elements -----------");
        list.remove(1);
        System.out.println(list);
        // Check element existence
        System.out.println("-----------Check element existence -----------");
        System.out.println(list.contains(30));
        System.out.println(list.contains(300));
        // Returns the number of elements present in the ArrayList
        System.out.println("--------Returns the number of elements present in the ArrayList---------");
        System.out.println(list.size());

        // Checks whether the ArrayList contains zero elements.
        System.out.print("isempty:- ");
        System.out.println(list.isEmpty());

        // Removes all elements from the ArrayList.
        System.out.println("-------------------------------------------------------------------");
        System.out.println("Removes all elements from the ArrayList.");
        list.clear();

        System.out.println(list);
    }
}
