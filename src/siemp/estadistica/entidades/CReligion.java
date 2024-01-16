package siemp.estadistica.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the c_religion database table.
 * 
 */
@Entity
@Table(name="c_religion")
@NamedQuery(name="CReligion.findAll", query="SELECT c FROM CReligion c")
public class CReligion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="cn_religion_id")
	private String cnReligionId;

	@Column(name="cs_religion")
	private String csReligion;

	//bi-directional many-to-one association to TPersonaUgj
	@OneToMany(mappedBy="CReligion")
	private List<TPersonaUgj> TPersonaUgjs;

	public CReligion() {
	}

	public String getCnReligionId() {
		return this.cnReligionId;
	}

	public void setCnReligionId(String cnReligionId) {
		this.cnReligionId = cnReligionId;
	}

	public String getCsReligion() {
		return this.csReligion;
	}

	public void setCsReligion(String csReligion) {
		this.csReligion = csReligion;
	}

	public List<TPersonaUgj> getTPersonaUgjs() {
		return this.TPersonaUgjs;
	}

	public void setTPersonaUgjs(List<TPersonaUgj> TPersonaUgjs) {
		this.TPersonaUgjs = TPersonaUgjs;
	}

	public TPersonaUgj addTPersonaUgj(TPersonaUgj TPersonaUgj) {
		getTPersonaUgjs().add(TPersonaUgj);
		TPersonaUgj.setCReligion(this);

		return TPersonaUgj;
	}

	public TPersonaUgj removeTPersonaUgj(TPersonaUgj TPersonaUgj) {
		getTPersonaUgjs().remove(TPersonaUgj);
		TPersonaUgj.setCReligion(null);

		return TPersonaUgj;
	}

}