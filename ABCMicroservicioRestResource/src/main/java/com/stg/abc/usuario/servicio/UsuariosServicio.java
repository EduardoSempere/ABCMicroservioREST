package com.stg.abc.usuario.servicio;

import java.util.List;

import com.stg.abc.usuario.modelo.Usuarios;
 

public interface UsuariosServicio {
	
	public List<Usuarios> obtenerTodos(); 
	
	public boolean crear(Usuarios usuario) throws Exception;
	
	public boolean actualizar(Usuarios usuario);
	
	public Usuarios obtenerPorUsername(String username);
	
	public boolean borrar(String username);

	 

}
