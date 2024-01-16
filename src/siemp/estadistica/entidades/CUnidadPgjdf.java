package siemp.estadistica.entidades;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the c_unidad_pgjdf database table.
 * 
 */
@Entity
@Table(name="c_unidad_pgjdf")
@NamedQuery(name="CUnidadPgjdf.findAll", query="SELECT c FROM CUnidadPgjdf c")
public class CUnidadPgjdf implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_unidad")
	private int idUnidad;

	private String descripcion;

	@Column(name="id_agencia")
	private int idAgencia;

	private String siglas;

	public CUnidadPgjdf() {
	}

	public int getIdUnidad() {
		return this.idUnidad;
	}

	public void setIdUnidad(int idUnidad) {
		this.idUnidad = idUnidad;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getIdAgencia() {
		return this.idAgencia;
	}

	public void setIdAgencia(int idAgencia) {
		this.idAgencia = idAgencia;
	}

	public String getSiglas() {
		return this.siglas;
	}

	public void setSiglas(String siglas) {
		this.siglas = siglas;
	}

}