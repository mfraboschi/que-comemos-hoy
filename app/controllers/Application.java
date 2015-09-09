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

import models.Usuario;
import models.Receta;

public class Application extends Controller {

    public List<Usuario> listaUsuarios;
    public Usuario temp;
    
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
                //return redirect(routes.Application.begin());
                	return redirect(routes.Application.crearReceta());
            }
        }
        return ok("ERROR");
    }

    /*
    public Result begin() {
        return ok(begin.render());
    }
    */
    
    
    public Result crearReceta() {
    	return ok(begin.render("",temp));
    }
    
    public Result addReceta() {
    	Receta receta = Form.form(Receta.class).bindFromRequest().get();
    	receta.duenio = temp;
    	receta.save();
    	
    	temp.recetas.add(receta);
    	temp.save();
    
    	return redirect(routes.Application.listarRecetas());
    }
    
    public Result listarRecetas() {
    	List<Receta> listaRecetas = new Model.Finder(String.class, Receta.class).all();
    	return ok(toJson(listaRecetas));
    }
} 
