import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pay extends Actor
{
    /**
     * Act - do whatever the Pay wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        Kasir x = new Kasir();
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(x);
            
        }
    }    
}
