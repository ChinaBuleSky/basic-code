package Day04.demo01;

public class Demo01Final {

    public static void main(String[] args) {
        int num1 = 10;
        System.out.println(num1);
        num1 = 20;
        System.out.println(num1);

        final int num2 = 200;
        System.out.println(num2);

//        num2 = 250;
//        num2 = 200;

        final int num3;
        num3 = 30;

        Student stu1 = new Student("赵丽颖");
        System.out.println(stu1);
        System.out.println(stu1.getName());
        stu1 = new Student("霍建华");
        System.out.println(stu1);
        System.out.println(stu1.getName());
        System.out.println("===============");

        final Student stu2 = new Student("高圆圆");
//        stu2 = new Student("赵又廷");
        System.out.println(stu2.getName());
        stu2.setName("高圆圆圆圆");
        System.out.println(stu2.getName());
    }

}
