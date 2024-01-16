package siemp.estadistica.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the c_entidad_federativa_ugj database table.
 * 
 */
@Entity
@Table(name="c_entidad_federativa_ugj")
@NamedQuery(name="CEntidadFederativaUgj.findAll", query="SELECT c FROM CEntidadFederativaUgj c")
public class CEntidadFederativaUgj implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="cn_entidad_id")
	private String cnEntidadId;

	@Column(name="cs_clave")
	private String csClave;

	@Column(name="cs_entidad_federativa")
	private String csEntidadFederativa;

	//bi-directional many-to-one association to CPaisUgj
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="cn_pais_id")
	private CPaisUgj CPaisUgj;

	//bi-directional many-to-one association to CMunicipioUgj
	@OneToMany(mappedBy="CEntidadFederativaUgj")
	private List<CMunicipioUgj> CMunicipioUgjs;

	//bi-directional many-to-one association to TDomicilio
	@OneToMany(mappedBy="CEntidadFederativaUgj")
	private List<TDomicilio> TDomicilios;

	//bi-directional many-to-one association to TPersonaUgj
	@OneToMany(mappedBy="CEntidadFederativaUgj")
	private List<TPersonaUgj> TPersonaUgjs;

	public CEntidadFederativaUgj() {
	}

	public String getCnEntidadId() {
		return this.cnEntidadId;
	}

	public void setCnEntidadId(String cnEntidadId) {
		this.cnEntidadId = cnEntidadId;
	}

	public String getCsClave() {
		return this.csClave;
	}

	public void setCsClave(String csClave) {
		this.csClave = csClave;
	}

	public String getCsEntidadFederativa() {
		return this.csEntidadFederativa;
	}

	public void setCsEntidadFederativa(String csEntidadFederativa) {
		this.csEntidadFederativa = csEntidadFederativa;
	}

	public CPaisUgj getCPaisUgj() {
		return this.CPaisUgj;
	}

	public void setCPaisUgj(CPaisUgj CPaisUgj) {
		this.CPaisUgj = CPaisUgj;
	}

	public List<CMunicipioUgj> getCMunicipioUgjs() {
		return this.CMunicipioUgjs;
	}

	public void setCMunicipioUgjs(List<CMunicipioUgj> CMunicipioUgjs) {
		this.CMunicipioUgjs = CMunicipioUgjs;
	}

	public CMunicipioUgj addCMunicipioUgj(CMunicipioUgj CMunicipioUgj) {
		getCMunicipioUgjs().add(CMunicipioUgj);
		CMunicipioUgj.setCEntidadFederativaUgj(this);

		return CMunicipioUgj;
	}

	public CMunicipioUgj removeCMunicipioUgj(CMunicipioUgj CMunicipioUgj) {
		getCMunicipioUgjs().remove(CMunicipioUgj);
		CMunicipioUgj.setCEntidadFederativaUgj(null);

		return CMunicipioUgj;
	}

	public List<TDomicilio> getTDomicilios() {
		return this.TDomicilios;
	}

	public void setTDomicilios(List<TDomicilio> TDomicilios) {
		this.TDomicilios = TDomicilios;
	}

	public TDomicilio addTDomicilio(TDomicilio TDomicilio) {
		getTDomicilios().add(TDomicilio);
		TDomicilio.setCEntidadFederativaUgj(this);

		return TDomicilio;
	}

	public TDomicilio removeTDomicilio(TDomicilio TDomicilio) {
		getTDomicilios().remove(TDomicilio);
		TDomicilio.setCEntidadFederativaUgj(null);

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
		TPersonaUgj.setCEntidadFederativaUgj(this);

		return TPersonaUgj;
	}

	public TPersonaUgj removeTPersonaUgj(TPersonaUgj TPersonaUgj) {
		getTPersonaUgjs().remove(TPersonaUgj);
		TPersonaUgj.setCEntidadFederativaUgj(null);

		return TPersonaUgj;
	}

}