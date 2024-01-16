package siemp.estadistica.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigInteger;


/**
 * The persistent class for the t_procedencia database table.
 * 
 */
@Entity
@Table(name="t_procedencia")
@NamedQuery(name="TProcedencia.findAll", query="SELECT t FROM TProcedencia t")
public class TProcedencia implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_tsjdf")
	private Long idTsjdf;

	@Column(name="anio_expediente")
	private int anioExpediente;

	private String estatus;

	@Column(name="forma_proceso")
	private String formaProceso;

	@Column(name="id_entidad")
	private int idEntidad;

	@Column(name="id_tsjdf_origen")
	private Long idTsjdfOrigen;

	@Column(name="num_expediente")
	private int numExpediente;

	@Column(name="num_investigacion")
	private String numInvestigacion;

	public TProcedencia() {
	}

	public Long getIdTsjdf() {
		return this.idTsjdf;
	}

	public void setIdTsjdf(Long idTsjdf) {
		this.idTsjdf = idTsjdf;
	}

	public int getAnioExpediente() {
		return this.anioExpediente;
	}

	public void setAnioExpediente(int anioExpediente) {
		this.anioExpediente = anioExpediente;
	}

	public String getEstatus() {
		return this.estatus;
	}

	public void setEstatus(String estatus) {
		this.estatus = estatus;
	}

	public String getFormaProceso() {
		return this.formaProceso;
	}

	public void setFormaProceso(String formaProceso) {
		this.formaProceso = formaProceso;
	}

	public int getIdEntidad() {
		return this.idEntidad;
	}

	public void setIdEntidad(int idEntidad) {
		this.idEntidad = idEntidad;
	}

	public Long getIdTsjdfOrigen() {
		return this.idTsjdfOrigen;
	}

	public void setIdTsjdfOrigen(Long idTsjdfOrigen) {
		this.idTsjdfOrigen = idTsjdfOrigen;
	}

	public int getNumExpediente() {
		return this.numExpediente;
	}

	public void setNumExpediente(int numExpediente) {
		this.numExpediente = numExpediente;
	}

	public String getNumInvestigacion() {
		return this.numInvestigacion;
	}

	public void setNumInvestigacion(String numInvestigacion) {
		this.numInvestigacion = numInvestigacion;
	}

}