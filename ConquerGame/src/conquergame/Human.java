/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conquergame;

/**
 *
 * @author Yudistyra_OP355
 */
public abstract class Human implements Character {
    private String name;
    private double health = 100.0;
    private long experience = 0;
    private int attackPower = 1;
    private Pet pet;

    public String getName() {
        return name;
    }

    public double getHealth() {
        return health;
    }
    
    public Human(String name) {
        this.name = name;
        gainExperience(1);
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public long getExperience() {
        return experience;
    }
    
    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
        System.out.printf("%s: I have a new pet. Hi %s!\n",
                name, pet.getName());
    }
    
    public abstract void attack(Character opponent);
    public abstract void defend();
    public abstract void jump();
    public abstract int heal();
    
    public double decreaseHealth(int oppenentAttackPower) {
        health -= oppenentAttackPower;
        System.out.println(name + ": I've been hit. My health now = " + health);
        return health;
    }
    
     public long gainExperience(long experience) {
        this.experience += experience;
        return experience;
    }
     
    public double heal(double additionalHealth) {
        health += additionalHealth;
        return health;
    }
}
