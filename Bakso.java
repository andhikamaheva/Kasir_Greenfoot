import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bakso here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bakso extends Actor
{
    /**
     * Act - do whatever the Bakso wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
         if(Greenfoot.mouseClicked(this)){
            Utama utama = (Utama)getWorld();
            Label label = utama.getLabel();
            label.clickBakso();
               Total total = utama.getTotal();
            ((Utama)getWorld()).total7.setCetakBakso();
    }
    }    
}
