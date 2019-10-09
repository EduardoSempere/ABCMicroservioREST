package com.stg.abc.rol.repositorio;

import java.util.List;

 
import org.springframework.data.jpa.repository.JpaRepository; 
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;

import com.stg.abc.rol.modelo.Rol;

@RepositoryRestResource(  path = "rol", collectionResourceRel = "roles")
public interface RolesRepository extends JpaRepository<Rol, Integer> {


	@RestResource(path = "nombre", rel = "porNombre")
	List<Rol> findByNombre(String nombre);
}
