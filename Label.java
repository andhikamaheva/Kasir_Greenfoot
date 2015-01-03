import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

/**
 * Write a description of class Label here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Label extends Actor
{
    /**
     * Act - do whatever the Label wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    int ayam=0;
    int beer=0;
    int pizza=0;
    int ice=0;
    int bakso=0;
    int cocacola=0;
    int reset=0;
    public void act() 
    {
        if(ayam==1){
        setImage("ayam_goreng.png");
        ayam=0;
        }
         if(beer==1){
        setImage("hrg_beer.png");
        beer=0;
        }
         if(pizza==1){
        setImage("hrg_pizza.png");
        pizza=0;
        }
         if(ice==1){
        setImage("hrg_ice.png");
        ice=0;
        }
         if(bakso==1){
        setImage("hrg_bakso.png");
        bakso=0;
        }
         if(cocacola==1){
        setImage("hrg_cocacola.png");
        cocacola=0;
        }
         if(reset==1){
        setImage("Label.png");
        reset=0;
        }
        
    }    
    
    public void clickAyam(){
        ayam=1;
    }
    public void clickBeer(){
        beer=1;
    }
    public void clickPizza(){
        pizza=1;
    }
    public void clickIce(){
        ice=1;
    }
    public void clickBakso(){
        bakso=1;
    }
    public void clickCocacola(){
        cocacola=1;
    }
    public void clickReset(){
        reset=1;
    }
}
