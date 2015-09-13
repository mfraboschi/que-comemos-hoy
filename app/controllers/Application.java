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

public class Application extends Controller 
{

    public List<Usuario> listaUsuarios;

    public Result index() {
        return ok(index.render(""));
    }
    
    
} 