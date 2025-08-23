package ArrayListMagnet;

import java.util.ArrayList;

public class ArrayListMagnet {

    //
    public static void printList(ArrayList<String> list) {

        for (String element : list) {

            System.out.println(element + " ");
        }
        System.out.println();

    }
    //

    // main drive
    public static void main(String[] args) {

        ArrayList<String> a = new ArrayList<>();

        a.add("zero");
        a.add("one");
        a.add("two");
        a.add("three");
        printList(a);

        if (a.contains("three")) {
            a.add("four");
        }
        a.remove(2);
        printList(a);

        if (a.indexOf("four") != 4) {
            a.add(4, "4");

        }

        printList(a);

        if (a.contains("two")) {
            a.add("2.2");
        }
        printList(a);

    }

}
