package siemp.estadistica.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.math.BigInteger;
import java.util.List;


/**
 * The persistent class for the t_medida database table.
 * 
 */
@Entity
@Table(name="t_medida")
@NamedQuery(name="TMedida.findAll", query="SELECT t FROM TMedida t")
public class TMedida implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_medida_cautelar")
	private String idMedidaCautelar;

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
	private BigInteger idPersona;

	@Column(name="id_tsjdf")
	private BigInteger idTsjdf;

	private String otorgamiento;

	//bi-directional many-to-one association to TBitacoraMedidaCautelar
	@OneToMany(mappedBy="TMedida")
	private List<TBitacoraMedidaCautelar> TBitacoraMedidaCautelars;

	//bi-directional many-to-one association to CTipoMedida
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_tipo_medida")
	private CTipoMedida CTipoMedida;

	public TMedida() {
	}

	public String getIdMedidaCautelar() {
		return this.idMedidaCautelar;
	}

	public void setIdMedidaCautelar(String idMedidaCautelar) {
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

	public String getOtorgamiento() {
		return this.otorgamiento;
	}

	public void setOtorgamiento(String otorgamiento) {
		this.otorgamiento = otorgamiento;
	}

	public List<TBitacoraMedidaCautelar> getTBitacoraMedidaCautelars() {
		return this.TBitacoraMedidaCautelars;
	}

	public void setTBitacoraMedidaCautelars(List<TBitacoraMedidaCautelar> TBitacoraMedidaCautelars) {
		this.TBitacoraMedidaCautelars = TBitacoraMedidaCautelars;
	}

	public TBitacoraMedidaCautelar addTBitacoraMedidaCautelar(TBitacoraMedidaCautelar TBitacoraMedidaCautelar) {
		getTBitacoraMedidaCautelars().add(TBitacoraMedidaCautelar);
		TBitacoraMedidaCautelar.setTMedida(this);

		return TBitacoraMedidaCautelar;
	}

	public TBitacoraMedidaCautelar removeTBitacoraMedidaCautelar(TBitacoraMedidaCautelar TBitacoraMedidaCautelar) {
		getTBitacoraMedidaCautelars().remove(TBitacoraMedidaCautelar);
		TBitacoraMedidaCautelar.setTMedida(null);

		return TBitacoraMedidaCautelar;
	}

	public CTipoMedida getCTipoMedida() {
		return this.CTipoMedida;
	}

	public void setCTipoMedida(CTipoMedida CTipoMedida) {
		this.CTipoMedida = CTipoMedida;
	}

}