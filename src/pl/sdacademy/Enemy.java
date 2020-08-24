package pl.sdacademy;

import java.util.concurrent.ThreadLocalRandom;

public class Enemy {

    public static int enemiesCount = 0;

    private String name = "unnamed_enemy";
    private byte health = 100;
    private int strength = 1;
    private float baseDamage = 1;
    private float baseBlock = 1;
    private int coins = 10;
    private Guild guild = Guild.A;
    private float movementSpeed = 5.0f;
    private Buff buffs = null;
    private float mana = 10;

    public Enemy() {
        enemiesCount++;
    }

    public void getInfo() {
        System.out.println("name: " + name + "\nhp: " + health);
    }

    public void applyDamage(byte amount) {
        System.out.println("Dealing " + amount + " damage");
        health -= amount;

        // przypadek gdy wrog zginal
        if(health < 0) {
            health = 0;

            System.out.println("Enemy: " + name + " is dead!");
        }
    }

    public void getRandomTaunt() {
        int random = ThreadLocalRandom.current().nextInt(0, 3 + 1);

        switch (random) {
            case 0:
                System.out.println("Bring it on!");
                break;
            case 1:
                System.out.println("I'll kill you!");
                break;
            case 2:
                System.out.println("Don't mess with me!");
                break;
            case 3:
                System.out.println("I feel your blood!");
                break;
            default:
                System.out.println("[ERROR] Taunt [" + random +"] does not exist");
        }
    }
//    - metoda pozwalająca atakować bohatera
}
