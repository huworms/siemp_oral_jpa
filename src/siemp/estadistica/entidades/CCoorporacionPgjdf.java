package siemp.estadistica.entidades;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the c_coorporacion_pgjdf database table.
 * 
 */
@Entity
@Table(name="c_coorporacion_pgjdf")
@NamedQuery(name="CCoorporacionPgjdf.findAll", query="SELECT c FROM CCoorporacionPgjdf c")
public class CCoorporacionPgjdf implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_agencia")
	private int idAgencia;

	private String descripcion;

	@Column(name="id_coorporacion")
	private int idCoorporacion;

	public CCoorporacionPgjdf() {
	}

	public int getIdAgencia() {
		return this.idAgencia;
	}

	public void setIdAgencia(int idAgencia) {
		this.idAgencia = idAgencia;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getIdCoorporacion() {
		return this.idCoorporacion;
	}

	public void setIdCoorporacion(int idCoorporacion) {
		this.idCoorporacion = idCoorporacion;
	}

}