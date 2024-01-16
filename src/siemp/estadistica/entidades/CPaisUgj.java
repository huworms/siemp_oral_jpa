package siemp.estadistica.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the c_pais_ugj database table.
 * 
 */
@Entity
@Table(name="c_pais_ugj")
@NamedQuery(name="CPaisUgj.findAll", query="SELECT c FROM CPaisUgj c")
public class CPaisUgj implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="cn_pais_id")
	private String cnPaisId;

	@Column(name="cs_clave")
	private String csClave;

	@Column(name="cs_pais")
	private String csPais;

	//bi-directional many-to-one association to CEntidadFederativaUgj
	@OneToMany(mappedBy="CPaisUgj")
	private List<CEntidadFederativaUgj> CEntidadFederativaUgjs;

	//bi-directional many-to-one association to CContinente
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="cn_continente_id")
	private CContinente CContinente;

	//bi-directional many-to-one association to CNacionalidadUgj
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="cn_nacionalidad_id")
	private CNacionalidadUgj CNacionalidadUgj;

	//bi-directional many-to-one association to TDomicilio
	@OneToMany(mappedBy="CPaisUgj")
	private List<TDomicilio> TDomicilios;

	//bi-directional many-to-one association to TPersonaUgj
	@OneToMany(mappedBy="CPaisUgj")
	private List<TPersonaUgj> TPersonaUgjs;

	public CPaisUgj() {
	}

	public String getCnPaisId() {
		return this.cnPaisId;
	}

	public void setCnPaisId(String cnPaisId) {
		this.cnPaisId = cnPaisId;
	}

	public String getCsClave() {
		return this.csClave;
	}

	public void setCsClave(String csClave) {
		this.csClave = csClave;
	}

	public String getCsPais() {
		return this.csPais;
	}

	public void setCsPais(String csPais) {
		this.csPais = csPais;
	}

	public List<CEntidadFederativaUgj> getCEntidadFederativaUgjs() {
		return this.CEntidadFederativaUgjs;
	}

	public void setCEntidadFederativaUgjs(List<CEntidadFederativaUgj> CEntidadFederativaUgjs) {
		this.CEntidadFederativaUgjs = CEntidadFederativaUgjs;
	}

	public CEntidadFederativaUgj addCEntidadFederativaUgj(CEntidadFederativaUgj CEntidadFederativaUgj) {
		getCEntidadFederativaUgjs().add(CEntidadFederativaUgj);
		CEntidadFederativaUgj.setCPaisUgj(this);

		return CEntidadFederativaUgj;
	}

	public CEntidadFederativaUgj removeCEntidadFederativaUgj(CEntidadFederativaUgj CEntidadFederativaUgj) {
		getCEntidadFederativaUgjs().remove(CEntidadFederativaUgj);
		CEntidadFederativaUgj.setCPaisUgj(null);

		return CEntidadFederativaUgj;
	}

	public CContinente getCContinente() {
		return this.CContinente;
	}

	public void setCContinente(CContinente CContinente) {
		this.CContinente = CContinente;
	}

	public CNacionalidadUgj getCNacionalidadUgj() {
		return this.CNacionalidadUgj;
	}

	public void setCNacionalidadUgj(CNacionalidadUgj CNacionalidadUgj) {
		this.CNacionalidadUgj = CNacionalidadUgj;
	}

	public List<TDomicilio> getTDomicilios() {
		return this.TDomicilios;
	}

	public void setTDomicilios(List<TDomicilio> TDomicilios) {
		this.TDomicilios = TDomicilios;
	}

	public TDomicilio addTDomicilio(TDomicilio TDomicilio) {
		getTDomicilios().add(TDomicilio);
		TDomicilio.setCPaisUgj(this);

		return TDomicilio;
	}

	public TDomicilio removeTDomicilio(TDomicilio TDomicilio) {
		getTDomicilios().remove(TDomicilio);
		TDomicilio.setCPaisUgj(null);

		return TDomicilio;
	}

	public List<TPersonaUgj> getTPersonaUgjs() {
		return this.TPersonaUgjs;
	}

	public void setTPersonaUgjs(List<TPersonaUgj> TPersonaUgjs) {
		this.TPersonaUgjs = TPersonaUgjs;
	}

	public TPersonaUgj addTPersonaUgj(TPersonaUgj TPersonaUgj) {
		getTPersonaUgjs().add(TPersonaUgj);
		TPersonaUgj.setCPaisUgj(this);

		return TPersonaUgj;
	}

	public TPersonaUgj removeTPersonaUgj(TPersonaUgj TPersonaUgj) {
		getTPersonaUgjs().remove(TPersonaUgj);
		TPersonaUgj.setCPaisUgj(null);

		return TPersonaUgj;
	}

}