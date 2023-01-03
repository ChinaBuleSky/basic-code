package Day03.demo05;

public class Demo01MultiField {

    public static void main(String[] args) {
        Fu obj = new Zi();
        System.out.println(obj.num);
//        System.out.println(obj.age);
        System.out.println("=================");

        //子类没有覆盖重写就是父
        //子类覆盖重写就是子
        obj.showNum();
    }

}
