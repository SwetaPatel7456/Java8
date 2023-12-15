package Java8Features.Java8Features;

public class DIPImplementaion {
    public static void main(String[] args) {
        Switchable switchable = new LightBulb();
        LightSwitch lightSwitch = new LightSwitch(switchable);
        Switchable switchable1 = new LightFan();
        LightSwitch lightSwitch1 = new LightSwitch(switchable1);
    }
}
