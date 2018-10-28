/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum;

/**
 *
 * @author Farrel
 */
public class testbola {
    public static void main(String[] args) {   
    Bola infobola = new Bola();
    
    infobola.jarijari = 7;
    infobola.diameter = infobola.jarijari *2;
    infobola.luaspermukaan = 4 * (Math.PI) * infobola.jarijari * infobola.jarijari;
    infobola.volume = (4/3) * (Math.PI) * infobola.jarijari * infobola.jarijari* infobola.jarijari;

    infobola.test();
}
}
