import greenfoot.*;

public class Tiempo extends ObjetosNivel {    
    private int tiempo;
    private long ultimoTiempo; 
    private long tiempoActual;
    private long diferenciaTiempo;
    private Niveles niveles;
    
    public Tiempo() {
        //inicializa con el tiempo actual del sistema en milisegundos
        ultimoTiempo = System.currentTimeMillis();
    }
    //se llama automaticamente cuando se agrega un objeto al mundo
    public void addedToWorld(World world) {
        //obtiene el mundo Niveles y lo almacena en la variable niveles
        niveles = (Niveles) getWorld();
        tiempo = niveles.tiempo[Niveles.contador];
    }
            
    public void act() {
        //obtiene el tiempo actual del sistema en milisegundos
        tiempoActual = System.currentTimeMillis();
        //calcula la diferencia de tiempo desde la ultima actualizacion
        diferenciaTiempo = tiempoActual - ultimoTiempo;
        
        if (tiempo != 0 && diferenciaTiempo >= 400) {
            tiempo--;
            //actualiza la variable temporizador en la clase Niveles
            niveles.setTemporizador(tiempo);
            //actualiza la imagen del objeto con el valor actual de contador
            setImage(new GreenfootImage("Time: " + tiempo, 24, Color.GRAY, Color.ORANGE));
            // Actualiza ultimoTiempo con el tiempo actual del sistema
            ultimoTiempo = tiempoActual;
        }
    }
}