package Day04.demo07;

public class DemoGame {

    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.setName("艾希");

//        Skill skill = new Skill() {
//            @Override
//            public void use() {
//                System.out.println("Pia,pia,pia~");
//            }
//        };

        hero.setSkill(new Skill() {
            @Override
            public void use() {
                System.out.println("Biu,pia,Biu,pia~");
            }
        });

        hero.attack();
    }

}
