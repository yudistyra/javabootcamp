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
public class Warrior extends Human {

    public Warrior(String name) {
        super(name);
    }
    
    @Override
    public void attack(Character opponent) {
        System.out.println("Attacking " + opponent.getName() + " with my sword!");
        opponent.decreaseHealth(getAttackPower());
    }

    @Override
    public void defend() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void jump() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int heal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
