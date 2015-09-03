package dao;

import entities.Grupo;

public interface GrupoDAO {

    public boolean guardarGrupo(Grupo grupo);

    public Grupo obtenerGrupo(Integer grupoId);
}
