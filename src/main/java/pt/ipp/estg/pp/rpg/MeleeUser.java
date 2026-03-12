package pt.ipp.estg.pp.rpg;

public class MeleeUser extends Player{

    private int swordLevel; //1-5

    public MeleeUser(String name){
        super(name);
        this.swordLevel = 1;
        setCombatType(CombatType.CloseRange);
    }

    public int getSwordLevel(){
        return swordLevel;
    }

    public void setSwordLevel(int swordLevel){
        this.swordLevel = swordLevel;
    }
}
