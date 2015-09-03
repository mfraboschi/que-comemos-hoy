package dao;

import java.util.List;

import entities.Receta;
import entities.Usuario;
import enums.Periodo;

public interface RecetaDAO {

    public void guardarReceta(Receta receta);

    public Receta obtenerReceta(Integer recetaId);

    public List<Receta> obtenerRecetasDeUsuarios(List<Usuario> usuarios);

    public List<Receta> obtenerRecetasPorDificultad(Periodo periodo, String dificultad);

    public List<Receta> obtenerRecetasMasConsultadas(Periodo periodo);

}
