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
public class FireArcher extends Archer {
    int firePower = 1;

    public FireArcher(String name) {
        super(name);
    }
    
    @Override
    public void attack(Character opponent) {
        System.out.println("Attacking " + opponent.getName() + " with fire arrows!");
        opponent.decreaseHealth(getAttackPower() + firePower);
    }
}
