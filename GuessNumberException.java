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
public class GuessNumberException extends Exception {
    public GuessNumberException() {
        super();
    }
    public GuessNumberException(String Fehler) {
        super(Fehler);
    }
}
