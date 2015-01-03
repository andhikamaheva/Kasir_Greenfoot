import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
import java.awt.Color;
/**
 * Write a description of class Kasir here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Kasir extends World
{

    /**
     * Constructor for objects of class Kasir.
     * 
     */
    public Teks out;
    public Teks h1;
    public Teks h2;
    public Teks h3;
    public Total total;

    public Kalkulator hitung;
    
        
    public Kasir()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
         super(800, 500, 1); 
         prepare();
    }
    
    public void prepare(){
        Cancel2 batal = new Cancel2();
        addObject(batal,751,55);
        Layar layar1 = new Layar ();
        addObject(layar1,280,92);
        Layartot layar2 = new Layartot ();
        addObject(layar2, 676, 290);
        Kalkulator k1 = new Kalkulator();
        Kalkulator k2 = new Kalkulator();
        Kalkulator k3 = new Kalkulator();
        Kalkulator k4 = new Kalkulator();
        Kalkulator k5 = new Kalkulator();
        Kalkulator k6 = new Kalkulator();
        Kalkulator k7 = new Kalkulator();
        Kalkulator k8 = new Kalkulator();
        Kalkulator k9 = new Kalkulator();
        Kalkulator k0 = new Kalkulator();
        Kalkulator kc = new Kalkulator();
        Kalkulator kb = new Kalkulator();
        addObject(k1,177,238);
        addObject(k2,272,238);
        addObject(k3,364,238);
        addObject(k0,446,238);
        addObject(k4,178,333);
        addObject(k5,270,333);
        addObject(k6,363,333);
        addObject(kc,446,333);
        addObject(k7,178,425);
        addObject(k8,269,425);
        addObject(k9,362,425);

        
        out = new Teks();
        addObject(out,280,90);
        
        hitung = new Kalkulator();
        addObject(hitung,475,426);
        
        h1 = new Teks();
        addObject(h1,673,275);
        h1.setFont(30);
        h1.setColor(Color.red);

        h2 = new Teks();
        addObject(h2,675,364);
        h2.setFont(30);
        h2.setColor(Color.red);
        
        k1.setImg("num1.png");k1.setX(1);
        k2.setImg("num2.png");k2.setX(2);
        k3.setImg("num3.png");k3.setX(3);
        k0.setImg("num0.png");k0.setX(0);
        k4.setImg("num4.png");k4.setX(4);
        k5.setImg("num5.png");k5.setX(5);
        k6.setImg("num6.png");k6.setX(6);
        k7.setImg("num7.png");k7.setX(7);
        k8.setImg("num8.png");k8.setX(8);
        k9.setImg("num9.png");k9.setX(9);
        kc.setImg("numC.png");kc.setX(10);
        hitung.setImg("Bayar.png");hitung.setX(11);

        
        Teks t1 = new Teks();
        addObject(t1,682,157);
        t1.setPrints("Harga Total");
        t1.setFont(30);
        
        Teks t2 = new Teks();
        addObject(t2,683,230);
        t2.setPrints("Uang bayar");
        t2.setFont(30);

        Teks t3 = new Teks();
        addObject(t3,679,320);
        t3.setPrints("Kembali");
        t3.setFont(30);
        
        
        
        total = new Total();
        addObject(total,678,202);
        total.print=total.getTtl()+"";
        total.setColor(Color.red);
        total.font(30);

        
    }
    public Teks getOut(){return out;}
}
