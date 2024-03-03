import greenfoot.*;

public class Objetos extends Actor {
    
    // Método genérico para agregar objetos al mundo especificado
    private <T extends Actor> void agregarObjetos(Juego juego, Class<T> clase, int cantidad) {
        int anchoJuego = juego.getWidth();
        int altoJuego = juego.getHeight();
        int parteInferior = altoJuego / 2; // Determina la parte inferior del mundo
        int x, y;
        boolean posicionValida;
        
        for (int i = 0; i < cantidad; i++) {
            x = Greenfoot.getRandomNumber(anchoJuego);
            y = Greenfoot.getRandomNumber(parteInferior) + parteInferior; 
            
            try {
                // Intenta crear una nueva instancia de la clase 'T' 
                //utilizando su constructor sin parámetros
                T objeto = clase.getDeclaredConstructor().newInstance();
                // Añade el nuevo objeto al juego en las coordenadas (x, y)
                juego.addObject(objeto, x, y);
            } catch (Exception e) {
                // Si hay algún error durante la creación de la nueva instancia o 
                //al añadir el objeto al juego, imprime la traza del error
                e.printStackTrace();
            }
        }    
    }

    public void agregarOroMed(Juego juego) {
        agregarObjetos(juego, OroMed.class, 2);
    }
    
    public void agregarPiedraG(Juego juego) {
        agregarObjetos(juego, PiedraG.class, 2);
    }
    
    public void agregarPiedraP(Juego juego) {
        agregarObjetos(juego, PiedraP.class, 2);
    }
    
    public void agregarBolsa(Juego juego) {
        agregarObjetos(juego, Bolsa.class, 2);
    }
    
    public void agregarDiamante(Juego juego) {
        agregarObjetos(juego, Diamante.class, 1);
    }
    
    public void agregarHueso(Juego juego) {
        agregarObjetos(juego, Hueso.class, 3);
    }

    public void agregarCalavera(Juego juego) {
        agregarObjetos(juego, Calavera.class, 2);
    }
    
    public void agregarRata(Juego juego) {
        agregarObjetos(juego, Rata.class, 2);
    }
    
    public void agregarRataDiamante(Juego juego) {
        agregarObjetos(juego, RataDiamante.class, 1);
    }
    
    public void agregarOroGrd(Juego juego) {
        agregarObjetos(juego, OroGrd.class, 1);
    }
    
    public void agregarOroPeq(Juego juego) {
        agregarObjetos(juego, OroPeq.class, 3);
    }
    
    public void agregarTnt(Juego juego) {
        agregarObjetos(juego, Tnt.class, 3);
    }
}
