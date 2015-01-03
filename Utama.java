import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Utama here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Utama extends World
{

    /**
     * Constructor for objects of class Utama.
     * 
     */
    Bakso bakso = new Bakso();
    Beer beer = new Beer();
    Pizza pizza = new Pizza();
    Ice ice = new Ice();
    Ayam ayam = new Ayam();
    Cocacola cocacola = new Cocacola();
    Label label1 = new Label();
    Cancel cancel = new Cancel();
    Pay pay = new Pay();
    List list1 = new List();
    Total total1 = new Total();
    Total total2 = new Total();
    Total total3 = new Total();
    Total total4 = new Total();
    Total total5 = new Total();
    Total total6 = new Total();
    Total total7 = new Total();
    public Utama()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 500, 1); 
        prepare();
    }
    
    public Label getLabel(){
        return label1;
    }
    
    
    public Total getTotal(){
        return total1;
    }
    
    public void prepare(){
        addObject(bakso, 111,273);
        addObject(beer, 111,414);
        addObject(pizza, 428,273);
        addObject(ice, 267,415);
        addObject(ayam, 271,273);
        addObject(cocacola, 431,416);
        addObject(label1, 272, 104);
        addObject(cancel, 606, 437);
        addObject(pay,730, 419);
        addObject(list1, 667,192);
        addObject(total1,667,333);
        addObject(total2,667,71);        
        addObject(total3,667,114);
        addObject(total4,667,157);
        addObject(total5,667,200);
        addObject(total6,667,238);
        addObject(total7,667,290);
    }
}
