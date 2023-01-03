package Day02.demo02;

/*
在父子类的继承关系当中，如果成员变量重名，则创建子类对象时，有两种方式:

直接通过子类对象访问成员变量
    等号左边是谁就优先用谁，没有则向上找
间接通过成员方法访问成员变量:
    该方法属于谁，既优先用谁，没有则向上找
 */
public class Demo01ExtendsField {

    public static void main(String[] args) {
        Fu fu = new Fu();
        System.out.println(fu.numFu);
        System.out.println("=================");

        Zi zi = new Zi();

        System.out.println(zi.numFu);
        System.out.println(zi.numZi);
        System.out.println("=================");

        // 等号左边是谁就优先用谁，没有则向上找
        System.out.println(zi.num);
//        System.out.println(zi.abc);//报错
        System.out.println("=================");

        // 子类方法，优先子类
        zi.methodZi(); // 200
        // 这个方法是在父中定义的
        zi.methodFu(); // 100
    }

}
