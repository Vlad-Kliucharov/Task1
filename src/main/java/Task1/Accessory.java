/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author vladyslav
 */
public class Accessory {

    protected int accessoryPrice;
    protected ArrayList<Flower> flowerList;

    Accessory(ArrayList<Flower> flowerList) {
        this.flowerList = flowerList;
    }

    public int totalFresh() {
        int totalFresh = 0;
        for (Flower flower : flowerList) {
            totalFresh += flower.getFresh();
        }
        return totalFresh;
    }

    public int totalPrice() {
        int totalPrice = 0;
        for (Flower flower : flowerList) {
            totalPrice += flower.getPrice();
        }
        totalPrice += this.getAccessoryPrice();
        return totalPrice;
    }

    public ArrayList<Flower> findFresh(int minFresh, int maxFresh) {
        ArrayList<Flower> findFresh = new ArrayList<Flower>();
        for (Flower flower : flowerList) {
            if (flower.getFresh() >= minFresh && flower.getFresh() <= maxFresh) {
                findFresh.add(flower);
            }
        }
        return findFresh;
    }

    public ArrayList<Flower> findFlowers(int minStemLength, int maxStemLength) {
        ArrayList<Flower> foundFlowers = new ArrayList<Flower>();
        for (Flower flower : flowerList) {
            if (flower.getStemLength() >= minStemLength && flower.getStemLength() <= maxStemLength) {
                foundFlowers.add(flower);
            }
        }
        Collections.sort(foundFlowers, new Comparator<Flower>(){
            @Override
            public int compare(Flower o1, Flower o2) {
                return o1.getStemLength()-o2.getStemLength();
            }
            
        });
        return foundFlowers;
    }

    public void sortByDate() {
        Collections.sort(flowerList);
    }

    int getAccessoryPrice() {
        return accessoryPrice;
    }

    public void printDate() {
        for (Flower flower : flowerList) {
            System.out.println(flower.getDate());
        }
    }
}
