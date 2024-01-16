package siemp.estadistica.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.math.BigInteger;
import java.util.List;


/**
 * The persistent class for the t_audiencia_imputado database table.
 * 
 */
@Entity
@Table(name="t_audiencia_imputado")
@NamedQuery(name="TAudienciaImputado.findAll", query="SELECT t FROM TAudienciaImputado t")
public class TAudienciaImputado implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_evento")
	private Long idEvento;

	@Column(name="aux_sala")
	private String auxSala;

	@Column(name="encargado_actas")
	private String encargadoActas;

	private String estatus;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="fecha_audiencia")
	private Date fechaAudiencia;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="fecha_conclusion")
	private Date fechaConclusion;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="fecha_inicio")
	private Date fechaInicio;

	@Column(name="id_juez")
	private int idJuez;

	@Column(name="id_tipo_registro")
	private String idTipoRegistro;

	@Column(name="id_tsjdf")
	private Long idTsjdf;

	@Lob
	private String resoluciones;

	private String sala;

	//bi-directional many-to-one association to TActoProcesal
	@OneToMany(mappedBy="TAudienciaImputado")
	private List<TActoProcesal> TActoProcesals;

	//bi-directional many-to-one association to CTipoAudiencia
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_tipo_audiencia")
	private CTipoAudiencia CTipoAudiencia;

	//bi-directional one-to-one association to TConclusion
	@OneToOne(mappedBy="TAudienciaImputado", fetch=FetchType.LAZY)
	private TConclusion TConclusion;

	//bi-directional one-to-one association to TProcedenciaAsunto
	@OneToOne(mappedBy="TAudienciaImputado", fetch=FetchType.LAZY)
	private TProcedenciaAsunto TProcedenciaAsunto;

	public TAudienciaImputado() {
	}

	public Long getIdEvento() {
		return this.idEvento;
	}

	public void setIdEvento(Long idEvento) {
		this.idEvento = idEvento;
	}

	public String getAuxSala() {
		return this.auxSala;
	}

	public void setAuxSala(String auxSala) {
		this.auxSala = auxSala;
	}

	public String getEncargadoActas() {
		return this.encargadoActas;
	}

	public void setEncargadoActas(String encargadoActas) {
		this.encargadoActas = encargadoActas;
	}

	public String getEstatus() {
		return this.estatus;
	}

	public void setEstatus(String estatus) {
		this.estatus = estatus;
	}

	public Date getFechaAudiencia() {
		return this.fechaAudiencia;
	}

	public void setFechaAudiencia(Date fechaAudiencia) {
		this.fechaAudiencia = fechaAudiencia;
	}

	public Date getFechaConclusion() {
		return this.fechaConclusion;
	}

	public void setFechaConclusion(Date fechaConclusion) {
		this.fechaConclusion = fechaConclusion;
	}

	public Date getFechaInicio() {
		return this.fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public int getIdJuez() {
		return this.idJuez;
	}

	public void setIdJuez(int idJuez) {
		this.idJuez = idJuez;
	}

	public String getIdTipoRegistro() {
		return this.idTipoRegistro;
	}

	public void setIdTipoRegistro(String idTipoRegistro) {
		this.idTipoRegistro = idTipoRegistro;
	}

	public Long getIdTsjdf() {
		return this.idTsjdf;
	}

	public void setIdTsjdf(Long idTsjdf) {
		this.idTsjdf = idTsjdf;
	}

	public String getResoluciones() {
		return this.resoluciones;
	}

	public void setResoluciones(String resoluciones) {
		this.resoluciones = resoluciones;
	}

	public String getSala() {
		return this.sala;
	}

	public void setSala(String sala) {
		this.sala = sala;
	}

	public List<TActoProcesal> getTActoProcesals() {
		return this.TActoProcesals;
	}

	public void setTActoProcesals(List<TActoProcesal> TActoProcesals) {
		this.TActoProcesals = TActoProcesals;
	}

	public TActoProcesal addTActoProcesal(TActoProcesal TActoProcesal) {
		getTActoProcesals().add(TActoProcesal);
		TActoProcesal.setTAudienciaImputado(this);

		return TActoProcesal;
	}

	public TActoProcesal removeTActoProcesal(TActoProcesal TActoProcesal) {
		getTActoProcesals().remove(TActoProcesal);
		TActoProcesal.setTAudienciaImputado(null);

		return TActoProcesal;
	}

	public CTipoAudiencia getCTipoAudiencia() {
		return this.CTipoAudiencia;
	}

	public void setCTipoAudiencia(CTipoAudiencia CTipoAudiencia) {
		this.CTipoAudiencia = CTipoAudiencia;
	}

	public TConclusion getTConclusion() {
		return this.TConclusion;
	}

	public void setTConclusion(TConclusion TConclusion) {
		this.TConclusion = TConclusion;
	}

	public TProcedenciaAsunto getTProcedenciaAsunto() {
		return this.TProcedenciaAsunto;
	}

	public void setTProcedenciaAsunto(TProcedenciaAsunto TProcedenciaAsunto) {
		this.TProcedenciaAsunto = TProcedenciaAsunto;
	}

}