import greenfoot.*;

public class MsjValor extends Preparativo {
    private String meta;

    public void addedToWorld(World world) {
        //trae la informacion de la clase Niveles al mundo actual 
        Niveles mundo = (Niveles) getWorld();
        meta = String.valueOf(mundo.meta[mundo.contador]);
        //crea una imgen
        setImage(new GreenfootImage("$" + meta, 40, Color.GREEN.darker(), null));
    }
}
