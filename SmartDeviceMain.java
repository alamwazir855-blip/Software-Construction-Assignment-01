package Assignmet01;

public class SmartDeviceMain {

    public static void main(String[] args) {

        SmartBulb bulb = new SmartBulb();

        bulb.turnOn();
        bulb.setBrightness(80);

        System.out.println(bulb.getStatus());
        System.out.println("Brightness: "
                + bulb.getBrightness());


        SmartThermostat thermostat =
                new SmartThermostat();

        thermostat.turnOn();
        thermostat.setTemperature(24.5);

        System.out.println(thermostat.getStatus());
        System.out.println("Temperature: "
                + thermostat.getTemperature());
    }
}