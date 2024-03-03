import greenfoot.*;  

public class Gancho extends ObjetosNivel {       
    private int velocidadX, velocidadY;  
    private boolean moverIzquierda; 
    private int posicionY, velocidadDescender, velocidadAscender; 
    GreenfootSound sonidoFinish;
    GreenfootSound sonidoUp;
    GreenfootSound sonidoDown;
    
    public Gancho() {
        moverIzquierda = true;
        velocidadX = 5; 
        velocidadY = 5; 
        velocidadDescender = 5;
        velocidadAscender = 5; 
        sonidoFinish = new GreenfootSound("upfinish.wav");
        sonidoUp = new GreenfootSound("up.wav");
        sonidoDown = new GreenfootSound("down.wav");
    }
    
    public void act() {
        moverHorizontal();
        bordeMundo();
        teclaAbajo();
    }
    
    private void moverHorizontal() {
        if (moverIzquierda) 
            move(-velocidadX);
         else 
            move(velocidadX);
    }

    private void bordeMundo() {
        int posicionX = getX();
        int anchoMundo = getWorld().getWidth();
        
        //cambiar la dirección horizontal cuando el gancho llegue a los límites del mundo
        if (posicionX <= 0) 
            moverIzquierda = false;
        else if (posicionX >= anchoMundo - 1) 
            moverIzquierda = true;
    }

    private void teclaAbajo() {
        if (Greenfoot.isKeyDown("down")) {
            sonidoDown.play();
            //posición actual en el eje Y del objeto 
            posicionY = getY(); 
            //distancia que el objeto puede descender antes de llegar al fondo del mundo
            int distanciaDescenso  = getWorld().getHeight() - posicionY; 
            //almacena cualquier objeto que pueda estar debajo del objeto actual
            Actor objetoDebajo = null;
            descenderGancho(distanciaDescenso, objetoDebajo);
        }
    }

    private void descenderGancho(int distanciaDescenso, Actor objetoDebajo) {
        int distanciaRecorrida = 0; 
      
        while (distanciaRecorrida < distanciaDescenso ) {  
            // Mueve el gancho hacia abajo
            setLocation(getX(), getY() + velocidadDescender);
            // Pequeño retraso para visualizar el movimiento
            Greenfoot.delay(1); 
            distanciaRecorrida += velocidadDescender;
            
            //trae la referencia del objeto que esta debajo del gancho
            objetoDebajo = getOneObjectAtOffset(0, getImage().getHeight() / 2, Objetos.class);
            
            if (objetoDebajo != null) {
                
                if (objetoDebajo instanceof Tnt) {
                    Tnt tnt = (Tnt) objetoDebajo;
                    tnt.mostrarExplosion();
                    tnt.act();
                    
                    //asciende el gancho
                    while (getY() > posicionY) {
                        // Mueve el gancho hacia arriba
                        setLocation(getX(), getY() - velocidadAscender); 
                        // Pequeño retraso para visualizar el movimiento
                        Greenfoot.delay(1); 
                    }
                }
                break; // Si hay un objeto, detiene el descenso
            } 
        }
        // Asciende el gancho y el objeto juntos
        ascenderGancho(objetoDebajo);
    }

    private void ascenderGancho(Actor objetoDebajo ) {
        sonidoUp.play();
        
        while (getY() > posicionY) {
            // Mueve el gancho hacia arriba
            setLocation(getX(), getY() - velocidadAscender); 
            // Pequeño retraso para visualizar el movimiento
            Greenfoot.delay(1); 
        
            if (objetoDebajo  instanceof OroGrd || objetoDebajo  instanceof PiedraG || objetoDebajo  instanceof PiedraP) {
                Greenfoot.delay(2); 
                sonidoUp.play();
            } 
            
            // Mueve el objeto junto con el gancho si hay un objeto debajo
            if (objetoDebajo != null) 
                objetoDebajo.setLocation(objetoDebajo.getX(), objetoDebajo.getY() - velocidadAscender);
            
        }
    
        // Maneja los objetos y el sonido
        manejarObjetos(objetoDebajo );
    }

    private void manejarObjetos(Actor objetoDebajo ) {
        if (objetoDebajo != null) {
            sonidoUp.stop();
            sonidoFinish.play();
            if (objetoDebajo instanceof Tnt) 
                sonidoFinish.stop();
            else if (objetoDebajo instanceof OroMed) {
                OroMed OroMedObject = (OroMed) objetoDebajo ;
                OroMedObject.dinero();
            } else if (objetoDebajo instanceof PiedraG) {
                PiedraG PiedraGObject = (PiedraG) objetoDebajo ;
                PiedraGObject.dinero();
            } else if (objetoDebajo instanceof PiedraP) {
                PiedraP PiedraPObject = (PiedraP) objetoDebajo ;
                PiedraPObject.dinero();
            } else if (objetoDebajo instanceof Bolsa) {
                Bolsa BolsaObject = (Bolsa) objetoDebajo ;
                BolsaObject.dinero();
            } else if (objetoDebajo instanceof Diamante) {
                Diamante DiamanteObject = (Diamante) objetoDebajo ;
                DiamanteObject.dinero();
            } else if (objetoDebajo instanceof Hueso) {
                Hueso HuesoObject = (Hueso) objetoDebajo ;
                HuesoObject.dinero();
            } else if (objetoDebajo instanceof Calavera) {
                Calavera CalaveraObject = (Calavera) objetoDebajo ;
                CalaveraObject.dinero();
            } else if (objetoDebajo instanceof Rata) {
                Rata RataObject = (Rata) objetoDebajo ;
                RataObject.dinero();
            } else if (objetoDebajo instanceof RataDiamante) {
                RataDiamante RataDObject = (RataDiamante) objetoDebajo ;
                RataDObject.dinero();
            } else if (objetoDebajo instanceof OroGrd) {
                OroGrd OroGObject = (OroGrd) objetoDebajo ;
                OroGObject.dinero();
            } else if (objetoDebajo instanceof OroPeq) {
                OroPeq OroPObject = (OroPeq) objetoDebajo ;
                OroPObject.dinero();
            }
            getWorld().removeObject(objetoDebajo);
        }
    }   
}