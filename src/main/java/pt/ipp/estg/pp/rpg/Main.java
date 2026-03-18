package pt.ipp.estg.pp.rpg;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Mage mage = new Mage("Mage");
        mage.setHealthPoints(100);
        mage.setAtackDamage(20);
        mage.setDefense(5);
        Spell spell = new Spell(Spell.Spells.Fireball);

        MeleeUser player = new MeleeUser("Hero");
        player.setHealthPoints(100);
        player.setAtackDamage(20);
        player.setDefense(5);

        Mobs goblin = new Mobs("Goblin", 10);
        goblin.setHealthPoints(30);
        goblin.setAtackDamage(10);
        goblin.setDefense(2);
        goblin.setCombatType(CombatType.CloseRange);

        mage.combatShift(goblin, spell);
        goblin.combatShift(mage);

        System.out.println("Player LVL: " + player.getLevel());
        System.out.println("Player XP: " + player.getXp());
        System.out.println("Goblin Alive? " + goblin.isAlive());
        System.out.println("Goblin HP: " + goblin.getHealthPoints());
        System.out.println("Player HP: " + player.getHealthPoints());
    }
}
