/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task2;

import java.util.Comparator;

/**
 *
 * @author vladyslav
 */
public class Sweet implements Comparator<Sweet> {

    private String name;
    private int weigth;
    private int sugarPercent;
    private String pack;

    public Sweet(String name, int weigth, int sugarPercent, String pack) {

        this.name = name;
        this.weigth = weigth;
        this.sugarPercent = sugarPercent;
        this.pack = pack;
    }

    public String getName() {
        return name;
    }

    public int getWeigth() {
        return weigth;
    }

    public int getSugarPercent() {
        return sugarPercent;
    }

    public String getPack() {
        return pack;
    }

    @Override
    public int compare(Sweet o1, Sweet o2) {
        return o1.hashCode() - o2.hashCode();
    }

    @Override
    public String toString() {
        return (char) 13 + " {Наименование сладостей = " + this.name + ",Вес = "
                + this.weigth + "г " + ",Содержание сахара = "
                + this.sugarPercent + "% " + ", Упаковка = " + this.pack + "}";
    }

}
