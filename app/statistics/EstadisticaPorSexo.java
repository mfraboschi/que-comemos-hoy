package statistics;

import entities.Receta;
import entities.Usuario;
import enums.Sexo;

import java.util.List;
import java.util.Map;

public class EstadisticaPorSexo implements Estadistica {

    @Override
    public void mostrarEstadistica(Map parametros) {

        List<Usuario> usuarios = Usuario.obtenerUsuariosPorSexo((Sexo)parametros.get("sexo"));

        Receta.obtenerRecetasDeUsuarios(usuarios);

    }
}
