package com.utn.sistemas.qch.dao;

import com.utn.sistemas.qch.entities.Receta;
import com.utn.sistemas.qch.entities.Usuario;
import com.utn.sistemas.qch.enums.Periodo;

import java.util.List;

public interface RecetaDAO {

    public void guardarReceta(Receta receta);

    public Receta obtenerReceta(Integer recetaId);

    public List<Receta> obtenerRecetasDeUsuarios(List<Usuario> usuarios);

    public List<Receta> obtenerRecetasPorDificultad(Periodo periodo, String dificultad);

    public List<Receta> obtenerRecetasMasConsultadas(Periodo periodo);

}
