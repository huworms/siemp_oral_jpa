package siemp.estadistica.entidades;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the c_ocupacion database table.
 * 
 */
@Entity
@Table(name="c_ocupacion")
@NamedQuery(name="COcupacion.findAll", query="SELECT c FROM COcupacion c")
public class COcupacion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_ocupacion")
	private int idOcupacion;

	private String descripcion;

	public COcupacion() {
	}

	public int getIdOcupacion() {
		return this.idOcupacion;
	}

	public void setIdOcupacion(int idOcupacion) {
		this.idOcupacion = idOcupacion;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}