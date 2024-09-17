import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class AnimalListExample {

    public static void main(String[] args) {
       
        ArrayList<String> animals1 = new ArrayList<String>();

        animals1.add("Cat");
        animals1.add("Dog");
        animals1.add("Cow");
        animals1.add("Lion");

        System.out.println("Initial list: " + animals1);

        animals1.add(0, "Tiger");

        animals1.add(3, "Zebra");

        System.out.println("List after adding Tiger and Zebra: " + animals1);

        ArrayList<String> animals2 = new ArrayList<String>();
        animals2.add("Kangaroo");
        animals2.add("Donkey");
        animals2.add("Cow");

        animals1.addAll(animals2);

        System.out.println("Element at index 2: " + animals1.get(2));

        System.out.println("Index of first occurrence of 'Cow': " + animals1.indexOf("Cow"));

        System.out.println("Index of last occurrence of 'Cow': " + animals1.lastIndexOf("Cow"));

        System.out.println("Is 'Dog' present? " + animals1.contains("Dog"));

        System.out.println("Is 'Rat' present? " + animals1.contains("Rat"));

        System.out.println("Is the list empty? " + animals1.isEmpty());

        System.out.println("Number of elements in the list: " + animals1.size());

        animals1.remove("Cow");

        animals1.remove(2);

        animals1.add(2, "Ant");

        animals1.set(2, "Antelope");

        System.out.println("Iterating using for loop:");
        for (int i = 0; i < animals1.size(); i++) {
            System.out.println(animals1.get(i));
        }

        System.out.println("Iterating using enhanced for loop:");
        for (String animal : animals1) {
            System.out.println(animal);
        }

        System.out.println("Iterating using iterator:");
        Iterator<String> iterator = animals1.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("Iterating using list iterator (forward):");
        ListIterator<String> listIterator = animals1.listIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        System.out.println("Iterating using list iterator (backward):");
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
    }
}