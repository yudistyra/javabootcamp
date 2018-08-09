/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conquergame;

import java.util.Random;

/**
 *
 * @author Yudistyra_OP355
 */
public interface Character {
    Random randomGenerator = new Random();

    String getName();
    double getHealth();
    long getExperience();
    int getAttackPower();
    void setAttackPower(int attackPower);

    void defend();
    void jump();
    int heal();
    void attack(Character opponent);
    double decreaseHealth(int opponentAttackPower);
    long gainExperience(long experience);
}
