package IndexNum_ArrayList;

import java.util.ArrayList;

public class IndexNum {

    public static void main(String[] args) {

        ArrayList<Integer> a = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            a.add(i);
        }
        // print list of numbers 0-10
        System.out.println(a);

        a.remove(3);
        a.remove(6);
        ///a.remove(8);
        System.out.println(a);

        // a.add(3, 10);
        // a.add(6, 15);
        // a.add(8, 23);

        // check odd , even numbers

        for (int numbrs : a) {

            int rem = numbrs % 2;

            if (rem == 0) {
                System.out.println(numbrs + " is even numebr , index in the list : " + a.indexOf(numbrs));

            } else {
                System.out.println(numbrs + " is Odd number,  index in the list : " + a.indexOf(numbrs));
            }

        }

    }

}
