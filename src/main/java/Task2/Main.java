/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task2;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;


/**
 *
 * @author vladyslav
 */
public class Main {
    public static void main(String[] args) throws ParseException {
        
        Candy cand1 = new Lion("Lion",45,75,"фольга");
        Candy cand2 = new Nuts("Nuts",55,55,"фольга");
        Candy cand3 = new Milka("Milka",40,70,"фольга");
        
        Cookie cook1 = new Barney("Barney",25,50,"бумага");
        Cookie cook2 = new Bingo("Bingo",30,40,"бумага");
        Cookie cook3 = new Oreo("Oreo",35,25,"фольга");
        
        ArrayList<Sweet>giftList = new ArrayList<Sweet>();
        giftList.add(cook3);
        giftList.add(cook2);
        giftList.add(cand1);
        giftList.add(cand2);
        giftList.add(cand3);       
        
        Gift kit = new Gift(giftList);
        System.out.println("Подарок  " + giftList);
        System.out.println("Вес подарка  " + kit.totalWeigth());
        System.out.println("Содержание сахара  " + kit.findPercent(0, 100));
        System.out.println("Сортировка по весу  " + kit.findWeigth(0,50));
    }
}
