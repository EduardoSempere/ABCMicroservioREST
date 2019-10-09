package com.stg.abc.usuario.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import com.stg.abc.usuario.modelo.Usuarios;
 

@RepositoryRestResource( exported = false)
public interface UsuariosRepository extends JpaRepository<Usuarios, String> {

	
	

}
