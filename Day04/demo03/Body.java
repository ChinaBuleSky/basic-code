package Day04.demo03;

public class Body {

    public class Heart {

        public void beat() {
            System.out.println("心脏跳动，蹦蹦蹦");
            System.out.println("我叫" + name);
        }

    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void methodBody(){
        System.out.println("外部类方法");
        new Heart().beat();
    }

}
