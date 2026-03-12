package pt.ipp.estg.pp.rpg;

import java.rmi.server.UID;

public class Character {

    private String name;
    private int healthPoints;
    private int atackDamage;
    private int defense;
    private boolean state;
    private CharacterType characterType;
    private CombatType combatType;
    private UID id;

    public Character(String name){
        this.name = name;
        this.id = new UID();
        this.state = true;
    }

    public boolean isAlive(){
        if (state) return true;
        return false;
    }

    public CombatType getCombatType(){
        return combatType;
    }

    public CharacterType getCharacterType(){
        return characterType;
    }

    public int getAtackDamage(){
        return atackDamage;
    }

    public int getDefense(){
        return defense;
    }

    public String getName(){
        return name;
    }

    public int getHealthPoints(){
        return healthPoints;
    }

    public UID getId(){
        return id;
    }

    public void setHealthPoints(int healthPoints){
        this.healthPoints = healthPoints;
    }

    public void setAtackDamage(int atackDamage){
        this.atackDamage = atackDamage;
    }

    public void setDefense(int defense){
        this.defense = defense;
    }

    public void setCharacterType(CharacterType characterType){
        this.characterType = characterType;
    }

    public void setCombatType(CombatType combatType){
        this.combatType = combatType;
    }

    public void changeState(){
        state = false;
    }

    public void receiveDamage(int damage){
        int realDamage = Math.max(0, damage-defense);
        healthPoints -= damage;

        if (healthPoints <= 0){
            System.out.println(this.name + "has died!");
            changeState();
        }
    }
}
