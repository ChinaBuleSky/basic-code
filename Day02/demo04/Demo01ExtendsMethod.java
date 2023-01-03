package Day02.demo04;

/*
在父子类的继承关系当中，创建子类对象，访问成员方法的规则
    创建的对象是谁，就优先用谁，如果没有就向上找

注意事项：
无论是成员方法还是成员变量，如果没有都是向上找父类，绝对不会向下找子类

 */
public class Demo01ExtendsMethod {

    public static void main(String[] args) {
        Zi zi = new Zi();

        zi.methodFU();
        zi.methodZi();

        // 优先子类
        zi.method();
    }

}
