package com.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSET {

    public static void main(String[] args) {

        HashSet<Integer> set = new HashSet<>();

        // 1️⃣ Add (duplicates not allowed)
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);   // duplicate (ignored)

        // 2️⃣ Size
        System.out.println("Size of set is: " + set.size());

        // 3️⃣ Search
        if (set.contains(1)) {
            System.out.println("1 is present");
        }

        if (!set.contains(6)) {
            System.out.println("6 is absent");
        }

        // 4️⃣ Delete
        set.remove(1);
        if (!set.contains(1)) {
            System.out.println("1 removed successfully");
        }

        // 5️⃣ Print all elements
        System.out.println("Set: " + set);

        // 6️⃣ Iterator (no order guarantee)
        set.add(0);

        Iterator<Integer> it = set.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        // 7️⃣ For-each loop
        for (Integer value : set) {
            System.out.println("For-each value: " + value);
        }

        // 8️⃣ isEmpty
        if (!set.isEmpty()) {
            System.out.println("Set is not empty");
        }

        // 9️⃣ addAll()
        Set<Integer> newSet = new HashSet<>();
        newSet.add(10);
        newSet.add(20);

        set.addAll(newSet);
        System.out.println("After addAll: " + set);

        // 🔟 removeAll()
        set.removeAll(newSet);
        System.out.println("After removeAll: " + set);

        // 1️⃣1️⃣ clear()
        set.clear();
        System.out.println("After clear: " + set);
    }
}
