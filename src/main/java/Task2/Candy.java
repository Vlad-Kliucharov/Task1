/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task2;

import java.text.ParseException;

/**
 *
 * @author vladyslav
 */
public abstract class Candy extends Sweet{
    
    public Candy(String name, int weigth, int sugarPercent, String pack) throws ParseException {
        super(name, weigth, sugarPercent, pack);
    }
    
}
