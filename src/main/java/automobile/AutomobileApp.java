package main.java.automobile;

import main.java.automobile.file.Automobile;
import main.java.automobile.file.Engine;
import main.java.automobile.file.Tank;
import main.java.automobile.file.Wheels;

import java.util.Scanner;

public class AutomobileApp {

    public static void main(String[] args) {

        Engine engine = new Engine();
        Wheels wheels = new Wheels();
        Tank tank = new Tank();

        System.out.println("Hello! Today we will create a new automobile and go to the sea.");
        System.out.println("So, let's start. Please enter your dream automobile brand.");
        Scanner scan = new Scanner(System.in);
        String brand = scan.nextLine();
        System.out.println("Cool, you have choosen " + brand + ".");
        System.out.println("Menu:");
        System.out.println("1- to create engine for the auto");
        System.out.println("2 - to choose the wheels for the auto");
        System.out.println("3 - to fill the tank");
        int number = scan.nextInt();
        switch (number) {
            case 1:
                System.out.println("Please choose the engine volume (from 0.6 to 6.0.)");
                Double engineVolume = scan.nextDouble();
                System.out.println("You have choosen " + engineVolume);
                System.out.println("How many cylinders to set in the engine (from 3 to 8)?");
                int quantityOfCylinders = scan.nextInt();
                System.out.println("You have set " + quantityOfCylinders + " cylinders.");
                engine.setEngineVolume(engineVolume);
                engine.setQuantityOfCylinders(quantityOfCylinders);

            case 2:
                System.out.println("Press 1 - to choose R16 wheels size");
                System.out.println("Press 2 - to choose R17 wheels size");
                int number2 = scan.nextInt();
                if (number2 == 1) wheels.setWheelsSize("R16");
                else wheels.setWheelsSize("R17");
                System.out.println("What kind of rubber to put");
                System.out.println("Press 1 - for summer rubber");
                System.out.println("Press 2 - for winter rubber");
                System.out.println("Press 3 - for all season rubber");
                int number3 = scan.nextInt();
                if (number3 == 1) wheels.setWheelsRubber("summer rubber");
                else if (number3 == 2) wheels.setWheelsRubber("winter rubber");
                else wheels.setWheelsRubber("all season rubber");

            case 3:
                System.out.println("How many liters to pour into tank?");
                int liters = scan.nextInt();
                tank.setLiters(liters);
                if (liters < 5) {
                    System.out.println("Come on, add some more!");
                } else if (liters > 80) {
                    System.out.println("Hey, have the decency, pour less, as so much won't fit!");
                } else {
                    System.out.println();
                    System.out.println("Good, there are " + liters + " liters in your tank.");
                }
                Automobile automobile = new Automobile();
                automobile.setBrand(brand);
                automobile.setEngine(engine);
                automobile.setWheels(wheels);
                automobile.setTank(tank);
                System.out.println();
                System.out.println("This is your automobile:" + automobile);
        }
    }
}


