import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

public class Juego extends Niveles
{   
    private int tiempoActual, meta, cantObjMundo;
    private List<Objetos> cantObj;
    
    public Juego(int i)
    {
        super(800, 580, 1);
        prepararJuego();
        objetosNiveles(i);
    }
    
    public void act() {
        // Obtiene todos los objetos en el mundo
        cantObj = getObjects(Objetos.class);
        // Obtiene el número total de objetos
        cantObjMundo = cantObj.size();
        tiempoActual = super.getTemporizador();
        meta = super.meta[Niveles.contador];
        
        if (tiempoActual == 0 || cantObjMundo == 0) { 
            if (super.dinero >= meta && Niveles.contador < 2) {
                Niveles.contador++;
                Greenfoot.setWorld(new Preparar());
            } else if (super.dinero >= meta && Niveles.contador == 2){
                Niveles.contador = 0;
                Greenfoot.setWorld(new Gano()); 
                Greenfoot.delay(100);
                Greenfoot.setWorld(new MyWorld()); 
            } else {
                Niveles.contador = 0;
                Greenfoot.setWorld(new Pierde());
                Greenfoot.delay(100);
                Greenfoot.setWorld(new MyWorld()); 
            }
        }
    }

    public void objetosNiveles(int i) {
        Obj = new Objetos();

        if (i == 1) {   
            Obj.agregarPiedraP(this);
            Obj.agregarOroPeq(this);
            Obj.agregarOroMed(this);
        } else if (i == 2) {
            Obj.agregarTnt(this);
            Obj.agregarDiamante(this);
            Obj.agregarOroPeq(this);
            Obj.agregarPiedraG(this);
            Obj.agregarOroMed(this);     
            Obj.agregarHueso(this);
            Obj.agregarCalavera(this);
        } else {
            Obj.agregarRataDiamante(this);
            Obj.agregarPiedraG(this);
            Obj.agregarTnt(this);
            Obj.agregarRata(this);
            Obj.agregarOroPeq(this);
            Obj.agregarOroMed(this); 
            Obj.agregarTnt(this);
            Obj.agregarOroGrd(this); 
            Obj.agregarTnt(this);
        }
    }

    private void prepararJuego()
    {
        btnSalir btnSalir = new btnSalir();
        addObject(btnSalir,600,44);
        Dinero dinero = new Dinero();
        addObject(dinero,80,20);
        Tiempo tiempo = new Tiempo();
        addObject(tiempo,730,20);
        Level level = new Level();
        addObject(level,730,60);
        Meta meta = new Meta();
        addObject(meta,80,60);
        Personaje2 personaje2 = new Personaje2();
        addObject(personaje2,390,44);
        Gancho gancho = new Gancho();
        addObject(gancho,376,108);
    }
}