/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task1;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author vladyslav
 */
public class Flower implements Comparable<Flower> {

    private String name;
    private int price;
    private int fresh;
    private int stemLength;
    private Date date;
    private DateFormat format = new SimpleDateFormat("dd.MM.yyyy");


    protected Flower(String name,int price, int fresh, int stemLength, String Date) throws ParseException {
        this.name = name;
        this.price = price;
        this.fresh = fresh;
        this.stemLength = stemLength;
        this.date = format.parse(Date);
    }
    
    public String getName() {
        return name;
    }
    
    public int getPrice() {
        return price;
    }
    public int getFresh() {
        return fresh;
    }

    public int getStemLength() {
        return stemLength;
    }
    public DateFormat getFormat() {
        return format;
    }

    public Date getDate() {
        return date;
    }
    
    
    @Override
    public int compareTo(Flower flower){
        return flower.date.compareTo(date);
    }
    
    @Override
    public String toString(){
        return (char)13 + "{Наименование = " + this.name + ", Цена = " + this.price 
                + ", Свежесть цветка = " + this.fresh + ", Длинна стебля = " 
                + this.stemLength + ", Дата " + this.date + "}";
        
    }
}