package com.utn.sistemas.qch.statistics;

import com.utn.sistemas.qch.entities.Receta;
import com.utn.sistemas.qch.entities.Usuario;
import com.utn.sistemas.qch.enums.Sexo;

import java.util.List;
import java.util.Map;

public class EstadisticaPorSexo implements Estadistica {

    @Override
    public void mostrarEstadistica(Map parametros) {

        List<Usuario> usuarios = Usuario.obtenerUsuariosPorSexo((Sexo)parametros.get("sexo"));

        Receta.obtenerRecetasDeUsuarios(usuarios);

    }
}
