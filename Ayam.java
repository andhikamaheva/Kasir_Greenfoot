import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ayam here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ayam extends Actor
{
    /**
     * Act - do whatever the Ayam wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    

    public void act() 
    {

        if(Greenfoot.mouseClicked(this)){
            Utama utama = (Utama)getWorld();
            Label label = utama.getLabel();
            label.clickAyam();
               Total total = utama.getTotal();
            ((Utama)getWorld()).total6.setCetakAyam();
    }

    }
    
    
    
    
}
