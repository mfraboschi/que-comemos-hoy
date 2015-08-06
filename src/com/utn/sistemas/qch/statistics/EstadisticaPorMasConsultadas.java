package com.utn.sistemas.qch.statistics;

import com.utn.sistemas.qch.entities.Receta;
import com.utn.sistemas.qch.enums.Periodo;

import java.util.Map;

public class EstadisticaPorMasConsultadas implements Estadistica {
    @Override
    public void mostrarEstadistica(Map parametros) {
        Receta.obtenerRecetasMasConsultadas((Periodo)parametros.get("periodo"));
    }
}
