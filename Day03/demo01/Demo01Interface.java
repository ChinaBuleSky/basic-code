package Day03.demo01;

public class Demo01Interface {

    public static void main(String[] args) {
//        MyInterfaceAbstract inter = new MyInterfaceAbstract();

        MyinterfaceAbstractImpl impl = new MyinterfaceAbstractImpl();
        impl.methodAbstract1();
        impl.methodAbstract2();
    }

}
