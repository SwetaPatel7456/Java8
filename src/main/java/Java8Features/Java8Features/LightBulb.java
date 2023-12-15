package Java8Features.Java8Features;

public class LightBulb implements Switchable {

    private boolean isOn = false;

    public void turnOn() {
        isOn = true;
        System.out.println("Lightbulb is on");
    }

    public void turnOff() {
        isOn = false;
        System.out.println("Lightbulb is off");
    }

    public boolean isOn() {
        return isOn;
    }
}
