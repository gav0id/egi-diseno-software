package enemigos;

public class Madremusgo implements Enemigo {
    private final String nombre;
    private int vida;
    private final int danio;
    private int criasInvocadas;

    public Madremusgo() {
        this.nombre = "Madremusgo";
        this.vida = 180;
        this.danio = 22;
        this.criasInvocadas = 0;
    }

    @Override
    public void aparecer() {
        System.out.println("¡Un rugido sacude la caverna! " + nombre + " desciende desde el techo cubierto de esporas.");
    }

    @Override
    public void atacar() {
        int danioTotal = danio + (criasInvocadas * 5);
        System.out.println(nombre + " se lanza en picada junto a " + criasInvocadas + " crias causando " + danioTotal + " de danio.");
    }

    @Override
    public void ejecutarHabilidadEspecial() {
        this.criasInvocadas += 2;
        this.vida += 15;
        System.out.println(nombre + " libera una nube de esporas: invoca 2 crias (total: " + criasInvocadas + ") y regenera 15 de vida.");
    }

    @Override
    public String obtenerEstadisticas() {
        return "[Valle Musgoso - Jefe] " + nombre + " | Vida: " + vida + " | Danio base: " + danio + " | Crias activas: " + criasInvocadas;
    }
}