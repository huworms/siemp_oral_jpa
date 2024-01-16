package siemp.estadistica.entidades;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the c_nacionalidad database table.
 * 
 */
@Entity
@Table(name="c_nacionalidad")
@NamedQuery(name="CNacionalidad.findAll", query="SELECT c FROM CNacionalidad c")
public class CNacionalidad implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_nacionalidad")
	private int idNacionalidad;

	private String descripcion;

	public CNacionalidad() {
	}

	public int getIdNacionalidad() {
		return this.idNacionalidad;
	}

	public void setIdNacionalidad(int idNacionalidad) {
		this.idNacionalidad = idNacionalidad;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}