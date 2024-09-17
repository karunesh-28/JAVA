import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListEx1 {

    public static void main(String[] args) {
        // List list1 stores String objects
        ArrayList<String> list1 = new ArrayList<String>();
        //** ADD elements to the list1
        list1.add("Tom"); // index 0
        list1.add("Shyam"); // index 1
        list1.add("Ravi"); // index 2
        list1.add("Sam"); // index 3
        list1.add("Pam"); // index 4
        list1.add("Ram"); // index 5, duplicate items are allowed
        
        System.out.println("** ADD elements in list1 using add(index,element) ***");
        list1.add(1, "Naina"); // It is used to insert the specified element at the specified position

        System.out.println("** PRINT elements in the list the way we added ***");
        System.out.println("List1: " + list1);

        //** GET elements from the list1 
        System.out.println("** GET (Read) elements from the list1 ***");
        System.out.println("list1(3): " + list1.get(3));

        //** UPDATING elements ***
        System.out.println("** UPDATING elements ***");
        list1.set(2, "Shanoya");
        System.out.println("Updated list1: " + list1);

        //** REMOVING elements ***
        System.out.println("** REMOVING elements ***");
        list1.remove(2);
        System.out.println("list1 after removing element at index 2: " + list1);

        list1.remove("Sam");
        System.out.println("list1 after removing element 'Sam': " + list1);

        //** CLEAR all elements (commented out in your code)
        // list1.clear();

        //** CHECK if list contains specific elements ***
        System.out.println("** Contains ***");
        if (list1.contains("Ravi"))
            System.out.println("Ravi is in the list");
        else
            System.out.println("Ravi is not in the list");

        if (list1.contains("Shanoya"))
            System.out.println("Shanoya is in the list");
        else
            System.out.println("Shanoya is not in the list");

        System.out.println("** Iterate ArrayList using basic for loop ***");
        for(int i=0; i<list1.size(); i++)
           System.out.println(list1.get(i));

        System.out.println("** Iterate ArrayList using for-each loop ***");
        for(String str : list1)
          System.out.println(str);

        System.out.println("** Iterating with iterator ***");
        Iterator<String> itr = list1.iterator();
        while(itr.hasNext()) {
            String str = itr.next();
            System.out.println(str);
            if(str.equals("Sam"))
              itr.remove();
        }

        System.out.println("List1 after iterating using iterator: " + list1);

        ListIterator<String> listItr = list1.listIterator();
        System.out.println("============ Forward ============");
        while(listItr.hasNext()) {
            System.out.println(listItr.next());
        }

        System.out.println("============ Backward ============");
        while(listItr.hasPrevious()) {
            System.out.println(listItr.previous());
        }

        //** isEmpty() ***
        System.out.println("** isEmpty() ***");
        if(list1.isEmpty())
           System.out.println("List1 is empty");
        else
           System.out.println("List1 is not empty");

        ArrayList<String> al1 = new ArrayList<String>();
        al1.add("AAA");
        al1.add("BBB");
        al1.add("CCC");
        al1.add("DDD");

        ArrayList<String> al2 = new ArrayList<String>(al1);
        System.out.println(al2);
    }
}