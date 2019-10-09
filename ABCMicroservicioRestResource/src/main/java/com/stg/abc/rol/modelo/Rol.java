package com.stg.abc.rol.modelo;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.stg.abc.usuario.modelo.Usuarios;

import java.io.Serializable;
import java.util.Optional;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.springframework.data.rest.core.annotation.RestResource;

/**
 * @author esempere 24/04/2019
 */
@Entity
@Table(name = "rol")
public class Rol  implements Serializable
	{

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@Column
	private String rol;

	@Column
	private String nombre;

	@ManyToMany(mappedBy = "roles")
	@RestResource(exported = false)
	private Set<Usuarios> usuarios;

	@JsonBackReference
	public Set<Usuarios> getUsuarios ()
		{
		return usuarios;
		}

	public void setUsuarios (Set<Usuarios> usuarios)
		{
		this.usuarios = usuarios;
		}

	public Integer getId ()
		{
		return id;
		}

	public void setId (Integer id)
		{
		this.id = id;
		}

	public String getRole ()
		{
		return rol;
		}

	public void setRole (String rol)
		{
		this.rol = rol;
		}

	public String getNombre ()
		{
		return nombre;
		}

	public void setNombre (String nombre)
		{
		this.nombre = nombre;
		}

 

	}
