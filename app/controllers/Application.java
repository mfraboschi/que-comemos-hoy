package controllers;

import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.index;
import views.html.usuario;

import com.avaje.ebean.Model;
import java.util.List;

import static play.libs.Json.toJson;

import models.Usuario;
public class Application extends Controller {

    public Result index() {
        return ok(index.render(""));
    }
    
    public Result crearUsuario() {
    	return ok(usuario.render(""));
    }
    
    public Result addUsuario() {
    	Usuario usuario = Form.form(Usuario.class).bindFromRequest().get();
    	usuario.save();
    	return redirect(routes.Application.listarUsuarios());
    }
    
    public Result listarUsuarios() {
    	List<Usuario> listaUsuarios = new Model.Finder(String.class, Usuario.class).all();
    	return ok(toJson(listaUsuarios));
    }
    
    public Result login() {
    	return ok();
    }

}
