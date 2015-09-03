package statistics;

import entities.Receta;
import enums.Periodo;

import java.util.Map;

public class EstadisticaPorMasConsultadas implements Estadistica {
    @Override
    public void mostrarEstadistica(Map parametros) {
        Receta.obtenerRecetasMasConsultadas((Periodo)parametros.get("periodo"));
    }
}
