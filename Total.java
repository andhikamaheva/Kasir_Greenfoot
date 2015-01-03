import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
import java.awt.Color;
/**
 * Write a description of class Total here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Total extends Actor
{
    /**
     * Act - do whatever the Total wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    String print="-";
    String nama;
    Color warna = Color.black;

    int harga=0;
    public static int tot_akhir=0;
    int font =58;
    int kuantitas=0;
    int kuantitas1=1;
    int tot_a=0;
    int ulang=0;
    int triger=0;
    GreenfootImage sub=getImage();
    private boolean x=false;
    public void act() 
    {

        setImage(new GreenfootImage(print,font,warna,null));

        // setImage(new GreenfootImage(harga,font,warna,null));
        //System.out.println(kuantitas+"\n"+print);
    }

    public void setColor(Color x){warna=x;}

    public void font(int i){font=i;}

    /*public void setCetak(String barang, int harga1){
    World x = getWorld();
    print=barang+"\n\t Rp." + harga1;
    harga=harga1;
    nama=barang;
    }*/

    public void setCetakBeer(){
        ((Utama)getWorld()).total2.font = 20;
        kuantitas++;
        font = ((Utama)getWorld()).total2.font;
        print ="Beer ("+kuantitas+")\n\tRp. 7000";
        ((Utama)getWorld()).total1.addTotal(7000);
    }

    public void setCetakIce(){
        ((Utama)getWorld()).total3.font = 20;
        kuantitas++;
        font = ((Utama)getWorld()).total3.font;
        print ="Ice ("+kuantitas+")\n\tRp. 8000";
        ((Utama)getWorld()).total1.addTotal(8000);
    }
    
    public void setCetakCola(){
        ((Utama)getWorld()).total4.font = 20;
        kuantitas++;
        font = ((Utama)getWorld()).total4.font;
        print ="Coca Cola ("+kuantitas+")\n\tRp. 5000";
        ((Utama)getWorld()).total1.addTotal(5000);
    }
    
    public void setCetakPizza(){
        ((Utama)getWorld()).total5.font = 20;
        kuantitas++;
        font = ((Utama)getWorld()).total5.font;
        print ="Pizza ("+kuantitas+")\n\tRp. 27000";
        ((Utama)getWorld()).total1.addTotal(27000);
    }
    
    public void setCetakAyam(){
        ((Utama)getWorld()).total6.font = 20;
        kuantitas++;
        font = ((Utama)getWorld()).total6.font;
        print ="Ayam ("+kuantitas+")\n\tRp. 15000";
        ((Utama)getWorld()).total1.addTotal(15000);
    }
    
    
    public void setCetakBakso(){
        ((Utama)getWorld()).total7.font = 20;
        kuantitas++;
        font = ((Utama)getWorld()).total7.font;
        print ="Bakso ("+kuantitas+")\n\tRp. 10000";
        ((Utama)getWorld()).total1.addTotal(10000);
    }
    
    public void addTotal(int x){
        ((Utama)getWorld()).total1.tot_a+=x;
        ((Utama)getWorld()).total1.print=((Utama)getWorld()).total1.tot_a+"";
        tot_akhir = ((Utama)getWorld()).total1.tot_a;
    }

    public int getTtl(){return tot_akhir;}
}