package zonas;

import enemigos.Enemigo;
import enemigos.TipoEnemigo;

public abstract class GeneradorBioma {
    protected String nombreBioma;

    public GeneradorBioma(String nombreBioma) {
        this.nombreBioma = nombreBioma;
    }

    public abstract Enemigo crearEnemigo(TipoEnemigo tipo);

    public void simularEncuentro(TipoEnemigo tipo) {
        System.out.println("==================================================");
        System.out.println("Bioma: " + nombreBioma + " | Encuentro: " + tipo);
        System.out.println("==================================================");

        Enemigo enemigo = crearEnemigo(tipo);
        enemigo.aparecer();
        System.out.println(enemigo.obtenerEstadisticas());
        enemigo.atacar();
        enemigo.ejecutarHabilidadEspecial();
        enemigo.atacar();
        System.out.println();
    }
}
