package pt.ipp.estg.pp.rpg;

import java.util.Random;

public class Spell {
    public enum Spells{Fireball, Zap};

    private Spells spellName;
    private int spellDamage;
    private Random random = new Random();

    public Spell(Spells spellName){
        this.spellName = spellName;
    }

    public Spells getSpellName(){
        return spellName;
    }

    public void setSpellDamage(){
        switch (spellName){
            case Fireball -> this.spellDamage = random.nextInt((25-8) + 1)+8;
            case Zap -> this.spellDamage = random.nextInt((12-5) + 1)+5;
        }
    }
}
