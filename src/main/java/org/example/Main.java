package org.example;

public class Main {
    public static void main(String[] args) {
        Car logan = new Logan(27, "Log0123456");
        logan.start();
        logan.shiftGear(1);
        logan.drive(0.01); // car drives 0.01 KMs
        logan.shiftGear(2);
        logan.drive(0.02); // car drives 0.02 KMs
        logan.shiftGear(3);
        logan.drive(0.5); // car drives 0.05 KMs
        logan.shiftGear(4);
        logan.drive(0.5); // car drives 0.05 KMs
        logan.shiftGear(5);
        logan.drive(10); // car drives 0.05 KMs
        logan.shiftGear(4);
        logan.drive(0.5); // car drives 0.02 KMs
        logan.shiftGear(3);
        logan.drive(0.1); // car drives 0.01 KMs
        logan.stop();

        System.out.println("The fuel available at the end of driving is : " + logan.getAvailableFuel() + " liters .");
        System.out.println("Average fuel consumption of the car is : " + logan.getAverageFuelConsumption() + " % l .");
        System.out.println("\n --------------------------------------------------------------------------------");

        Car duster = new Duster(30, "Duster123456");
        duster.start();
        duster.shiftGear(1);
        duster.drive(0.01); // car drives 0.01 KMs
        duster.shiftGear(2);
        duster.drive(0.02); // car drives 0.02 KMs
        duster.shiftGear(3);
        duster.drive(0.5); // car drives 0.05 KMs
        duster.shiftGear(4);
        duster.drive(0.5); // car drives 0.05 KMs
        duster.shiftGear(5);
        duster.drive(10); // car drives 0.05 KMs
        duster.shiftGear(4);
        duster.drive(0.5); // car drives 0.02 KMs
        duster.shiftGear(3);
        duster.drive(0.1); // car drives 0.01 KMs
        duster.stop();
        System.out.println("The fuel available at the end of driving is : " + duster.getAvailableFuel() + " liters .");
        System.out.println("Average fuel consumption of the car is : " + duster.getAverageFuelConsumption() + " % l .");
        System.out.println("\n --------------------------------------------------------------------------------");

        Car golf = new VWGolf(30, "Golf123456");
        golf.start();
        golf.shiftGear(1);
        golf.drive(0.01); // car drives 0.01 KMs
        golf.shiftGear(2);
        golf.drive(0.02); // car drives 0.02 KMs
        golf.shiftGear(3);
        golf.drive(0.5); // car drives 0.05 KMs
        golf.shiftGear(4);
        golf.drive(0.5); // car drives 0.05 KMs
        golf.shiftGear(5);
        golf.drive(10); // car drives 0.05 KMs
        golf.shiftGear(4);
        golf.drive(0.5); // car drives 0.02 KMs
        golf.shiftGear(3);
        golf.drive(0.1); // car drives 0.01 KMs
        golf.stop();
        System.out.println("The fuel available at the end of driving is : " + golf.getAvailableFuel() + " liters .");
        System.out.println("Average fuel consumption of the car is : " + golf.getAverageFuelConsumption() + "  % l .");
        System.out.println("\n --------------------------------------------------------------------------------");

        Car passat = new VWPassat(30, "Passat123456");
        passat.start();
        passat.shiftGear(1);
        passat.drive(0.01); // car drives 0.01 KMs
        passat.shiftGear(2);
        passat.drive(0.02); // car drives 0.02 KMs
        passat.shiftGear(3);
        passat.drive(0.5); // car drives 0.05 KMs
        passat.shiftGear(4);
        passat.drive(0.5); // car drives 0.05 KMs
        passat.shiftGear(5);
        passat.drive(10); // car drives 0.05 KMs
        passat.shiftGear(4);
        passat.drive(0.5); // car drives 0.02 KMs
        passat.shiftGear(3);
        passat.drive(0.1); // car drives 0.01 KMs
        passat.stop();
        System.out.println("The fuel available at the end of driving is : " + passat.getAvailableFuel() + " liters .");
        System.out.println("Average fuel consumption of the car is : " + passat.getAverageFuelConsumption() + " % l .");
        System.out.println("\n --------------------------------------------------------------------------------");
    }
}