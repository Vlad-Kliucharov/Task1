/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task1;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author vladyslav
 */
public class Main {

    public static void main(String[] args) throws ParseException {

        Rose rose1 = new FelicitePerpetue("FelicitePerpetue", 45, 5, 100, "25.08.2016");
        Rose rose2 = new GoldenShowers("GoldenShowers", 20, 1, 75, "20.08.2016");
        Rose rose3 = new NewDawn("NewDawn", 30, 2, 100, "22.08.2016");
        Rose rose4 = new RamblingRector("RamblingRector", 40, 4, 50, "24.08.2016");

        Tulip tulip1 = new Abba("Abba", 20, 5, 75, "25.08.2016");
        Tulip tulip2 = new Crossfire("Crossfire", 20, 4, 75, "24.08.2016");
        Tulip tulip3 = new Dior("Dior", 15, 3, 50, "23.08.2016");
        Tulip tulip4 = new Elisabeth("Elisabeth", 5, 1, 50, "20.08.2016");

        ArrayList<Flower> flowerList = new ArrayList<Flower>();
        flowerList.add(rose1);
        flowerList.add(rose2);
        flowerList.add(rose3);
        flowerList.add(tulip1);
        flowerList.add(tulip2);
        flowerList.add(tulip3);

        
        Accessory bouquet = new Paper(flowerList);
        bouquet.sortByDate();
        System.out.println("Букет " + bouquet.flowerList);
        System.out.println("Свежесть букета " + bouquet.findFresh(1, 5));
        System.out.println("Стоимость букета " + bouquet.totalPrice());
        System.out.println("Цена акссесуара " + bouquet.getAccessoryPrice());
        System.out.println("Сотриторовка по дленне стебля " + bouquet.findFlowers(0, 100));
        
    }
}
