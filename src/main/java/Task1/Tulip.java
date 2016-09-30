/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task1;

import java.text.ParseException;

/**
 *
 * @author vladyslav
 */
public abstract class Tulip extends Flower {
    
    public Tulip(String name,int price, int fresh, int stemLength, String Date) throws ParseException {
        super(name,price,fresh,stemLength,Date);
    }   
}
