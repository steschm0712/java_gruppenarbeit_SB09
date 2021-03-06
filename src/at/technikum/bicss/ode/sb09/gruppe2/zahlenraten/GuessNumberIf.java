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
        BIGGER, EQUAL, LESS;
    }
    public int getRandomNumber(int size); 
    /* zahl1 ist die Zufallszahl, zahl2 der Userinput */
    public GuessNumberResult compare(int random, int number) throws GuessNumberException;
}


