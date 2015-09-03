package statistics;

import entities.Receta;
import enums.Periodo;
import java.util.List;
import java.util.Map;

public class EstadisticaPorDificultad implements Estadistica {
    @Override
    public void mostrarEstadistica(Map parametros) {
        Receta.obtenerRecetasPorDificultad((Periodo) parametros.get("periodo"),(String)parametros.get("dificultad"));
    }
}
