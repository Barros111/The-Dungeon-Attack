package pt.ipp.estg.pp.rpg;

public class Mage extends Player{

    private static final int MAX_SPELLS = 2;
    private int spellBookLevel; //1-5

    public Mage(String name){
        super(name);
        this.spellBookLevel = 1;
        setCombatType(CombatType.MidRange);
    }

    public int getSpellBookLevel(){
        return spellBookLevel;
    }

    public void setSpellBookLevel(int spellBookLevel){
        this.spellBookLevel = spellBookLevel;
    }


    public void combatShift(Character defendingCharacter, Spell spell){
        spell.setSpellDamage();
        float initialDamage = spell.getSpellDamage();
        System.out.println("Used " + spell.getSpellName());
        int finalDamage;
        if(getCharacterType() == CharacterType.Player){
            initialDamage *= damageMultiplier(defendingCharacter);
            finalDamage= Math.round(initialDamage);
            defendingCharacter.receiveDamage(finalDamage);

            if(!defendingCharacter.isAlive()){
                if(defendingCharacter instanceof Mobs){
                    Mobs mob = (Mobs) defendingCharacter;
                    LevelManager.upgradeLevel(mob.getValue(), this);
                    return;
                }
                System.out.println("[DEBUG] Failed to cast character (combat).");
            }
            return;
        }
        finalDamage = Math.round(initialDamage);
        defendingCharacter.receiveDamage(finalDamage);
    }
}
