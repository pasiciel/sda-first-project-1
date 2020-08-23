package pl.sdacademy;

public class Main {

    public static void main(String[] args) {
        Hero hero1 = new Hero();
        Hero hero2 = new Hero();

        hero1.setName("Gandalf");
        hero2.setName("Frodo");

        hero1.printInfo();
//        hero2.printInfo();
    }
}
