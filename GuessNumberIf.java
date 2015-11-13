/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package at.technikum.bicss.ode.sb09.gruppe2.zahlenraten;

/**
 *
 * @author Stefan Schmidt
 */
public interface GuessNumberIf {
    public enum GuessNumberResult {
        LESS, EQUAL, BIGGER;
    }
    public int getRandomNumber(); 
    public GuessNumberResult compare(int zahl1, int zahl2) throws GuessNumberException;
}


