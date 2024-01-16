package siemp.estadistica.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.math.BigInteger;


/**
 * The persistent class for the t_orden_delito database table.
 * 
 */
@Entity
@Table(name="t_orden_delito")
@NamedQuery(name="TOrdenDelito.findAll", query="SELECT t FROM TOrdenDelito t")
public class TOrdenDelito implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_registro_orden")
	private String idRegistroOrden;

	private String estatus;

	@Temporal(TemporalType.DATE)
	@Column(name="fecha_disposicion")
	private Date fechaDisposicion;

	@Temporal(TemporalType.DATE)
	@Column(name="fecha_notificacion")
	private Date fechaNotificacion;

	@Temporal(TemporalType.DATE)
	@Column(name="fecha_prescripcion")
	private Date fechaPrescripcion;

	@Temporal(TemporalType.DATE)
	@Column(name="fecha_resp_otorgamiento")
	private Date fechaRespOtorgamiento;

	@Temporal(TemporalType.DATE)
	@Column(name="fecha_solicitud_mp")
	private Date fechaSolicitudMp;

	@Column(name="id_delito")
	private BigInteger idDelito;

	@Column(name="id_orden")
	private int idOrden;

	@Column(name="id_persona")
	private BigInteger idPersona;

	@Column(name="id_tsjdf")
	private BigInteger idTsjdf;

	private String notificado;

	private String otorgamiento;

	public TOrdenDelito() {
	}

	public String getIdRegistroOrden() {
		return this.idRegistroOrden;
	}

	public void setIdRegistroOrden(String idRegistroOrden) {
		this.idRegistroOrden = idRegistroOrden;
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

	public Date getFechaNotificacion() {
		return this.fechaNotificacion;
	}

	public void setFechaNotificacion(Date fechaNotificacion) {
		this.fechaNotificacion = fechaNotificacion;
	}

	public Date getFechaPrescripcion() {
		return this.fechaPrescripcion;
	}

	public void setFechaPrescripcion(Date fechaPrescripcion) {
		this.fechaPrescripcion = fechaPrescripcion;
	}

	public Date getFechaRespOtorgamiento() {
		return this.fechaRespOtorgamiento;
	}

	public void setFechaRespOtorgamiento(Date fechaRespOtorgamiento) {
		this.fechaRespOtorgamiento = fechaRespOtorgamiento;
	}

	public Date getFechaSolicitudMp() {
		return this.fechaSolicitudMp;
	}

	public void setFechaSolicitudMp(Date fechaSolicitudMp) {
		this.fechaSolicitudMp = fechaSolicitudMp;
	}

	public BigInteger getIdDelito() {
		return this.idDelito;
	}

	public void setIdDelito(BigInteger idDelito) {
		this.idDelito = idDelito;
	}

	public int getIdOrden() {
		return this.idOrden;
	}

	public void setIdOrden(int idOrden) {
		this.idOrden = idOrden;
	}

	public BigInteger getIdPersona() {
		return this.idPersona;
	}

	public void setIdPersona(BigInteger idPersona) {
		this.idPersona = idPersona;
	}

	public BigInteger getIdTsjdf() {
		return this.idTsjdf;
	}

	public void setIdTsjdf(BigInteger idTsjdf) {
		this.idTsjdf = idTsjdf;
	}

	public String getNotificado() {
		return this.notificado;
	}

	public void setNotificado(String notificado) {
		this.notificado = notificado;
	}

	public String getOtorgamiento() {
		return this.otorgamiento;
	}

	public void setOtorgamiento(String otorgamiento) {
		this.otorgamiento = otorgamiento;
	}

}