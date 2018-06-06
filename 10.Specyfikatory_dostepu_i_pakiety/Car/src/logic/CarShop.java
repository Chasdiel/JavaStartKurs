package logic;

import data.Car;

/**
 * Created by Chasdiel on 2017-10-16.
 */

public class CarShop {
    public static void main(String[] args) {
        Car audiA5 = new Car(2014, "Audi", "A5", "Czarne");

        System.out.println(audiA5.getBrand() + " " + audiA5.getModel() + " " + audiA5.getYear() + " " + audiA5.getColor());
    }
}
}