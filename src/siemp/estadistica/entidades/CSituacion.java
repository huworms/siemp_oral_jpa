package siemp.estadistica.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the c_situacion database table.
 * 
 */
@Entity
@Table(name="c_situacion")
@NamedQuery(name="CSituacion.findAll", query="SELECT c FROM CSituacion c")
public class CSituacion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_situacion")
	private int idSituacion;

	private String descripcion;

	//bi-directional many-to-one association to TSituacionPersona
	@OneToMany(mappedBy="CSituacion")
	private List<TSituacionPersona> TSituacionPersonas;

	public CSituacion() {
	}

	public int getIdSituacion() {
		return this.idSituacion;
	}

	public void setIdSituacion(int idSituacion) {
		this.idSituacion = idSituacion;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public List<TSituacionPersona> getTSituacionPersonas() {
		return this.TSituacionPersonas;
	}

	public void setTSituacionPersonas(List<TSituacionPersona> TSituacionPersonas) {
		this.TSituacionPersonas = TSituacionPersonas;
	}

	public TSituacionPersona addTSituacionPersona(TSituacionPersona TSituacionPersona) {
		getTSituacionPersonas().add(TSituacionPersona);
		TSituacionPersona.setCSituacion(this);

		return TSituacionPersona;
	}

	public TSituacionPersona removeTSituacionPersona(TSituacionPersona TSituacionPersona) {
		getTSituacionPersonas().remove(TSituacionPersona);
		TSituacionPersona.setCSituacion(null);

		return TSituacionPersona;
	}

}