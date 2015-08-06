package com.utn.sistemas.qch.controllers;

import com.utn.sistemas.qch.enums.Periodo;
import com.utn.sistemas.qch.statistics.Estadistica;
import com.utn.sistemas.qch.statistics.EstadisticaFactory;

import java.util.Map;

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
