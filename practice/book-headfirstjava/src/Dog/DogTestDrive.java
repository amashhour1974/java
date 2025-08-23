package Dog;

class Dog {

    int size;
    String name;
    String bread;

    void bark() {
        System.out.println("Ruff ! Ruff !");
    }

}

public class DogTestDrive {

    public static void main(String[] args) {
        Dog d = new Dog();
        d.size = 40;
        d.bark();
    }
}
