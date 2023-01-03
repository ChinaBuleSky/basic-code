package Day03.demo05;

/*
口诀：编译看左边，运行看右边
 */
public class Demo02MultiMethod {

    public static void main(String[] args) {
        Fu obj = new Zi();

        obj.method();
        obj.methodFu();

        //左边是Fu,No Zi method
//        obj.methodZi();
    }

}
