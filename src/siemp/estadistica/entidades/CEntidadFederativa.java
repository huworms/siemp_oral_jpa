package siemp.estadistica.entidades;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the c_entidad_federativa database table.
 * 
 */
@Entity
@Table(name="c_entidad_federativa")
@NamedQuery(name="CEntidadFederativa.findAll", query="SELECT c FROM CEntidadFederativa c")
public class CEntidadFederativa implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_entidad")
	private int idEntidad;

	private String descripcion;

	public CEntidadFederativa() {
	}

	public int getIdEntidad() {
		return this.idEntidad;
	}

	public void setIdEntidad(int idEntidad) {
		this.idEntidad = idEntidad;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}