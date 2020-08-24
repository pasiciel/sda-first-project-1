package pl.sdacademy;

public class Main {

    public static void main(String[] args) {

        Hero hero1 = new Hero();
        hero1.setName("Gandalf");
        hero1.printInfo();

        Enemy enemy = new Enemy();
        enemy.getInfo();
        enemy.applyDamage((byte)5);
        enemy.getRandomTaunt();
        enemy.getInfo();
    }
}
