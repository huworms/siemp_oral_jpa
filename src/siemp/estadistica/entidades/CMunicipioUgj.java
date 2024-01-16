package siemp.estadistica.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the c_municipio_ugj database table.
 * 
 */
@Entity
@Table(name="c_municipio_ugj")
@NamedQuery(name="CMunicipioUgj.findAll", query="SELECT c FROM CMunicipioUgj c")
public class CMunicipioUgj implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="cn_municipio_id")
	private String cnMunicipioId;

	@Column(name="cs_clave")
	private String csClave;

	@Column(name="cs_municipio")
	private String csMunicipio;

	//bi-directional many-to-one association to CEntidadFederativaUgj
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="cn_entidad_id")
	private CEntidadFederativaUgj CEntidadFederativaUgj;

	//bi-directional many-to-one association to TDomicilio
	@OneToMany(mappedBy="CMunicipioUgj")
	private List<TDomicilio> TDomicilios;

	//bi-directional many-to-one association to TPersonaUgj
	@OneToMany(mappedBy="CMunicipioUgj")
	private List<TPersonaUgj> TPersonaUgjs;

	public CMunicipioUgj() {
	}

	public String getCnMunicipioId() {
		return this.cnMunicipioId;
	}

	public void setCnMunicipioId(String cnMunicipioId) {
		this.cnMunicipioId = cnMunicipioId;
	}

	public String getCsClave() {
		return this.csClave;
	}

	public void setCsClave(String csClave) {
		this.csClave = csClave;
	}

	public String getCsMunicipio() {
		return this.csMunicipio;
	}

	public void setCsMunicipio(String csMunicipio) {
		this.csMunicipio = csMunicipio;
	}

	public CEntidadFederativaUgj getCEntidadFederativaUgj() {
		return this.CEntidadFederativaUgj;
	}

	public void setCEntidadFederativaUgj(CEntidadFederativaUgj CEntidadFederativaUgj) {
		this.CEntidadFederativaUgj = CEntidadFederativaUgj;
	}

	public List<TDomicilio> getTDomicilios() {
		return this.TDomicilios;
	}

	public void setTDomicilios(List<TDomicilio> TDomicilios) {
		this.TDomicilios = TDomicilios;
	}

	public TDomicilio addTDomicilio(TDomicilio TDomicilio) {
		getTDomicilios().add(TDomicilio);
		TDomicilio.setCMunicipioUgj(this);

		return TDomicilio;
	}

	public TDomicilio removeTDomicilio(TDomicilio TDomicilio) {
		getTDomicilios().remove(TDomicilio);
		TDomicilio.setCMunicipioUgj(null);

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
		TPersonaUgj.setCMunicipioUgj(this);

		return TPersonaUgj;
	}

	public TPersonaUgj removeTPersonaUgj(TPersonaUgj TPersonaUgj) {
		getTPersonaUgjs().remove(TPersonaUgj);
		TPersonaUgj.setCMunicipioUgj(null);

		return TPersonaUgj;
	}

}