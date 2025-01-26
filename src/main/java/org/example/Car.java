package org.example;

abstract class Car extends Vehicle {
    protected final float fuelTankSize;
    protected final String fuelType;
    protected final int maxGears = 6;
    protected final float consumptionPer100Km;
    protected final String chassisNumber;

    protected float availableFuel;
    protected int currentGear;
    protected int tireSize;
    private float totalFuelConsumed = 0;
    private float totalDistanceDriven = 0;

    public Car(float fuelTankSize, String fuelType, float consumptionPer100Km, String chassisNumber, int tireSize) {
        this.fuelTankSize = fuelTankSize;
        this.fuelType = fuelType;
        this.consumptionPer100Km = consumptionPer100Km;
        this.chassisNumber = chassisNumber;
        this.tireSize = tireSize;
        this.currentGear = 0; // Neutral
    }

    @Override
    public float start() {
        totalFuelConsumed = 0;
        totalDistanceDriven = 0;
        System.out.println("Car started.");
        return 0;
    }

    @Override
    public void stop() {
        System.out.println("Car stopped.");
    }

    @Override
    public void drive(double kilometers) {
        if (currentGear == 0) {
            System.out.println("Cannot drive in neutral gear!");
            return;
        }
        float consumption = calculateFuelConsumption(kilometers);
        if (availableFuel < consumption) {
            System.out.println("Don't have enough fuel to drive " + kilometers + " KM.");
            return;
        }
        availableFuel -= consumption;
        totalFuelConsumed += consumption;
        totalDistanceDriven += kilometers;
        System.out.println("Drove " + kilometers + " KM in gear " + currentGear);
    }

    public void shiftGear(int gear) {
        if (gear < 0 || gear > maxGears) {
            System.out.println("Invalid gear!");
            return;
        }
        currentGear = gear;
        System.out.println("Shifted to gear " + gear);
    }

    public float getAvailableFuel() {
        return availableFuel;
    }

    public float getAverageFuelConsumption() {
        if (totalDistanceDriven == 0) return 0;
        return (totalFuelConsumed / totalDistanceDriven) * 100;
    }

    protected float calculateFuelConsumption(double kilometers) {
        float gearConsumptionMultiplier = 1.0f + (currentGear - 1) * 0.05f; // 5% increase per gear
        float tireConsumptionMultiplier = 1.0f + (tireSize - 15) * 0.02f;   // 2% increase per tire size
        return (float) (kilometers * consumptionPer100Km * gearConsumptionMultiplier * tireConsumptionMultiplier / 100);
    }
}