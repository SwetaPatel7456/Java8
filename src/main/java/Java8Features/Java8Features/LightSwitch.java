package Java8Features.Java8Features;

public class LightSwitch {
   //without DIP
//    LightBulb lightBulb;
//    LightSwitch(LightBulb lightBulb){
//
//       this.lightBulb=  lightBulb;
//    }
//    public void operate() {
//        if (lightBulb.isOn()) {
//            lightBulb.turnOff();
//        } else {
//            lightBulb.turnOn();
//        }
//    }
    //using dependency inversion principle.
   Switchable device;
    LightSwitch(Switchable switchable){
        this.device = switchable;
    }
    public void operate() {
        if (device.isOn()) {
            device.turnOff();
        } else {
            device.turnOn();
        }
    }
}
