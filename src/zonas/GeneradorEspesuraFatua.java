package zonas;

import enemigos.Enemigo;
import enemigos.Fatuo;
import enemigos.PadreDeLaLlama;
import enemigos.TipoEnemigo;

public class GeneradorEspesuraFatua extends GeneradorBioma {

    public GeneradorEspesuraFatua() {
        super("Espesura Fatua");
    }

    @Override
    public Enemigo crearEnemigo(TipoEnemigo tipo) {
        return switch (tipo) {
            case COMUN -> new Fatuo();
            case JEFE -> new PadreDeLaLlama();
        };
    }
}