package pl.sdacademy;

import static pl.sdacademy.ConsoleUtils.*;

public class Main {

    public static void main(String[] args) {

        /**
         * Singleton class because only one hero builder is needed
         */
        HeroBuilder hb = HeroBuilder.getInstance();
//tutaj wywolywany jest testowy bohater, nie trzeba wpisywac statow za kazdym odpaleniem
        Hero hero = hb.buildHeroForTesting();

        hero.printInfo();

        debugMode = true;
//        Hero fakeHero = new Hero("Soft P0rn", Sex.MALE,100, 10, 10, 10, 10, 10);
//        printDebug(":(");
//        fakeHero.printInfo();
//        fakeHero.applyDamage((byte) 10);
//        fakeHero.applyDamage((byte) 10);
//        fakeHero.applyDamage((byte) 10);
//        fakeHero.applyDamage((byte) 10);
//        fakeHero.applyDamage((byte) 10);
//        printDebug("zaraz zginie");

        System.exit(0);
        ConsoleUtils.debugMode = true;

        System.out.println("Just a " + C_PURPLE_UNDERLINED + "RED" + C_RESET + " test...");

        System.out.println(String.format("%20sD %5s C", 93, "X"));
        System.out.printf("My name is %s%n", "joe");

      // HeroBuilder hb = new HeroBuilder();
       // Hero hero = hb.buildHeroForTesting();//hb.buildHero();
       // hero.printInfo();

        String names[] = {"A", "B", "C"};

        Enemy enemy = new Enemy(names[0]);
        enemy.name = "wrog";

        System.out.println(hero.getThing().getName());
        Enemy e = hero.getThing();
        e.setName("FAKEY NEMEMEY!");
        System.out.println(hero.getThing().getName());
        //enemy.getInfo();
        //enemy.applyDamage((byte)5);
        enemy.getRandomTaunt();

        String attackType = "";
        do {
            if (enemy.isDead()) {
                // spawning new enemy
                enemy = new Enemy(names[0]);
                enemy.getRandomTaunt();
            }
            attackType = ConsoleUtils.promptForString("ATTACK WITH [S]word [A]xe [F]ire [I]ce - [E]xit TO END >");
            hero.attack(attackType.charAt(0), enemy);

            System.out.println("Enemy health: " + enemy.getHealth());
            System.out.println("Already killed " + c_purple(""+Enemy.enemiesCount) + " enemies");
        } while (!attackType.isEmpty());
    }
}
