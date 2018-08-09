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
public class Dog extends Pet implements Character {

    public Dog(String name, Human owner) {
        super(name, owner);
        bark();
    }

    public void bark() {
        System.out.println(getName() + ": Wolf Wolf!");
    }
    
    @Override
    public void attack(Character opponent) {
        System.out.println(getName() + ": Bitting " + opponent.getName());
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
        return 0;
    }

    @Override
    protected void cry() {
        bark();
    }
    
}
