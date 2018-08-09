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
public class Archer extends Human implements Character {
    private int numArrows = 0;
    
    public Archer(String name) {
        super(name);
        findArrows();
    }
    
    public Archer(String name, int startingArrows) {
        super(name);
        numArrows = startingArrows;
    }
    
    private void findArrows() {
        int numArrowsFound = randomGenerator.nextInt(10) + 1;
        System.out.println(getName() + ": Found " + numArrowsFound + " arrows ...");
        numArrows += numArrowsFound;
    }

    @Override
    public void attack(Character opponent) {
        System.out.println(getName() + ": Attacking " + opponent.getName() + " with my arrows");
        opponent.decreaseHealth(getAttackPower());
    }

    @Override
    public void defend() {
        
    }

    @Override
    public void jump() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int heal() {
        return 0;
    }
}
