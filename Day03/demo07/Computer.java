package Day03.demo07;

import java.security.Key;

public class Computer {

    public void powerOn(){
        System.out.println("笔记本电脑开机");
    }

    public void powerOff(){
        System.out.println("笔记本电脑关机");
    }

    // use USB
    public void useDevice(USB usb){
        usb.open();//打开
        if (usb instanceof  Mouse){
            Mouse mouse = (Mouse) usb;
            mouse.click();
        } else if(usb instanceof Keyboard){
            Keyboard keyboard = (Keyboard) usb;
            keyboard.type();
        }
        usb.close();//关闭
    }

}
