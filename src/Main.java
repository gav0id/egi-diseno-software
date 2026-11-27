import enemigos.TipoEnemigo;
import zonas.GeneradorAbismo;
import zonas.GeneradorBioma;
import zonas.GeneradorEspesuraFatua;
import zonas.GeneradorValleMusgoso;

public class Main {
    public static void main(String[] args) {
        GeneradorBioma[] biomas = {
                new GeneradorValleMusgoso(),
                new GeneradorEspesuraFatua(),
                new GeneradorAbismo()
        };

        for (GeneradorBioma bioma : biomas) {
            bioma.simularEncuentro(TipoEnemigo.COMUN);
            bioma.simularEncuentro(TipoEnemigo.JEFE);
        }
    }
}