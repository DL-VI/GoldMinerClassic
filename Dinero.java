import greenfoot.*;

public class Dinero extends ObjetosNivel {
    private int dinero;
    
    public void act() {
        //trae la informacion de la clase Niveles al mundo actual 
        Niveles mundo = (Niveles) getWorld();
        dinero = mundo.dinero;
        //crea la img
        setImage(new GreenfootImage("Money: $" + dinero, 24, Color.GRAY, Color.ORANGE));
    }
}