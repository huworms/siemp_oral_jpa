package siemp.estadistica.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the t_apelacion database table.
 * 
 */
@Entity
@Table(name="t_apelacion")
@NamedQuery(name="TApelacion.findAll", query="SELECT t FROM TApelacion t")
public class TApelacion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_apelacion")
	private int idApelacion;

	private int causa;

	private String estatus;

	@Temporal(TemporalType.DATE)
	@Column(name="fecha_envio")
	private Date fechaEnvio;

	@Temporal(TemporalType.DATE)
	@Column(name="fecha_presentacion")
	private Date fechaPresentacion;

	@Column(name="fecha_retorno")
	private String fechaRetorno;

	@Column(name="id_resolucion")
	private int idResolucion;

	@Column(name="id_sala")
	private int idSala;

	@Column(name="num_toca")
	private String numToca;

	@Column(name="otra_causa")
	private String otraCausa;

	private String solicitud;

	//bi-directional many-to-one association to TSituacionPersona
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumns({
		@JoinColumn(name="id_persona", referencedColumnName="id_persona"),
		@JoinColumn(name="id_tsjdf", referencedColumnName="id_tsjdf")
		})
	private TSituacionPersona TSituacionPersona;

	public TApelacion() {
	}

	public int getIdApelacion() {
		return this.idApelacion;
	}

	public void setIdApelacion(int idApelacion) {
		this.idApelacion = idApelacion;
	}

	public int getCausa() {
		return this.causa;
	}

	public void setCausa(int causa) {
		this.causa = causa;
	}

	public String getEstatus() {
		return this.estatus;
	}

	public void setEstatus(String estatus) {
		this.estatus = estatus;
	}

	public Date getFechaEnvio() {
		return this.fechaEnvio;
	}

	public void setFechaEnvio(Date fechaEnvio) {
		this.fechaEnvio = fechaEnvio;
	}

	public Date getFechaPresentacion() {
		return this.fechaPresentacion;
	}

	public void setFechaPresentacion(Date fechaPresentacion) {
		this.fechaPresentacion = fechaPresentacion;
	}

	public String getFechaRetorno() {
		return this.fechaRetorno;
	}

	public void setFechaRetorno(String fechaRetorno) {
		this.fechaRetorno = fechaRetorno;
	}

	public int getIdResolucion() {
		return this.idResolucion;
	}

	public void setIdResolucion(int idResolucion) {
		this.idResolucion = idResolucion;
	}

	public int getIdSala() {
		return this.idSala;
	}

	public void setIdSala(int idSala) {
		this.idSala = idSala;
	}

	public String getNumToca() {
		return this.numToca;
	}

	public void setNumToca(String numToca) {
		this.numToca = numToca;
	}

	public String getOtraCausa() {
		return this.otraCausa;
	}

	public void setOtraCausa(String otraCausa) {
		this.otraCausa = otraCausa;
	}

	public String getSolicitud() {
		return this.solicitud;
	}

	public void setSolicitud(String solicitud) {
		this.solicitud = solicitud;
	}

	public TSituacionPersona getTSituacionPersona() {
		return this.TSituacionPersona;
	}

	public void setTSituacionPersona(TSituacionPersona TSituacionPersona) {
		this.TSituacionPersona = TSituacionPersona;
	}

}