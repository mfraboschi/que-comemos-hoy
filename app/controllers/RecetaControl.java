package controllers;

import play.data.Form;
import play.data.DynamicForm;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.index;
import views.html.usuario;
import views.html.receta;
import views.html.login;
import views.html.begin;

import com.avaje.ebean.Model;

import java.util.List;
import java.util.stream.Collectors;

import static play.libs.Json.toJson;
import models.Receta;
import models.Usuario;

public class RecetaControl extends Controller {

    public List<Receta> listaRecetas;
    
    
    public Result crearReceta() 
    {
    	return ok(receta.render(""));
    }
    
    public Result addUsuario() {
    	Usuario usuario = Form.form(Usuario.class).bindFromRequest().get();
    	
    	usuario.save();
        return redirect(routes.RecetaControl.listarRecetas());
    	
    }
    
    public Result listarRecetas() {
    	listaRecetas = new Model.Finder(String.class, Receta.class).all();
    	return ok(toJson(listaRecetas));
    } 

}