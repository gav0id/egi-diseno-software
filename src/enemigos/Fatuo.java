package enemigos;

public class Fatuo implements Enemigo {
    private final String nombre;
    private final int vida;
    private final int danio;
    private int acumulacionesQuemadura;

    public Fatuo() {
        this.nombre = "Fatuo";
        this.vida = 45;
        this.danio = 14;
        this.acumulacionesQuemadura = 0;
    }

    @Override
    public void aparecer() {
        System.out.println(nombre + " emerge de las brasas flotando en silencio.");
    }

    @Override
    public void atacar() {
        this.acumulacionesQuemadura++;
        int danioQuemadura = acumulacionesQuemadura * 4;
        System.out.println(nombre + " dispara una chispa espectral: " + danio + " de danio + " + danioQuemadura + " por quemadura acumulada.");
    }

    @Override
    public void ejecutarHabilidadEspecial() {
        System.out.println(nombre + " se desvanece en un destello igneo y se teletransporta para evadir el contraataque.");
    }

    @Override
    public String obtenerEstadisticas() {
        return "[Espesura Fatua - Comun] " + nombre + " | Vida: " + vida + " | Danio base: " + danio + " | Quemaduras: " + acumulacionesQuemadura;
    }
}