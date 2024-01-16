package siemp.estadistica.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the t_mandamiento_judicial database table.
 * 
 */
@Entity
@Table(name="t_mandamiento_judicial")
@NamedQuery(name="TMandamientoJudicial.findAll", query="SELECT t FROM TMandamientoJudicial t")
public class TMandamientoJudicial implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_mandamiento_judicial")
	private String idMandamientoJudicial;

	private String estatus;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="fecha_disposicion")
	private Date fechaDisposicion;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="fecha_prescripcion")
	private Date fechaPrescripcion;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="fecha_respuesta")
	private Date fechaRespuesta;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="fecha_solicitud")
	private Date fechaSolicitud;

	@Column(name="tipo_respuesta")
	private String tipoRespuesta;

	//bi-directional many-to-one association to CTipoMandamiento
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_tipo_mandamiento")
	private CTipoMandamiento CTipoMandamiento;

	//bi-directional many-to-one association to TDelito
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_delito")
	private TDelito TDelito;

	public TMandamientoJudicial() {
	}

	public String getIdMandamientoJudicial() {
		return this.idMandamientoJudicial;
	}

	public void setIdMandamientoJudicial(String idMandamientoJudicial) {
		this.idMandamientoJudicial = idMandamientoJudicial;
	}

	public String getEstatus() {
		return this.estatus;
	}

	public void setEstatus(String estatus) {
		this.estatus = estatus;
	}

	public Date getFechaDisposicion() {
		return this.fechaDisposicion;
	}

	public void setFechaDisposicion(Date fechaDisposicion) {
		this.fechaDisposicion = fechaDisposicion;
	}

	public Date getFechaPrescripcion() {
		return this.fechaPrescripcion;
	}

	public void setFechaPrescripcion(Date fechaPrescripcion) {
		this.fechaPrescripcion = fechaPrescripcion;
	}

	public Date getFechaRespuesta() {
		return this.fechaRespuesta;
	}

	public void setFechaRespuesta(Date fechaRespuesta) {
		this.fechaRespuesta = fechaRespuesta;
	}

	public Date getFechaSolicitud() {
		return this.fechaSolicitud;
	}

	public void setFechaSolicitud(Date fechaSolicitud) {
		this.fechaSolicitud = fechaSolicitud;
	}

	public String getTipoRespuesta() {
		return this.tipoRespuesta;
	}

	public void setTipoRespuesta(String tipoRespuesta) {
		this.tipoRespuesta = tipoRespuesta;
	}

	public CTipoMandamiento getCTipoMandamiento() {
		return this.CTipoMandamiento;
	}

	public void setCTipoMandamiento(CTipoMandamiento CTipoMandamiento) {
		this.CTipoMandamiento = CTipoMandamiento;
	}

	public TDelito getTDelito() {
		return this.TDelito;
	}

	public void setTDelito(TDelito TDelito) {
		this.TDelito = TDelito;
	}

}