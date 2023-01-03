package Day03.demo07;

public class DemoMain {

    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.powerOn();

//        Mouse mouse = new Mouse();
        USB usbMouse = new Mouse();
        computer.useDevice(usbMouse);

        Keyboard keyboard = new Keyboard();
        computer.useDevice(keyboard);
//        computer.useDevice(new Keyboard());

        computer.powerOff();
        System.out.println("================");

        methid(10.0);
        methid(20);
        int a = 30;
        methid(a);
    }

    public static void methid(double num){
        System.out.println(num);
    }

}
