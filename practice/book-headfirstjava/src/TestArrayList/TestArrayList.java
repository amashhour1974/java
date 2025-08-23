package TestArrayList;

import java.util.ArrayList;

class TestArrayList {

    ArrayList<String> cars = new ArrayList<String>();

    void addcar(String itm) {
        cars.add(itm);
    }

    public static void main(String[] args) {

        TestArrayList mycar = new TestArrayList();

        mycar.addcar("MG");
        mycar.addcar("Toyota");
        mycar.addcar("Ford");
        mycar.addcar("Nissan");
        mycar.addcar("Mercedes");

        // print again list
        System.out.println("List Elements are : " + mycar.cars);

    }

}
