import greenfoot.*;

public class Tnt extends Objetos {
    private boolean explosionMostrada;   
    
    public Tnt() {
        this.explosionMostrada = false;
    }

    public void act() {
        if (explosionMostrada) {
            //incia sonido de explosion
            Greenfoot.playSound("boom.wav");
            //cambia la img
            setImage("explosion0.png");
            Greenfoot.delay(9);
            // Detecta colisiones con otros objetos y elimínalos
            eliminarObjetosColisionados();
            // Elimina el TNT después de la secuencia de explosión
            getWorld().removeObject(this);  
        }   
    }
    
    public void mostrarExplosion() {
        explosionMostrada = true;
    }
    
    private void eliminarObjetosColisionados() {
        //obtiene el primer objeto de la clase Objetos que está intersectando con este actor
        Actor objetoColisionado = getOneIntersectingObject(Objetos.class);
        while (objetoColisionado != null) {
            //elimina el objeto colisionado del mundo
            getWorld().removeObject(objetoColisionado);
            //busca el siguiente objeto colisionado
            objetoColisionado = getOneIntersectingObject(Objetos.class); // Busca el siguiente objeto colisionado
        }
    }
}