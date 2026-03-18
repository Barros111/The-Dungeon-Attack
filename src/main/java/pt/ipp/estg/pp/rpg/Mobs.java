package pt.ipp.estg.pp.rpg;

public class Mobs extends Character{

    private int value; //1-5 1 is low value, 5 is high value.

    public Mobs(String name, int value){
        super(name);
        this.value = value;
    }

    public int getValue(){
        return value;
    }
}
