package control;

import entities.*;

public class GrupoController {

    public void crearGrupo(String nombreGrupo, Usuario creadorGrupo) {
        Grupo grupo = new Grupo(nombreGrupo, creadorGrupo);

        grupo.guardar();
    }

    public void agregarUsuario(Integer usuarioId, Integer grupoId) {
        Usuario usuario = Usuario.obtenerUsuario(usuarioId);
        Grupo grupo = Grupo.obtenerGrupo(grupoId);

        grupo.agregarUsuario(usuario);

        grupo.guardar();


    }

}

//esto deberia aparecer