/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package at.technikum.bicss.ode.sb09.gruppe2.zahlenraten;

import static java.lang.Math.random;
/**
 *
 * @author Stefan Schmidt
 */
public class BackEnd implements GuessNumberIf {
    
    public BackEnd() {
        
    }
    
    @Override
    public int getRandomNumber() {
        int zahl;
        double rand = random();
        
        zahl = (int) (rand * 100) % 100;
        
        return zahl;
    }
    
    @Override
    public GuessNumberResult compare(int zahl1, int zahl2) throws GuessNumberException {
        
        if (zahl1 > zahl2) {
            return GuessNumberResult.BIGGER;
        } else if (zahl1 < zahl2) {
            return GuessNumberResult.LESS;
        } else if (zahl1 == zahl2) {
            return GuessNumberResult.EQUAL;        
        } else {
            throw new GuessNumberException("Something is wrong.");
        }
        
    }
}
