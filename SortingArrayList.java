package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortingArrayList {
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);

        Collections.sort(list); // Sort in ascending order
        System.out.println(list);

        // Sort in decending order
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
    }
}
