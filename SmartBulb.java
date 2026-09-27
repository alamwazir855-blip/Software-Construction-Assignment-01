package Assignmet01;

public class SmartBulb implements SmartDevice {

    private boolean on;
    private int brightness;

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
        return on ? "Bulb is ON" : "Bulb is OFF";
    }

    public void setBrightness(int level) {

        if (level >= 0 && level <= 100) {
            brightness = level;
        }
    }

    public int getBrightness() {
        return brightness;
    }
}