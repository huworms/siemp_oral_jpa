package siemp.estadistica.entidades;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the c_modalidad_agresion database table.
 * 
 */
@Entity
@Table(name="c_modalidad_agresion")
@NamedQuery(name="CModalidadAgresion.findAll", query="SELECT c FROM CModalidadAgresion c")
public class CModalidadAgresion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_modalidad")
	private int idModalidad;

	private String descripcion;

	public CModalidadAgresion() {
	}

	public int getIdModalidad() {
		return this.idModalidad;
	}

	public void setIdModalidad(int idModalidad) {
		this.idModalidad = idModalidad;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}