import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cocacola here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cocacola extends Actor
{
    /**
     * Act - do whatever the Cocacola wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
         if(Greenfoot.mouseClicked(this)){
            Utama utama = (Utama)getWorld();
            Label label = utama.getLabel();
            label.clickCocacola();
             Total total = utama.getTotal();
            ((Utama)getWorld()).total4.setCetakCola();
    }
    }    
}
