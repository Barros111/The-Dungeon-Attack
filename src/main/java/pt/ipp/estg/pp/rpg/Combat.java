package pt.ipp.estg.pp.rpg;

public class Combat {

    public void combatShift(Character atackingCharacter, Character defendingCharacter){
        float initialDamage = atackingCharacter.getAtackDamage();
        int finalDamage;
        if(atackingCharacter.getCharacterType() == CharacterType.Player){
            initialDamage *= damageMultiplier(atackingCharacter, defendingCharacter);
            finalDamage= Math.round(initialDamage);
            defendingCharacter.receiveDamage(finalDamage);

            if(!defendingCharacter.isAlive()){
                if(defendingCharacter instanceof Mobs){
                    Mobs mob = (Mobs) defendingCharacter;
                    LevelManager.upgradeLevel(mob.getValue(), atackingCharacter);
                    return;
                }
                System.out.println("[DEBUG] Failed to cast character.");
            }
            return;
        }
        finalDamage = Math.round(initialDamage);
        defendingCharacter.receiveDamage(finalDamage);
    }

    public float damageMultiplier(Character atackingCharacter, Character defendingCharacter){
        if(atackingCharacter.getCombatType() == defendingCharacter.getCombatType()){
            return 1.5f;
        }

        return 0.5f;
    }
}
