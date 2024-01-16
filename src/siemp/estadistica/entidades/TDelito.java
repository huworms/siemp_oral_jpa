package siemp.estadistica.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the t_delito database table.
 * 
 */
@Entity
@Table(name="t_delito")
@NamedQuery(name="TDelito.findAll", query="SELECT t FROM TDelito t")
public class TDelito implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_delito")
	private String idDelito;

	private String comision;

	private String consignacion;

	private String estatus;

	@Column(name="mod_agr")
	private String modAgr;

	@Column(name="mod_ate")
	private String modAte;

	@Column(name="mod_cal")
	private String modCal;

	@Column(name="mod_simple")
	private String modSimple;

	@Column(name="no_cud")
	private String noCud;

	private String realizacion;

	private String situacion;

	private String violencia;

	//bi-directional many-to-one association to TBitacoraDelito
	@OneToMany(mappedBy="TDelito")
	private List<TBitacoraDelito> TBitacoraDelitos;

	//bi-directional one-to-one association to TDatoDelito
	@OneToOne(mappedBy="TDelito", fetch=FetchType.LAZY)
	private TDatoDelito TDatoDelito;

	//bi-directional many-to-one association to CDesagregado
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumns({
		@JoinColumn(name="id_desagregado", referencedColumnName="id_desagregado"),
		@JoinColumn(name="id_tipo_del", referencedColumnName="id_tipo_del")
		})
	private CDesagregado CDesagregado;

	//bi-directional many-to-one association to TImputado
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_persona")
	private TImputado TImputado;

	//bi-directional many-to-one association to TDelitoVictima
	@OneToMany(mappedBy="TDelito")
	private List<TDelitoVictima> TDelitoVictimas;

	//bi-directional many-to-one association to TMandamientoJudicial
	@OneToMany(mappedBy="TDelito")
	private List<TMandamientoJudicial> TMandamientoJudicials;

	public TDelito() {
	}

	public String getIdDelito() {
		return this.idDelito;
	}

	public void setIdDelito(String idDelito) {
		this.idDelito = idDelito;
	}

	public String getComision() {
		return this.comision;
	}

	public void setComision(String comision) {
		this.comision = comision;
	}

	public String getConsignacion() {
		return this.consignacion;
	}

	public void setConsignacion(String consignacion) {
		this.consignacion = consignacion;
	}

	public String getEstatus() {
		return this.estatus;
	}

	public void setEstatus(String estatus) {
		this.estatus = estatus;
	}

	public String getModAgr() {
		return this.modAgr;
	}

	public void setModAgr(String modAgr) {
		this.modAgr = modAgr;
	}

	public String getModAte() {
		return this.modAte;
	}

	public void setModAte(String modAte) {
		this.modAte = modAte;
	}

	public String getModCal() {
		return this.modCal;
	}

	public void setModCal(String modCal) {
		this.modCal = modCal;
	}

	public String getModSimple() {
		return this.modSimple;
	}

	public void setModSimple(String modSimple) {
		this.modSimple = modSimple;
	}

	public String getNoCud() {
		return this.noCud;
	}

	public void setNoCud(String noCud) {
		this.noCud = noCud;
	}

	public String getRealizacion() {
		return this.realizacion;
	}

	public void setRealizacion(String realizacion) {
		this.realizacion = realizacion;
	}

	public String getSituacion() {
		return this.situacion;
	}

	public void setSituacion(String situacion) {
		this.situacion = situacion;
	}

	public String getViolencia() {
		return this.violencia;
	}

	public void setViolencia(String violencia) {
		this.violencia = violencia;
	}

	public List<TBitacoraDelito> getTBitacoraDelitos() {
		return this.TBitacoraDelitos;
	}

	public void setTBitacoraDelitos(List<TBitacoraDelito> TBitacoraDelitos) {
		this.TBitacoraDelitos = TBitacoraDelitos;
	}

	public TBitacoraDelito addTBitacoraDelito(TBitacoraDelito TBitacoraDelito) {
		getTBitacoraDelitos().add(TBitacoraDelito);
		TBitacoraDelito.setTDelito(this);

		return TBitacoraDelito;
	}

	public TBitacoraDelito removeTBitacoraDelito(TBitacoraDelito TBitacoraDelito) {
		getTBitacoraDelitos().remove(TBitacoraDelito);
		TBitacoraDelito.setTDelito(null);

		return TBitacoraDelito;
	}

	public TDatoDelito getTDatoDelito() {
		return this.TDatoDelito;
	}

	public void setTDatoDelito(TDatoDelito TDatoDelito) {
		this.TDatoDelito = TDatoDelito;
	}

	public CDesagregado getCDesagregado() {
		return this.CDesagregado;
	}

	public void setCDesagregado(CDesagregado CDesagregado) {
		this.CDesagregado = CDesagregado;
	}

	public TImputado getTImputado() {
		return this.TImputado;
	}

	public void setTImputado(TImputado TImputado) {
		this.TImputado = TImputado;
	}

	public List<TDelitoVictima> getTDelitoVictimas() {
		return this.TDelitoVictimas;
	}

	public void setTDelitoVictimas(List<TDelitoVictima> TDelitoVictimas) {
		this.TDelitoVictimas = TDelitoVictimas;
	}

	public TDelitoVictima addTDelitoVictima(TDelitoVictima TDelitoVictima) {
		getTDelitoVictimas().add(TDelitoVictima);
		TDelitoVictima.setTDelito(this);

		return TDelitoVictima;
	}

	public TDelitoVictima removeTDelitoVictima(TDelitoVictima TDelitoVictima) {
		getTDelitoVictimas().remove(TDelitoVictima);
		TDelitoVictima.setTDelito(null);

		return TDelitoVictima;
	}

	public List<TMandamientoJudicial> getTMandamientoJudicials() {
		return this.TMandamientoJudicials;
	}

	public void setTMandamientoJudicials(List<TMandamientoJudicial> TMandamientoJudicials) {
		this.TMandamientoJudicials = TMandamientoJudicials;
	}

	public TMandamientoJudicial addTMandamientoJudicial(TMandamientoJudicial TMandamientoJudicial) {
		getTMandamientoJudicials().add(TMandamientoJudicial);
		TMandamientoJudicial.setTDelito(this);

		return TMandamientoJudicial;
	}

	public TMandamientoJudicial removeTMandamientoJudicial(TMandamientoJudicial TMandamientoJudicial) {
		getTMandamientoJudicials().remove(TMandamientoJudicial);
		TMandamientoJudicial.setTDelito(null);

		return TMandamientoJudicial;
	}

}