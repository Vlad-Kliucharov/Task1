/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author vladyslav
 */
public class Gift {

    protected ArrayList<Sweet> giftList;

    Gift(ArrayList<Sweet> giftList) {
        this.giftList = giftList;

    }

    public int totalWeigth() {
        int totalWeigth = 0;
        for (Sweet sweet : giftList) {
            totalWeigth += sweet.getWeigth();
        }
        return totalWeigth;
    }

    public ArrayList<Sweet> findPercent(int minPercent, int maxPercent) {
        ArrayList<Sweet> findPercent = new ArrayList<Sweet>();
        for (Sweet sweet : giftList) {
            if (sweet.getSugarPercent() >= minPercent && sweet.getSugarPercent() <= maxPercent) {
                findPercent.add(sweet);
            }
            Collections.sort(findPercent, new Comparator<Sweet>(){
            @Override
            public int compare(Sweet o1, Sweet o2) {
                return o1.getSugarPercent()-o2.getSugarPercent();
            }
        });
        }
        return findPercent;
    }

    public ArrayList<Sweet> findWeigth(int minWeigth, int maxWeigth) {
        ArrayList<Sweet> findWeigth = new ArrayList<Sweet>();
        for (Sweet sweet : giftList) {
            if (sweet.getWeigth() == minWeigth && sweet.getWeigth() == maxWeigth);
            findWeigth.add(sweet);
        }
        Collections.sort(findWeigth, new Comparator<Sweet>(){
            @Override
            public int compare(Sweet o1, Sweet o2) {
                return o1.getWeigth()-o2.getWeigth();
            }
        });
        return findWeigth;
    }
    
}
