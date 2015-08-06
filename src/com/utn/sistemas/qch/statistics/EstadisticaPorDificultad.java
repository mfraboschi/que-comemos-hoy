package com.utn.sistemas.qch.statistics;

import com.utn.sistemas.qch.entities.Receta;
import com.utn.sistemas.qch.entities.Usuario;
import com.utn.sistemas.qch.enums.Periodo;
import com.utn.sistemas.qch.enums.Sexo;

import java.util.List;
import java.util.Map;

public class EstadisticaPorDificultad implements Estadistica {
    @Override
    public void mostrarEstadistica(Map parametros) {
        Receta.obtenerRecetasPorDificultad((Periodo) parametros.get("periodo"),(String)parametros.get("dificultad"));
    }
}
