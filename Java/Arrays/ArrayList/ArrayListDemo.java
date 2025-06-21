import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // Adding elements
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println("List: " + list);

        // Insert at index
        list.add(1, 15); // Insert 15 at index 1
        System.out.println("After Insert: " + list);

        // Get and update
        System.out.println("Element at index 2: " + list.get(2));
        list.set(2, 25); // Update index 2 to 25
        System.out.println("After Update: " + list);

        // Remove elements
        list.remove(Integer.valueOf(15)); // By value
        list.remove(0);                   // By index
        System.out.println("After Remove: " + list);

        // Size and check
        System.out.println("Size: " + list.size());
        System.out.println("Contains 25? " + list.contains(25));
    }
}
