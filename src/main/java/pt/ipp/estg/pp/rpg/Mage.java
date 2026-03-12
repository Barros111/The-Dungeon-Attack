package pt.ipp.estg.pp.rpg;

public class Mage extends Player{

    private static final int MAX_SPELLS = 2;
    private int spellBookLevel; //1-5
    private Spell[] spells = new Spell[MAX_SPELLS];
    private int[] spellUsage = new int[MAX_SPELLS];

    public Mage(String name){
        super(name);
        this.spellBookLevel = 1;
        setCombatType(CombatType.MidRange);

        spells[0] = new Spell(Spell.Spells.Fireball);
        spellUsage[0] = 4;
        spells[1] = new Spell(Spell.Spells.Zap);
        spellUsage[1] = 8;
    }

    public int getSpellBookLevel(){
        return spellBookLevel;
    }

    public void setSpellBookLevel(int spellBookLevel){
        this.spellBookLevel = spellBookLevel;
    }
}
