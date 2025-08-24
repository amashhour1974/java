package DogArray;

class Dog {

    String name;

    void bark() {
        System.out.println(name + " says Ruff !");
    }

    void eat() {
    }

    void chaseCat() {

    }

}

// Test Drive

public class TestDog {

    public static void main(String[] args) {

        Dog dog1 = new Dog();
        dog1.bark();
        dog1.name = "Bart";

        // make dog array
        Dog[] myDogs = new Dog[3];
        // put some dogs in it
        myDogs[0] = new Dog();
        myDogs[1] = new Dog();
        myDogs[2] = dog1;

        // now access the dogs using arrage
        myDogs[0].name = "Fref";
        myDogs[1].name = "Merge";

        // hmm what is dog 2 name
        System.out.println("Last dog name is : ");
        System.out.println(myDogs[2].name);

        // now loop all array and tell dogs to bark
        int x = 0;
        while (x < myDogs.length) {
            myDogs[x].bark();
            x = x + 1;
        }
    }
}
