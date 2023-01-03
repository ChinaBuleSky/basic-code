package Day03.demo06;

/*
对象一旦向上转型为父类，就无法调用子类原本特有的内容
 */
public class Demo01Main {

    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.eat();

//        animal.catchMouse();
        Cat cat = (Cat)animal;
        cat.catchMouse();

        //error
        //java.lang.ClassCastException
//        Dog dog = (Dog) animal;//错误写法
    }

}
