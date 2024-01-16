package siemp.estadistica.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the c_lengua_extranjera database table.
 * 
 */
@Entity
@Table(name="c_lengua_extranjera")
@NamedQuery(name="CLenguaExtranjera.findAll", query="SELECT c FROM CLenguaExtranjera c")
public class CLenguaExtranjera implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="cn_lengua_extranjera_id")
	private String cnLenguaExtranjeraId;

	@Column(name="cs_clave")
	private String csClave;

	@Column(name="cs_lengua_extranjera")
	private String csLenguaExtranjera;

	//bi-directional many-to-one association to TPersonaUgj
	@OneToMany(mappedBy="CLenguaExtranjera")
	private List<TPersonaUgj> TPersonaUgjs;

	public CLenguaExtranjera() {
	}

	public String getCnLenguaExtranjeraId() {
		return this.cnLenguaExtranjeraId;
	}

	public void setCnLenguaExtranjeraId(String cnLenguaExtranjeraId) {
		this.cnLenguaExtranjeraId = cnLenguaExtranjeraId;
	}

	public String getCsClave() {
		return this.csClave;
	}

	public void setCsClave(String csClave) {
		this.csClave = csClave;
	}

	public String getCsLenguaExtranjera() {
		return this.csLenguaExtranjera;
	}

	public void setCsLenguaExtranjera(String csLenguaExtranjera) {
		this.csLenguaExtranjera = csLenguaExtranjera;
	}

	public List<TPersonaUgj> getTPersonaUgjs() {
		return this.TPersonaUgjs;
	}

	public void setTPersonaUgjs(List<TPersonaUgj> TPersonaUgjs) {
		this.TPersonaUgjs = TPersonaUgjs;
	}

	public TPersonaUgj addTPersonaUgj(TPersonaUgj TPersonaUgj) {
		getTPersonaUgjs().add(TPersonaUgj);
		TPersonaUgj.setCLenguaExtranjera(this);

		return TPersonaUgj;
	}

	public TPersonaUgj removeTPersonaUgj(TPersonaUgj TPersonaUgj) {
		getTPersonaUgjs().remove(TPersonaUgj);
		TPersonaUgj.setCLenguaExtranjera(null);

		return TPersonaUgj;
	}

}