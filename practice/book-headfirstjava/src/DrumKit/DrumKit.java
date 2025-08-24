package DrumKit;

class DrumKit {

    boolean snare = true;
    boolean topHat = true;

    // play bang bang bang
    void playSnare() {
        System.out.println("bang bang ba-bang");
    }

    // play dang dang ding
    void playTopHat() {
        System.out.println("ding ding da-ding");
    }

}

// testdrum
class DrumKitTestDrive {

    public static void main(String[] args) {
        DrumKit d = new DrumKit();
        d.playSnare();
        d.snare = false;
        d.playTopHat();
        if (d.snare == true) {
            d.playSnare();
        }
    }

}
