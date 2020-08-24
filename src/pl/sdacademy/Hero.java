package pl.sdacademy;

public class Hero {

    private String name = "unnamed_hero";
    private Sex sex = Sex.MALE;
    private int health = 100;
    private int strength = 10;
    private float baseDamage = 10;
    private float baseBlock = 10;
    private int coins = 0;
    private float movementSpeed = 10f;
    private Buff buffs = null;

    public void printInfo() {
        System.out.println("===== HERO =====\n" +
                "name: " + name +
                "\nsex: " + sex.name() +
                "\nhealth: " + health +
                "\nstrength: " + strength +
                "\nbaseDamage: " + baseDamage +
                "\nbaseBlock: " + baseBlock +
                "\ncoins: " + coins +
                "\nmovementSpeed: " + movementSpeed +
                "\nbuffs: " + buffs +
                "\n"
        );
    }

    public void setName(String name) {
        this.name = name;
    }

}
