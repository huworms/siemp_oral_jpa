package siemp.estadistica.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the t_ingreso database table.
 * 
 */
@Entity
@Table(name="t_ingreso")
@NamedQuery(name="TIngreso.findAll", query="SELECT t FROM TIngreso t")
public class TIngreso implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TIngresoPK id;

	@Column(name="anio_carpeta")
	private int anioCarpeta;

	private char estatus;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="fecha_registro")
	private Date fechaRegistro;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="fecha_solicitud_audiencia")
	private Date fechaSolicitudAudiencia;

	@Column(name="num_carpeta_admin")
	private int numCarpetaAdmin;

	@Column(name="num_partida")
	private String numPartida;

	@Column(name="otro_tipo_asunto")
	private String otroTipoAsunto;

	private String reporte;

	@Column(name="situacion_expediente")
	private int situacionExpediente;

	//bi-directional many-to-one association to CEntidad
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_entidad", insertable=false, updatable=false)
	private CEntidad CEntidad;

	//bi-directional many-to-one association to CTipoAsunto
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_tipo_asunto")
	private CTipoAsunto CTipoAsunto;

	//bi-directional many-to-one association to TTsjdf
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_tsjdf", insertable=false, updatable=false)
	private TTsjdf TTsjdf;

	public TIngreso() {
	}

	public TIngresoPK getId() {
		return this.id;
	}

	public void setId(TIngresoPK id) {
		this.id = id;
	}

	public int getAnioCarpeta() {
		return this.anioCarpeta;
	}

	public void setAnioCarpeta(int anioCarpeta) {
		this.anioCarpeta = anioCarpeta;
	}

	public char getEstatus() {
		return this.estatus;
	}

	public void setEstatus(char estatus) {
		this.estatus = estatus;
	}

	public Date getFechaRegistro() {
		return this.fechaRegistro;
	}

	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	public Date getFechaSolicitudAudiencia() {
		return this.fechaSolicitudAudiencia;
	}

	public void setFechaSolicitudAudiencia(Date fechaSolicitudAudiencia) {
		this.fechaSolicitudAudiencia = fechaSolicitudAudiencia;
	}

	public int getNumCarpetaAdmin() {
		return this.numCarpetaAdmin;
	}

	public void setNumCarpetaAdmin(int numCarpetaAdmin) {
		this.numCarpetaAdmin = numCarpetaAdmin;
	}

	public String getNumPartida() {
		return this.numPartida;
	}

	public void setNumPartida(String numPartida) {
		this.numPartida = numPartida;
	}

	public String getOtroTipoAsunto() {
		return this.otroTipoAsunto;
	}

	public void setOtroTipoAsunto(String otroTipoAsunto) {
		this.otroTipoAsunto = otroTipoAsunto;
	}

	public String getReporte() {
		return this.reporte;
	}

	public void setReporte(String reporte) {
		this.reporte = reporte;
	}

	public int getSituacionExpediente() {
		return this.situacionExpediente;
	}

	public void setSituacionExpediente(int situacionExpediente) {
		this.situacionExpediente = situacionExpediente;
	}

	public CEntidad getCEntidad() {
		return this.CEntidad;
	}

	public void setCEntidad(CEntidad CEntidad) {
		this.CEntidad = CEntidad;
	}

	public CTipoAsunto getCTipoAsunto() {
		return this.CTipoAsunto;
	}

	public void setCTipoAsunto(CTipoAsunto CTipoAsunto) {
		this.CTipoAsunto = CTipoAsunto;
	}

	public TTsjdf getTTsjdf() {
		return this.TTsjdf;
	}

	public void setTTsjdf(TTsjdf TTsjdf) {
		this.TTsjdf = TTsjdf;
	}

}