import greenfoot.*;

public class Level extends ObjetosNivel {
    private int lvl;
    
    public void act() {
        //trae la informacion de la clase Niveles al mundo actual 
        Niveles mundo = (Niveles) getWorld();
        lvl = mundo.nivel[mundo.contador];
        //crea una imgen
        setImage(new GreenfootImage("Level: " + lvl, 24, Color.GRAY, Color.ORANGE));
    }
}

