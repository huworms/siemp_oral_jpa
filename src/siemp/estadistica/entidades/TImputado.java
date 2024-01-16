package siemp.estadistica.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the t_imputado database table.
 * 
 */
@Entity
@Table(name="t_imputado")
@NamedQuery(name="TImputado.findAll", query="SELECT t FROM TImputado t")
public class TImputado implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_persona")
	private Long idPersona;

	private String complemento;

	private String consignacion;

	@Column(name="etapa_actual")
	private Integer etapaActual;

	private String reincidente;

	@Column(name="situacion_libertad")
	private String situacionLibertad;

	//bi-directional many-to-one association to TBitacoraLibertad
	@OneToMany(mappedBy="TImputado")
	private List<TBitacoraLibertad> TBitacoraLibertads;

	//bi-directional many-to-one association to TDelito
	@OneToMany(mappedBy="TImputado")
	private List<TDelito> TDelitos;

	//bi-directional many-to-one association to CGradoParticipacion
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_grado_participacion")
	private CGradoParticipacion CGradoParticipacion;

	//bi-directional one-to-one association to TPersona
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_persona")
	private TPersona TPersona;

	public TImputado() {
	}

	public Long getIdPersona() {
		return this.idPersona;
	}

	public void setIdPersona(Long idPersona) {
		this.idPersona = idPersona;
	}

	public String getComplemento() {
		return this.complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getConsignacion() {
		return this.consignacion;
	}

	public void setConsignacion(String consignacion) {
		this.consignacion = consignacion;
	}

	public Integer getEtapaActual() {
		return this.etapaActual;
	}

	public void setEtapaActual(Integer etapaActual) {
		this.etapaActual = etapaActual;
	}

	public String getReincidente() {
		return this.reincidente;
	}

	public void setReincidente(String reincidente) {
		this.reincidente = reincidente;
	}

	public String getSituacionLibertad() {
		return this.situacionLibertad;
	}

	public void setSituacionLibertad(String situacionLibertad) {
		this.situacionLibertad = situacionLibertad;
	}

	public List<TBitacoraLibertad> getTBitacoraLibertads() {
		return this.TBitacoraLibertads;
	}

	public void setTBitacoraLibertads(List<TBitacoraLibertad> TBitacoraLibertads) {
		this.TBitacoraLibertads = TBitacoraLibertads;
	}

	public TBitacoraLibertad addTBitacoraLibertad(TBitacoraLibertad TBitacoraLibertad) {
		getTBitacoraLibertads().add(TBitacoraLibertad);
		TBitacoraLibertad.setTImputado(this);

		return TBitacoraLibertad;
	}

	public TBitacoraLibertad removeTBitacoraLibertad(TBitacoraLibertad TBitacoraLibertad) {
		getTBitacoraLibertads().remove(TBitacoraLibertad);
		TBitacoraLibertad.setTImputado(null);

		return TBitacoraLibertad;
	}

	public List<TDelito> getTDelitos() {
		return this.TDelitos;
	}

	public void setTDelitos(List<TDelito> TDelitos) {
		this.TDelitos = TDelitos;
	}

	public TDelito addTDelito(TDelito TDelito) {
		getTDelitos().add(TDelito);
		TDelito.setTImputado(this);

		return TDelito;
	}

	public TDelito removeTDelito(TDelito TDelito) {
		getTDelitos().remove(TDelito);
		TDelito.setTImputado(null);

		return TDelito;
	}

	public CGradoParticipacion getCGradoParticipacion() {
		return this.CGradoParticipacion;
	}

	public void setCGradoParticipacion(CGradoParticipacion CGradoParticipacion) {
		this.CGradoParticipacion = CGradoParticipacion;
	}

	public TPersona getTPersona() {
		return this.TPersona;
	}

	public void setTPersona(TPersona TPersona) {
		this.TPersona = TPersona;
	}

}