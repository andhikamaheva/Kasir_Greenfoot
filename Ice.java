import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ice here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ice extends Actor
{
    /**
     * Act - do whatever the Ice wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
         if(Greenfoot.mouseClicked(this)){
            Utama utama = (Utama)getWorld();
            Label label = utama.getLabel();
            label.clickIce();
            Total total = utama.getTotal();
            ((Utama)getWorld()).total3.setCetakIce();
    }
    }    
}
