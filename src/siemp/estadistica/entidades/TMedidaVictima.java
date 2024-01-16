package siemp.estadistica.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.math.BigInteger;


/**
 * The persistent class for the t_medida_victima database table.
 * 
 */
@Entity
@Table(name="t_medida_victima")
@NamedQuery(name="TMedidaVictima.findAll", query="SELECT t FROM TMedidaVictima t")
public class TMedidaVictima implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_medida_cautelar")
	private Long idMedidaCautelar;

	private String estatus;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="fecha_audiencia_acuerdo")
	private Date fechaAudienciaAcuerdo;

	@Temporal(TemporalType.DATE)
	@Column(name="fecha_fin")
	private Date fechaFin;

	@Temporal(TemporalType.DATE)
	@Column(name="fecha_inicio")
	private Date fechaInicio;

	@Temporal(TemporalType.DATE)
	@Column(name="fecha_solicitud_medida")
	private Date fechaSolicitudMedida;

	@Column(name="id_persona")
	private Long idPersona;

	@Column(name="id_tipo_medida")
	private int idTipoMedida;

	@Column(name="id_tsjdf")
	private Long idTsjdf;

	private String otorgamiento;

	public TMedidaVictima() {
	}

	public Long getIdMedidaCautelar() {
		return this.idMedidaCautelar;
	}

	public void setIdMedidaCautelar(Long idMedidaCautelar) {
		this.idMedidaCautelar = idMedidaCautelar;
	}

	public String getEstatus() {
		return this.estatus;
	}

	public void setEstatus(String estatus) {
		this.estatus = estatus;
	}

	public Date getFechaAudienciaAcuerdo() {
		return this.fechaAudienciaAcuerdo;
	}

	public void setFechaAudienciaAcuerdo(Date fechaAudienciaAcuerdo) {
		this.fechaAudienciaAcuerdo = fechaAudienciaAcuerdo;
	}

	public Date getFechaFin() {
		return this.fechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}

	public Date getFechaInicio() {
		return this.fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Date getFechaSolicitudMedida() {
		return this.fechaSolicitudMedida;
	}

	public void setFechaSolicitudMedida(Date fechaSolicitudMedida) {
		this.fechaSolicitudMedida = fechaSolicitudMedida;
	}

	public Long getIdPersona() {
		return this.idPersona;
	}

	public void setIdPersona(Long idPersona) {
		this.idPersona = idPersona;
	}

	public int getIdTipoMedida() {
		return this.idTipoMedida;
	}

	public void setIdTipoMedida(int idTipoMedida) {
		this.idTipoMedida = idTipoMedida;
	}

	public Long getIdTsjdf() {
		return this.idTsjdf;
	}

	public void setIdTsjdf(Long idTsjdf) {
		this.idTsjdf = idTsjdf;
	}

	public String getOtorgamiento() {
		return this.otorgamiento;
	}

	public void setOtorgamiento(String otorgamiento) {
		this.otorgamiento = otorgamiento;
	}

}