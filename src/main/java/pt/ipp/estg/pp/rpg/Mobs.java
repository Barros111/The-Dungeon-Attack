package pt.ipp.estg.pp.rpg;

public class Mobs extends Character{

    public enum mobType{Goblin, Ghost};

    private mobType mobType;
    private int value; //1-5 1 is low value, 5 is high value.

    public Mobs(String name, mobType mobType, int value){
        super(name);
        this.mobType = mobType;
        this.value = value;
    }

    public mobType getMobType(){
        return mobType;
    }

    public int getValue(){
        return value;
    }
}
