package siemp.estadistica.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the t_exhorto database table.
 * 
 */
@Entity
@Table(name="t_exhorto")
@NamedQuery(name="TExhorto.findAll", query="SELECT t FROM TExhorto t")
public class TExhorto implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TExhortoPK id;

	private String diligencia;

	@Temporal(TemporalType.DATE)
	@Column(name="fecha_devolucion")
	private Date fechaDevolucion;

	@Column(name="id_entidad_federativa")
	private int idEntidadFederativa;

	@Column(name="id_fuero")
	private String idFuero;

	@Column(name="num_expediente")
	private String numExpediente;

	@Column(name="num_juzgado")
	private String numJuzgado;

	private String temporalidad;

	public TExhorto() {
	}

	public TExhortoPK getId() {
		return this.id;
	}

	public void setId(TExhortoPK id) {
		this.id = id;
	}

	public String getDiligencia() {
		return this.diligencia;
	}

	public void setDiligencia(String diligencia) {
		this.diligencia = diligencia;
	}

	public Date getFechaDevolucion() {
		return this.fechaDevolucion;
	}

	public void setFechaDevolucion(Date fechaDevolucion) {
		this.fechaDevolucion = fechaDevolucion;
	}

	public int getIdEntidadFederativa() {
		return this.idEntidadFederativa;
	}

	public void setIdEntidadFederativa(int idEntidadFederativa) {
		this.idEntidadFederativa = idEntidadFederativa;
	}

	public String getIdFuero() {
		return this.idFuero;
	}

	public void setIdFuero(String idFuero) {
		this.idFuero = idFuero;
	}

	public String getNumExpediente() {
		return this.numExpediente;
	}

	public void setNumExpediente(String numExpediente) {
		this.numExpediente = numExpediente;
	}

	public String getNumJuzgado() {
		return this.numJuzgado;
	}

	public void setNumJuzgado(String numJuzgado) {
		this.numJuzgado = numJuzgado;
	}

	public String getTemporalidad() {
		return this.temporalidad;
	}

	public void setTemporalidad(String temporalidad) {
		this.temporalidad = temporalidad;
	}

}