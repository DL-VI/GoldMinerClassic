import greenfoot.*;

public class btnSalir extends ObjetosNivel
{
    private GreenfootImage[] imagen;
    private int tiempo, dinero, meta;
    
    public btnSalir() {
        this.imagen = new GreenfootImage[2];//inicia array con tamaño 2
        //carga las img al array
        for (int i = 0; i < imagen.length; i++)
            imagen[i] = new GreenfootImage("btnSalir" + i + ".png");
    }
    
    public void eventoClick() {
        //trae la informacion de la clase Niveles al mundo actual 
        Niveles niveles = (Niveles) getWorld();
        tiempo = niveles.getTemporizador();
        dinero = niveles.dinero;
        meta = niveles.meta[Niveles.contador];
        
        if (Greenfoot.mouseClicked(this)) {
            setImage(imagen[1]);
            Greenfoot.delay(7);
            setImage(imagen[0]);
        
            if (tiempo > 0) { 
                //siguiente lvl
                if (dinero >= meta && Niveles.contador < 2) {
                    Niveles.contador++;
                    Greenfoot.setWorld(new Preparar());     
                } else if (dinero < meta) {//gana
                    Niveles.contador = 0;
                    Greenfoot.setWorld(new Pierde()); 
                    Greenfoot.delay(100);
                    Greenfoot.setWorld(new MyWorld()); 
                } else {//pierde
                    Niveles.contador = 0;
                    Greenfoot.setWorld(new Gano()); 
                    Greenfoot.delay(100);
                    Greenfoot.setWorld(new MyWorld()); 
                }
            }
        }
    }
    
    public void act()
    {
        eventoClick();
    }
}