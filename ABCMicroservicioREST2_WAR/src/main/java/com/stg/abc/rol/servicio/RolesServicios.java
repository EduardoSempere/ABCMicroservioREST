package com.stg.abc.rol.servicio;

import java.util.List;


import com.stg.abc.rol.modelo.Rol; 

public interface RolesServicios {

	
	public List<Rol> obtenerTodos();
	
	public Rol obtener(Integer id);
	
	public Rol crear(Rol rol);
	
	public Rol actualizar(Rol rol); 
}
