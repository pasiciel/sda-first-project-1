package pl.sdacademy;

public class Hero {

    public static int heroesCount = 0;

    private String name = "Goliath";
    private char sex = 'M';
    private int health = 100;
    private int strength = 11;

    public Hero() {
//        System.out.println("PRZED WYWOLANIEM KONSTURKTORA " + heroesCount++);
//        heroesCount++;
//        System.out.println("PO WYWOLANIU KONSTURKTORA " + heroesCount++);
    }

    public void printInfo() {
        heroesCount++;

        if (heroesCount >= 1000) {
            System.out.println("zatrzymajmy ta karuzele smiechu");
        }

        System.out.println("name: " + name + " is " + sex + " and has " + health + " health and his strength is " + strength);

    }

    public void setName(String name) {
        this.name = name;
    }
}
