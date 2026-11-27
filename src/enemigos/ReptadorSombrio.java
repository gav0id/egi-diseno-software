package enemigos;

public class ReptadorSombrio implements Enemigo {
    private final String nombre;
    private final int vida;
    private final int danio;
    private int sedaDrenada;

    public ReptadorSombrio() {
        this.nombre = "Reptador Sombrio";
        this.vida = 60;
        this.danio = 16;
        this.sedaDrenada = 0;
    }

    @Override
    public void aparecer() {
        System.out.println(nombre + " se arrastra fuera de una grieta del vacio sin hacer ruido.");
    }

    @Override
    public void atacar() {
        this.sedaDrenada += 10;
        System.out.println(nombre + " ataca con garras oscuras causando " + danio + " de danio y drena 10 de seda (acumulada: " + sedaDrenada + ").");
    }

    @Override
    public void ejecutarHabilidadEspecial() {
        System.out.println(nombre + " se funde en el suelo abisal y reaparece detras del objetivo para emboscarlo.");
    }

    @Override
    public String obtenerEstadisticas() {
        return "[Abismo - Comun] " + nombre + " | Vida: " + vida + " | Danio base: " + danio + " | Seda drenada: " + sedaDrenada;
    }
}