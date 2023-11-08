public class Vehicle {
    private final static double DEFAULT_FUEL_CONSUMPTION = 1.25;

    private double fuelConsumption;

    private  double fuel;

    private int horsePower;

    public Vehicle(double fuel, int horsePower){
        this.fuel = fuel;
        this.horsePower = horsePower;
        this.fuelConsumption = DEFAULT_FUEL_CONSUMPTION;
    }

    public void drive(double kilometers){
        double fuelToBeConsumed = kilometers * fuelConsumption;
        if(fuelToBeConsumed > fuel){
            System.out.println("Not enough fuel");
        } else{
            fuel -= fuelToBeConsumed;
            System.out.println("Drove " + kilometers + " km");
        }
    }

    public double getFuel() {
        return fuel;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public double getHorsePower() {
        return horsePower;
    }

    public void setFuelConsumption(double defaultFuelConsumption) {
        double fuelConsumption = defaultFuelConsumption;
    }
}
