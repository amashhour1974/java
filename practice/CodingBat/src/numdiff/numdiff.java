import java.util.Scanner;

public class numdiff {

    public static void main(String[] args) {
        Scanner usernum = new Scanner(System.in);

        System.out.println("Enter number :");

        int num = usernum.nextInt();

        int diff;

        if (num <= 21) {

            diff = 21 - num;

            System.out.println("number is less than 21 and difference is :" + diff);

        } else {
            diff = (21 - num) * 2;

            System.out.println("number is bigger than 21 and difference :" + diff);

        }
    }

}
