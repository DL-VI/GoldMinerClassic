import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Meta extends ObjetosNivel {
    private int meta;
   
    public void act() {
        //trae la informacion de la clase Niveles al mundo actual 
        Niveles mundo = (Niveles) getWorld();
        meta = mundo.meta[mundo.contador];
        //crea una imgen
        setImage(new GreenfootImage("Goal: $" + meta, 24, Color.GRAY, Color.ORANGE));
    }
}
