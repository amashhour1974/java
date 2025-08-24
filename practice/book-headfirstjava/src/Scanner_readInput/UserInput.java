package Scanner_readInput;

import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {
        Scanner userinput = new Scanner(System.in);

        System.out.println("Enter Name , Age and Salary : ");

        String name = userinput.nextLine();
        int age = userinput.nextInt();
        double salary = userinput.nextDouble();

        System.out.println("User name : " + name);
        System.out.println("User Age : " + age);
        System.out.println("User Salary : " + salary);

    }

}
