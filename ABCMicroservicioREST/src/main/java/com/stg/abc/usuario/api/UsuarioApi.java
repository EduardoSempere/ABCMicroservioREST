package com.stg.abc.usuario.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.stg.abc.usuario.modelo.Usuarios;
import com.stg.abc.usuario.servicio.UsuariosServicio;


@RestController
@RequestMapping("/api/usuarios")
public class UsuarioApi {

	 
	@Autowired
	private UsuariosServicio usuariosServicioImpl;
	
	@GetMapping()
	public List<Usuarios> obtenerTodos(){
		return usuariosServicioImpl.obtenerTodos();
	}
	
	@GetMapping("/{username}")
	public Usuarios obtenerPorUsername(@PathVariable String username){
		return usuariosServicioImpl.obtenerPorUsername(username);
	}
	
	 
	
	@PostMapping()
    public boolean crear(@RequestBody Usuarios usuario) throws Exception{
		 
        return usuariosServicioImpl.crear(usuario);
        
       
    }
	
	@PutMapping()
    public boolean actualizar(@RequestBody Usuarios usuario){
        return usuariosServicioImpl.actualizar(usuario);
        
    }
	
	 
	
	 
	
	@DeleteMapping("{username}")
    public boolean borrar(@PathVariable String username){
			
        return  usuariosServicioImpl.borrar(username);
        
    }
	
	 
	
}
