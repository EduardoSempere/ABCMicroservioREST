package com.stg.abc.rol.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stg.abc.rol.modelo.Rol;
 
@Repository
public interface RolesRepository extends JpaRepository<Rol, Integer> {

}
