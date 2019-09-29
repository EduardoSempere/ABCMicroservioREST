package com.stg.abc.rol.modelo;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.stg.abc.usuario.modelo.Usuarios;

import java.io.Serializable;
import java.util.Optional;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * @author esempere 24/04/2019
 */
@Entity
@Table(name = "roles")
public class Rol  implements Serializable
	{

	@Id
	@Column
	private Integer id;

	@Column
	private String role;

	@Column
	private String nombre;

	@ManyToMany(mappedBy = "roles")
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
		return role;
		}

	public void setRole (String role)
		{
		this.role = role;
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
