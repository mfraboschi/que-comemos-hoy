package controllers;

import play.data.Form;
import play.data.DynamicForm;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.index;
import views.html.usuario;
import views.html.login;
import views.html.begin;

import com.avaje.ebean.Model;

import java.util.List;
import java.util.stream.Collectors;

import static play.libs.Json.toJson;
import models.Receta;
import models.Usuario;

public class UsuarioControl extends Controller {

    public List<Usuario> listaUsuarios;
    public Usuario temp;
    
    
    public Result crearUsuario() 
    {
    	return ok(usuario.render(""));
    }
    
    public Result addUsuario() {
    	Usuario usuario = Form.form(Usuario.class).bindFromRequest().get();
    	
    	usuario.save();
        return redirect(routes.UsuarioControl.listarUsuarios());
    	
    }
    
    public Result listarUsuarios() {
    	listaUsuarios = new Model.Finder(String.class, Usuario.class).all();
    	return ok(toJson(listaUsuarios));
    }
    
    public Result login() {
    	return ok(login.render());
    }
    
    public Result entrar() {
        DynamicForm requestData = Form.form().bindFromRequest();
        String user = requestData.get("id");
        String pass = requestData.get("password");
        if (listaUsuarios != null)
        {
            List<Usuario> prueba = listaUsuarios.stream().filter(a -> a.id.equals(user)).collect(Collectors.toList());
            if (prueba.size() > 0)
            {
                temp = prueba.get(0);
                if (temp.password.equals(pass))
                return redirect(routes.UsuarioControl.begin());
            }
        }
        return ok("ERROR");
    }

    public Result begin() {
        return ok(begin.render());
    }
 
    
    public Result addReceta() {
    	Receta receta = Form.form(Receta.class).bindFromRequest().get();
    	receta.duenio = temp;
    	receta.calificacion = 2;
    	receta.save();
        return redirect(routes.RecetaControl.listarRecetas());
    	
    }

} 