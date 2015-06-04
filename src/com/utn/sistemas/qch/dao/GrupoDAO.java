package com.utn.sistemas.qch.dao;

import com.utn.sistemas.qch.entities.Grupo;

public interface GrupoDAO {

    public boolean guardarGrupo(Grupo grupo);

    public Grupo obtenerGrupo(Integer grupoId);
}
