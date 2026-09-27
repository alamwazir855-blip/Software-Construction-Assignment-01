package Assignmet01;

public class SmartThermostat implements SmartDevice {

    private boolean on;
    private double temperature;

    @Override
    public void turnOn() {
        on = true;
    }

    @Override
    public void turnOff() {
        on = false;
    }

    @Override
    public String getStatus() {
        return on ? "Thermostat is ON" : "Thermostat is OFF";
    }

    public void setTemperature(double temp) {
        temperature = temp;
    }

    public double getTemperature() {
        return temperature;
    }
}