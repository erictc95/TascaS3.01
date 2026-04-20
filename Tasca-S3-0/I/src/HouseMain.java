public class HouseMain {
    public static void main(String[] args) {
        AirConditioner ac = new AirConditioner();

        Switchable s = ac;
        TemperatureControl tc = ac;

        s.turnOn();
        tc.heat();
        tc.cool();
        s.turnOff();

        WashingMachine wm = new WashingMachine();
        Switchable s2 = wm;
        Washable w = wm;

        s2.turnOn();
        w.wash();
        s2.turnOff();
    }
}
