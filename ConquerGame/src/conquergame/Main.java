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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Human human = new Human("Lisa");
        Human archer = new Archer("Samuel");
        FireArcher fireArcher = new FireArcher("Emmanuel");
        Warrior warrior = new Warrior("Carolyn");

        human.attack(fireArcher);
        //archer.attack(warrior);
        //warrior.attack(archer);
        fireArcher.attack(human);*/
        
        Archer niceArcher = new Archer("Tom");
        Human modernArcher = new Archer("Stacy");

        Dog modernDog = new Dog("Hunter", modernArcher);
        Pet petDog = new Dog("Buddy", niceArcher);

        System.out.println("\nStart Game\n");
        modernArcher.attack(niceArcher);
        niceArcher.getPet().attack(modernArcher);
        modernArcher.attack(niceArcher.getPet());
        modernDog.attack(petDog.getOwner());
        petDog.attack(modernArcher.getPet());
    }
    
}
