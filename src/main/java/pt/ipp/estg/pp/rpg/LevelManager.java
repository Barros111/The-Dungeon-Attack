package pt.ipp.estg.pp.rpg;

public class LevelManager {
    public static void upgradeLevel(int value, Character character){
        int multiplier = 10;

        if(character instanceof Player){
            Player player = (Player) character;
            int currentXp = player.getXp();
            int currentLevel = player.getLevel();
            int finalXp;
            int finalLevel;
            int xpRequired = player.getXpRequired();

            finalXp = currentXp + (multiplier*value);

            if(finalXp >= xpRequired){
                player.setXpRequired(xpRequired+100);
                player.setLevel(currentLevel+1);
                System.out.println("Congratulations! You just leveled up!");
                System.out.println("Current level: "+ player.getLevel());
                return;
            }
        }
        System.out.println("[DEBUG] Failed to cast character.");
    }
}
