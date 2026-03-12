package pt.ipp.estg.pp.rpg;

public class Player extends Character{

    private int level;
    private int xp;
    private int xpRequired;

    public Player(String name){
        super(name);
        this.level = 0;
        this.xp = 1;
        this.xpRequired = 100;
        setCharacterType(CharacterType.Player);
    }

    public void setLevel(int level){
        this.level = level;
    }

    public int getLevel(){
        return level;
    }

    public void setXp(int xp){
        this.xp = xp;
    }

    public int getXp(){
        return xp;
    }

    public void setXpRequired(int xpRequired){
        this.xpRequired = xpRequired;
    }

    public int getXpRequired(){
        return xpRequired;
    }
}
