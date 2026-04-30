public class FightMain {
    public static void main (String[] args) {
        Warrior warrior = new Warrior("Nakamura");

        Damage wDamage = warrior;
        Attack wAttack = warrior;

        Attack gAttack = new Ghost("Gengar");

        wDamage.takeDamage(20);
        wAttack.attack();
        gAttack.attack();
    }
}
