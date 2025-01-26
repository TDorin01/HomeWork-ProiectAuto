package org.example;

class Volkswagen extends Car {
    public Volkswagen(float availableFuel, String chassisNumber, int tireSize) {
        super(50, "DIESEL", 4.7f, chassisNumber, tireSize);
        this.availableFuel = availableFuel;
    }
}