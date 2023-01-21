package ArrayList;

import java.util.ArrayList;

public class ArrayListBasics {
    public static void main(String args[]) {
        // Initialize ArrayList
        // ClassName objectName = new ClassName();
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList<>();

        // Operations
        // Add operation
        list.add(1); // time taken to add each element is O(1).
        list.add(2);
        list.add(3);
        list.add(4);

        // Way to add element at particular index
        list.add(4, 5); // TC-> O(n).
        list.add(1, 9);

        // System.out.println(list);

        // Get operation - TC-> O(1).
        int element = list.get(2);
        System.out.println(element);

        // Remove operation - TC-> O(n).
        list.remove(2);
        System.out.println(list);

        // Set element at index - TC-> O(n).
        list.set(2, 10);
        System.out.println(list);

        // Contains element(means element exist or not).
        System.out.println(list.contains(10));
        System.out.println(list.contains(3));

        // Size of ArrayList
        System.out.println(list.size());

        // print ArrayList using loop
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        // print ArrayList in reverse
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
}
