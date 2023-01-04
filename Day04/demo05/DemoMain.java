package Day04.demo05;

public class DemoMain {

    public static void main(String[] args) {
//        MyInterface impl = new MyInterfaceImpl();
//        impl.method();

//        MyInterface some = new MyInterface();

        MyInterface objA = new MyInterface() {
            @Override
            public void method1() {
                System.out.println("匿名内部类实现了方法111-A");
            }
            @Override
            public void method2() {
                System.out.println("匿名内部类实现了方法222-A");
            }
        };
        objA.method1();
        objA.method2();
        System.out.println("===========");

        new MyInterface() {
            @Override
            public void method1() {
                System.out.println("匿名内部类实现了方法111-B");
            }
            @Override
            public void method2() {
                System.out.println("匿名内部类实现了方法222-B");
            }
        }.method1();

        new MyInterface() {
            @Override
            public void method1() {
                System.out.println("匿名内部类实现了方法111-B");
            }
            @Override
            public void method2() {
                System.out.println("匿名内部类实现了方法222-B");
            }
        }.method2();
    }

}
