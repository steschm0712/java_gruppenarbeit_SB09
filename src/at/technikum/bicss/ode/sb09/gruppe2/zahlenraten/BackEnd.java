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
    public int getRandomNumber(int size) {
        int zahl;
        double rand = random();
        
        zahl = (int) ((rand * size) % size)+1;
        
        return zahl;
    }
    
    @Override
    public GuessNumberResult compare(int random, int number) throws GuessNumberException {
        
        if (random > number) {
            return GuessNumberResult.LESS;
        } else if (random < number) {
            return GuessNumberResult.BIGGER;
        } else if (random == number) {
            return GuessNumberResult.EQUAL;        
        } else {
            throw new GuessNumberException("Something is wrong.");
        }
        
    }
}
