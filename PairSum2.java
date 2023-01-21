package ArrayList;

import java.util.*;;

public class PairSum2 {
    // Solve Using 2 pointer approach. TC->O(n).
    public static boolean pairSum2(ArrayList<Integer> list, int target) {
        int pivot = -1;
        int n = list.size();
        // Find out pivot
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > list.get(i + 1)) {
                pivot = i; // breaking point
                break;
            }
        }
        int lp = pivot + 1; // smallest element
        int rp = pivot; // largest element

        while (lp != rp) {
            // Case 1
            if (list.get(lp) + list.get(rp) == target) {
                return true;
            }

            // case 2
            if (list.get(lp) + list.get(rp) < target) {
                lp = (lp + 1) % n;
            } else {
                // case 3
                rp = (n + rp - 1) % n;
            }
        }

        return false;
    }

    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        /*
         * Find if any pair in a Sorted & Rotated ArrayList
         * has a target sum.
         * list = [11, 15, 6, 8, 9, 10], target=16.
         */
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);

        int target = 16;
        System.out.println(pairSum2(list, target));
    }
}
