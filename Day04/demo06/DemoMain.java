package Day04.demo06;

public class DemoMain {

    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.setName("盖伦");
        hero.setAge(20);

        Weapon weapon = new Weapon("AK-47");
        hero.setWeapon(weapon);

        hero.attack();
    }

}
