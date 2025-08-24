package Hobbits;

class Hobbits {

    String name;

    public static void main(String[] args) {
        Hobbits[] ha = new Hobbits[3];
        int z = -1;

        while (z < 2) {
            z = z + 1;
            ha[z] = new Hobbits();
            ha[z].name = "bilbo";

            if (z == 1) {
                ha[z].name = "Fred";
            }
            if (z == 2) {
                ha[z].name = "sam";
            }

            System.out.println(ha[z].name + " is  a");
            System.out.println("good Hobbit name.");
        }
    }

}
