package enemigos;

public class Reptamusgo implements Enemigo {
    private final String nombre;
    private final int vida;
    private final int danio;
    private boolean camuflado;

    public Reptamusgo() {
        this.nombre = "Reptamusgo";
        this.vida = 35;
        this.danio = 10;
        this.camuflado = false;
    }

    @Override
    public void aparecer() {
        this.camuflado = true;
        System.out.println(nombre + " se desliza entre las lianas y se camufla en el musgo.");
    }

    @Override
    public void atacar() {
        if (camuflado) {
            System.out.println(nombre + " embiste por sorpresa desde el musgo causando " + (danio * 2) + " de danio critico.");
            this.camuflado = false;
        } else {
            System.out.println(nombre + " realiza una mordida rapida causando " + danio + " de danio.");
        }
    }

    @Override
    public void ejecutarHabilidadEspecial() {
        this.camuflado = true;
        System.out.println(nombre + " se entierra en el follaje y recupera su camuflaje para el proximo ataque.");
    }

    @Override
    public String obtenerEstadisticas() {
        return "[Valle Musgoso - Comun] " + nombre + " | Vida: " + vida + " | Danio base: " + danio + " | Camuflado: " + camuflado;
    }
}