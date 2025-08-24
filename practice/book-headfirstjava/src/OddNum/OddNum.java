package OddNum;

class OddNum {

    public static boolean isEven(int n) {

        // finding remaining of n
        int rem = n % 2;
        if (rem == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {

            boolean result = isEven(i);

            if (result) {
                System.out.println(i + "is Even Number." + isEven(i));
            } else {
                System.out.println(i + " is Odd Number");
            }

        }
    }

}
