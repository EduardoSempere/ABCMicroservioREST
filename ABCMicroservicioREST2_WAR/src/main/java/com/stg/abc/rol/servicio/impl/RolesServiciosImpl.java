package com.stg.abc.rol.servicio.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stg.abc.rol.modelo.Rol;
import com.stg.abc.rol.repositorio.RolesRepository;
import com.stg.abc.rol.servicio.RolesServicios;

@Service
public class RolesServiciosImpl implements RolesServicios {

	@Autowired
	private RolesRepository rolesRepository;
	
	@Override
	public List<Rol> obtenerTodos() {
		
		return rolesRepository.findAll();
	}

	@Override
	public Rol obtener(Integer id) {
		
		return rolesRepository.getOne(id);
	}

	@Override
	public Rol crear(Rol rol) {
		
		return rolesRepository.save(rol);
	}

	@Override
	public Rol actualizar(Rol rol) {
		
		return rolesRepository.save(rol);
	}

}
