package Day04.demo01;

public class Person {

    private final String name /* = "鹿晗"*/;

    public Person(){
        name = "关晓彤";
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }
}
