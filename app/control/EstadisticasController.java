package control;

import java.util.Map;

import statistics.Estadistica;
import statistics.EstadisticaFactory;
import enums.Periodo;


/**
 * Created by mfraboschi on 6/8/15.
 */
public class EstadisticasController {

    EstadisticaFactory estadisticaFactory = new EstadisticaFactory();

    public void obtenerEstadistica(Periodo periodo, String tipoEstadistica, Map parametros) {
        Estadistica estadistica = estadisticaFactory.obtenerTipoEstadistica(tipoEstadistica);

        estadistica.mostrarEstadistica(parametros);
    }
}
