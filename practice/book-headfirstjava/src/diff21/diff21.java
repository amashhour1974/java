package diff21;

import java.util.Scanner;

class diff21 {
    int diff;

    public int ndiff(int n) {
        if (n <= 21) {
            diff = n - 21;
            System.out.println("number is less than 21");
        } else {
            diff = (n - 21) * 2;
            System.out.println("numer bigger than 21");
        }
        return diff;

    }

    public static void main(String[] args) {
        Scanner usernum = new Scanner(System.in);

        System.out.println("Enter a numer ");

        int unum = usernum.nextInt();

        diff21 mynum = new diff21();

        mynum.ndiff(unum);

        System.out.println("difference = " + mynum.diff);

    }

}
