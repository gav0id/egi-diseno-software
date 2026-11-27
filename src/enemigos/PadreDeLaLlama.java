package enemigos;

public class PadreDeLaLlama implements Enemigo {
    private final String nombre;
    private final int vida;
    private final int danio;
    private int intensidadLlama;

    public PadreDeLaLlama() {
        this.nombre = "Padre de la Llama";
        this.vida = 240;
        this.danio = 28;
        this.intensidadLlama = 1;
    }

    @Override
    public void aparecer() {
        System.out.println("El aire arde al rojo vivo. " + nombre + " enciende la espesura con su presencia.");
    }

    @Override
    public void atacar() {
        int danioFinal = danio + (intensidadLlama * 8);
        System.out.println(nombre + " desata una oleada incandescente (intensidad " + intensidadLlama + ") por " + danioFinal + " de danio.");
    }

    @Override
    public void ejecutarHabilidadEspecial() {
        this.intensidadLlama += 2;
        System.out.println(nombre + " aviva el fuego sagrado: su intensidad sube a " + intensidadLlama + " y provoca una explosion en area.");
    }

    @Override
    public String obtenerEstadisticas() {
        return "[Espesura Fatua - Jefe] " + nombre + " | Vida: " + vida + " | Danio base: " + danio + " | Intensidad: " + intensidadLlama;
    }
}