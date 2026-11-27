package enemigos;

public class TentaculosDelVacio implements Enemigo {
    private final String nombre;
    private final int vida;
    private final int danio;
    private int tentaculosActivos;

    public TentaculosDelVacio() {
        this.nombre = "Tentaculos del Vacio";
        this.vida = 300;
        this.danio = 18;
        this.tentaculosActivos = 2;
    }

    @Override
    public void aparecer() {
        System.out.println("El suelo se abre en oscuridad absoluta: emergen " + nombre + " desde las profundidades.");
    }

    @Override
    public void atacar() {
        int danioRafaga = danio * tentaculosActivos;
        System.out.println(nombre + " azota con " + tentaculosActivos + " tentaculos en rafaga causando " + danioRafaga + " de danio total.");
    }

    @Override
    public void ejecutarHabilidadEspecial() {
        this.tentaculosActivos++;
        System.out.println(nombre + " invoca un nuevo zarcillo abisal (activos: " + tentaculosActivos + ") e inmoviliza al objetivo.");
    }

    @Override
    public String obtenerEstadisticas() {
        return "[Abismo - Jefe] " + nombre + " | Vida: " + vida + " | Danio por tentaculo: " + danio + " | Tentaculos: " + tentaculosActivos;
    }
}