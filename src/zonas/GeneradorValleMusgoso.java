package zonas;

import enemigos.Enemigo;
import enemigos.Madremusgo;
import enemigos.Reptamusgo;
import enemigos.TipoEnemigo;

public class GeneradorValleMusgoso extends GeneradorBioma {

    public GeneradorValleMusgoso() {
        super("Valle Musgoso");
    }

    @Override
    public Enemigo crearEnemigo(TipoEnemigo tipo) {
        return switch (tipo) {
            case COMUN -> new Reptamusgo();
            case JEFE -> new Madremusgo();
        };
    }
}