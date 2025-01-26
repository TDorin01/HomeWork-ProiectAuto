package org.example;

class Dacia extends Car {
    public Dacia(float availableFuel, String chassisNumber, int tireSize) {
        super(50, "PETROL", 5.5f, chassisNumber, tireSize);
        this.availableFuel = availableFuel;
    }
}

