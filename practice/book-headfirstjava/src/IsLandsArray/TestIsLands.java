package IsLandsArray;

// Test IsLandArray
class TestIsLands {
    public static void main(String[] args) {
        String[] islands = new String[4];
        islands[0] = "Bermuda";
        islands[1] = "Fiji";
        islands[2] = "Azores";
        islands[3] = "Cozumel";

        //
        int[] indx = new int[4];
        indx[0] = 1;
        indx[1] = 3;
        indx[2] = 0;
        indx[3] = 2;

        // loop
        int y = 0;
        int ref;

        while (y < 4) {
            ref = indx[y];
            System.out.print("island = ");
            System.out.println(islands[ref]);
            y = y + 1;
        }

    }

}
