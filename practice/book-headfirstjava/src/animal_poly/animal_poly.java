package animal_poly;

class animal {

    public void animalsound() {

        System.out.println("The animal makes sound ..");

    }
}

// pig animal extends animal
class pig extends animal {
    public void animalsound() {
        System.out.println("pig makes sound..");
    }
}

// dog extends animal

class Dog extends animal {
    public void animalsound() {
        System.out.println("dog makes sound ..");
    }
}

public class animal_poly {

    public static void main(String[] args) {
        animal a = new animal();
        a.animalsound();
        animal mypig = new pig();
        mypig.animalsound();
        animal mydog = new Dog();
        mydog.animalsound();

    }

}
