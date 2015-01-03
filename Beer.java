import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Beer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Beer extends Actor
{
    /**
     * Act - do whatever the Beer wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)){
            Utama utama = (Utama)getWorld();
            Label label = utama.getLabel();
            Total total = utama.getTotal();
            //World x = getWorld();
            //((Utama)x).getTotal();
            label.clickBeer();
            //String nama = "Beer";
            //int harga = 7000; 
            ((Utama)getWorld()).total2.setCetakBeer();
            
            
    }
    
    
    }    
}
