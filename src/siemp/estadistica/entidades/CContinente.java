package siemp.estadistica.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the c_continente database table.
 * 
 */
@Entity
@Table(name="c_continente")
@NamedQuery(name="CContinente.findAll", query="SELECT c FROM CContinente c")
public class CContinente implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="cn_continente_id")
	private String cnContinenteId;

	@Column(name="cs_clave")
	private String csClave;

	@Column(name="cs_continente")
	private String csContinente;

	//bi-directional many-to-one association to CPaisUgj
	@OneToMany(mappedBy="CContinente")
	private List<CPaisUgj> CPaisUgjs;

	public CContinente() {
	}

	public String getCnContinenteId() {
		return this.cnContinenteId;
	}

	public void setCnContinenteId(String cnContinenteId) {
		this.cnContinenteId = cnContinenteId;
	}

	public String getCsClave() {
		return this.csClave;
	}

	public void setCsClave(String csClave) {
		this.csClave = csClave;
	}

	public String getCsContinente() {
		return this.csContinente;
	}

	public void setCsContinente(String csContinente) {
		this.csContinente = csContinente;
	}

	public List<CPaisUgj> getCPaisUgjs() {
		return this.CPaisUgjs;
	}

	public void setCPaisUgjs(List<CPaisUgj> CPaisUgjs) {
		this.CPaisUgjs = CPaisUgjs;
	}

	public CPaisUgj addCPaisUgj(CPaisUgj CPaisUgj) {
		getCPaisUgjs().add(CPaisUgj);
		CPaisUgj.setCContinente(this);

		return CPaisUgj;
	}

	public CPaisUgj removeCPaisUgj(CPaisUgj CPaisUgj) {
		getCPaisUgjs().remove(CPaisUgj);
		CPaisUgj.setCContinente(null);

		return CPaisUgj;
	}

}