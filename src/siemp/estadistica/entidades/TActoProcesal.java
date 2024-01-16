package siemp.estadistica.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigInteger;
import java.util.List;


/**
 * The persistent class for the t_acto_procesal database table.
 * 
 */
@Entity
@Table(name="t_acto_procesal")
@NamedQuery(name="TActoProcesal.findAll", query="SELECT t FROM TActoProcesal t")
public class TActoProcesal implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_acto_procesal")
	private String idActoProcesal;

	private String estatus;

	@Column(name="id_persona")
	private Long idPersona;

	//bi-directional many-to-one association to CTipoActo
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_tipo_acto")
	private CTipoActo CTipoActo;

	//bi-directional many-to-one association to TAudienciaImputado
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_evento")
	private TAudienciaImputado TAudienciaImputado;

	//bi-directional one-to-one association to TAperturaJuicio
	@OneToOne(mappedBy="TActoProcesal", fetch=FetchType.LAZY)
	private TAperturaJuicio TAperturaJuicio;

	//bi-directional one-to-one association to TAudienciaInicial
	@OneToOne(mappedBy="TActoProcesal", fetch=FetchType.LAZY)
	private TAudienciaInicial TAudienciaInicial;

	//bi-directional many-to-one association to TDetencionLegal
	@OneToMany(mappedBy="TActoProcesal")
	private List<TDetencionLegal> TDetencionLegals;

	//bi-directional many-to-one association to TEmisionFallo
	@OneToMany(mappedBy="TActoProcesal")
	private List<TEmisionFallo> TEmisionFallos;

	//bi-directional one-to-one association to TSentencia
	@OneToOne(mappedBy="TActoProcesal", fetch=FetchType.LAZY)
	private TSentencia TSentencia;

	//bi-directional one-to-one association to TSolucionAlterna
	@OneToOne(mappedBy="TActoProcesal", fetch=FetchType.LAZY)
	private TSolucionAlterna TSolucionAlterna;

	//bi-directional many-to-one association to TVinculacionProceso
	@OneToMany(mappedBy="TActoProcesal")
	private List<TVinculacionProceso> TVinculacionProcesos;

	public TActoProcesal() {
	}

	public String getIdActoProcesal() {
		return this.idActoProcesal;
	}

	public void setIdActoProcesal(String idActoProcesal) {
		this.idActoProcesal = idActoProcesal;
	}

	public String getEstatus() {
		return this.estatus;
	}

	public void setEstatus(String estatus) {
		this.estatus = estatus;
	}

	public Long getIdPersona() {
		return this.idPersona;
	}

	public void setIdPersona(Long idPersona) {
		this.idPersona = idPersona;
	}

	public CTipoActo getCTipoActo() {
		return this.CTipoActo;
	}

	public void setCTipoActo(CTipoActo CTipoActo) {
		this.CTipoActo = CTipoActo;
	}

	public TAudienciaImputado getTAudienciaImputado() {
		return this.TAudienciaImputado;
	}

	public void setTAudienciaImputado(TAudienciaImputado TAudienciaImputado) {
		this.TAudienciaImputado = TAudienciaImputado;
	}

	public TAperturaJuicio getTAperturaJuicio() {
		return this.TAperturaJuicio;
	}

	public void setTAperturaJuicio(TAperturaJuicio TAperturaJuicio) {
		this.TAperturaJuicio = TAperturaJuicio;
	}

	public TAudienciaInicial getTAudienciaInicial() {
		return this.TAudienciaInicial;
	}

	public void setTAudienciaInicial(TAudienciaInicial TAudienciaInicial) {
		this.TAudienciaInicial = TAudienciaInicial;
	}

	public List<TDetencionLegal> getTDetencionLegals() {
		return this.TDetencionLegals;
	}

	public void setTDetencionLegals(List<TDetencionLegal> TDetencionLegals) {
		this.TDetencionLegals = TDetencionLegals;
	}

	public TDetencionLegal addTDetencionLegal(TDetencionLegal TDetencionLegal) {
		getTDetencionLegals().add(TDetencionLegal);
		TDetencionLegal.setTActoProcesal(this);

		return TDetencionLegal;
	}

	public TDetencionLegal removeTDetencionLegal(TDetencionLegal TDetencionLegal) {
		getTDetencionLegals().remove(TDetencionLegal);
		TDetencionLegal.setTActoProcesal(null);

		return TDetencionLegal;
	}

	public List<TEmisionFallo> getTEmisionFallos() {
		return this.TEmisionFallos;
	}

	public void setTEmisionFallos(List<TEmisionFallo> TEmisionFallos) {
		this.TEmisionFallos = TEmisionFallos;
	}

	public TEmisionFallo addTEmisionFallo(TEmisionFallo TEmisionFallo) {
		getTEmisionFallos().add(TEmisionFallo);
		TEmisionFallo.setTActoProcesal(this);

		return TEmisionFallo;
	}

	public TEmisionFallo removeTEmisionFallo(TEmisionFallo TEmisionFallo) {
		getTEmisionFallos().remove(TEmisionFallo);
		TEmisionFallo.setTActoProcesal(null);

		return TEmisionFallo;
	}

	public TSentencia getTSentencia() {
		return this.TSentencia;
	}

	public void setTSentencia(TSentencia TSentencia) {
		this.TSentencia = TSentencia;
	}

	public TSolucionAlterna getTSolucionAlterna() {
		return this.TSolucionAlterna;
	}

	public void setTSolucionAlterna(TSolucionAlterna TSolucionAlterna) {
		this.TSolucionAlterna = TSolucionAlterna;
	}

	public List<TVinculacionProceso> getTVinculacionProcesos() {
		return this.TVinculacionProcesos;
	}

	public void setTVinculacionProcesos(List<TVinculacionProceso> TVinculacionProcesos) {
		this.TVinculacionProcesos = TVinculacionProcesos;
	}

	public TVinculacionProceso addTVinculacionProceso(TVinculacionProceso TVinculacionProceso) {
		getTVinculacionProcesos().add(TVinculacionProceso);
		TVinculacionProceso.setTActoProcesal(this);

		return TVinculacionProceso;
	}

	public TVinculacionProceso removeTVinculacionProceso(TVinculacionProceso TVinculacionProceso) {
		getTVinculacionProcesos().remove(TVinculacionProceso);
		TVinculacionProceso.setTActoProcesal(null);

		return TVinculacionProceso;
	}

}