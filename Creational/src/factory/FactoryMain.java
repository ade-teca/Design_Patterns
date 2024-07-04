package factory;

import factory.phone.Android;
import factory.phone.OperatingSystemFactory;
import factory.phone.Os;

public class FactoryMain {
    public static void main(String[] args) {
        //Os obj = new Android();
        OperatingSystemFactory x = new OperatingSystemFactory();
        Os obj = x.getInstance("Closed");

        obj.spec();
    }
}
