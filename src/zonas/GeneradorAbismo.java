package zonas;

import enemigos.Enemigo;
import enemigos.ReptadorSombrio;
import enemigos.TentaculosDelVacio;
import enemigos.TipoEnemigo;

public class GeneradorAbismo extends GeneradorBioma {

    public GeneradorAbismo() {
        super("Abismo");
    }

    @Override
    public Enemigo crearEnemigo(TipoEnemigo tipo) {
        return switch (tipo) {
            case COMUN -> new ReptadorSombrio();
            case JEFE -> new TentaculosDelVacio();
        };
    }
}