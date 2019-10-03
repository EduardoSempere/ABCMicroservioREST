package com.stg.abc.usuario.servicio.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stg.abc.usuario.modelo.Usuarios;
import com.stg.abc.usuario.repositorio.UsuariosRepository;
import com.stg.abc.usuario.servicio.UsuariosServicio;

@Service
public class UsuariosServicioImpl implements UsuariosServicio {

	@Autowired
	private UsuariosRepository usuariosRepository;

	@Override
	public List<Usuarios> obtenerTodos() {

		return usuariosRepository.findAll();
	}

	@Override
	public boolean crear(Usuarios usuario) throws Exception {

		Usuarios usuarioNuevo = usuariosRepository.save(usuario);
		if (usuarioNuevo != null) {
			return true;
		} else {
			return false;
		}

	}

	@Override
	public boolean actualizar(Usuarios usuario) {
		Usuarios usuarioModificado = usuariosRepository.save(usuario);
		if (usuarioModificado != null) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public Usuarios obtenerPorUsername(String username) {
		Optional<Usuarios> optional = usuariosRepository.findById(username);
		if (optional.isPresent()) {
			return optional.get();
		} else {
			return null;
		}

	}

	@Override
	public boolean borrar(String username) {

		usuariosRepository.deleteById(username);
		return true;
	}

}
