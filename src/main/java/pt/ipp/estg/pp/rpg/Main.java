package pt.ipp.estg.pp.rpg;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        MeleeUser player = new MeleeUser("Hero");
        player.setHealthPoints(100);
        player.setAtackDamage(20);
        player.setDefense(5);

        Mobs goblin = new Mobs("Goblin", Mobs.mobType.Goblin, 10);
        goblin.setHealthPoints(30);
        goblin.setAtackDamage(10);
        goblin.setDefense(2);
        goblin.setCombatType(CombatType.CloseRange);

        Combat combat = new Combat();
        combat.combatShift(player, goblin);
        combat.combatShift(goblin, player);

        System.out.println("Player LVL: " + player.getLevel());
        System.out.println("Player XP: " + player.getXp());
        System.out.println("Goblin Alive? " + goblin.isAlive());
        System.out.println("Goblin HP: " + goblin.getHealthPoints());
        System.out.println("Player HP: " + player.getHealthPoints());
    }
}
