package siemp.estadistica.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the c_nacionalidad_ugj database table.
 * 
 */
@Entity
@Table(name="c_nacionalidad_ugj")
@NamedQuery(name="CNacionalidadUgj.findAll", query="SELECT c FROM CNacionalidadUgj c")
public class CNacionalidadUgj implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="cn_nacionalidad_id")
	private String cnNacionalidadId;

	@Column(name="cs_abreviatura")
	private String csAbreviatura;

	@Column(name="cs_clave")
	private String csClave;

	@Column(name="cs_pais")
	private String csPais;

	//bi-directional many-to-one association to COtro
	@OneToMany(mappedBy="CNacionalidadUgj")
	private List<COtro> COtros;

	//bi-directional many-to-one association to CPaisUgj
	@OneToMany(mappedBy="CNacionalidadUgj")
	private List<CPaisUgj> CPaisUgjs;

	//bi-directional many-to-one association to TPersonaUgj
	@OneToMany(mappedBy="CNacionalidadUgj")
	private List<TPersonaUgj> TPersonaUgjs;

	public CNacionalidadUgj() {
	}

	public String getCnNacionalidadId() {
		return this.cnNacionalidadId;
	}

	public void setCnNacionalidadId(String cnNacionalidadId) {
		this.cnNacionalidadId = cnNacionalidadId;
	}

	public String getCsAbreviatura() {
		return this.csAbreviatura;
	}

	public void setCsAbreviatura(String csAbreviatura) {
		this.csAbreviatura = csAbreviatura;
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

	public List<COtro> getCOtros() {
		return this.COtros;
	}

	public void setCOtros(List<COtro> COtros) {
		this.COtros = COtros;
	}

	public COtro addCOtro(COtro COtro) {
		getCOtros().add(COtro);
		COtro.setCNacionalidadUgj(this);

		return COtro;
	}

	public COtro removeCOtro(COtro COtro) {
		getCOtros().remove(COtro);
		COtro.setCNacionalidadUgj(null);

		return COtro;
	}

	public List<CPaisUgj> getCPaisUgjs() {
		return this.CPaisUgjs;
	}

	public void setCPaisUgjs(List<CPaisUgj> CPaisUgjs) {
		this.CPaisUgjs = CPaisUgjs;
	}

	public CPaisUgj addCPaisUgj(CPaisUgj CPaisUgj) {
		getCPaisUgjs().add(CPaisUgj);
		CPaisUgj.setCNacionalidadUgj(this);

		return CPaisUgj;
	}

	public CPaisUgj removeCPaisUgj(CPaisUgj CPaisUgj) {
		getCPaisUgjs().remove(CPaisUgj);
		CPaisUgj.setCNacionalidadUgj(null);

		return CPaisUgj;
	}

	public List<TPersonaUgj> getTPersonaUgjs() {
		return this.TPersonaUgjs;
	}

	public void setTPersonaUgjs(List<TPersonaUgj> TPersonaUgjs) {
		this.TPersonaUgjs = TPersonaUgjs;
	}

	public TPersonaUgj addTPersonaUgj(TPersonaUgj TPersonaUgj) {
		getTPersonaUgjs().add(TPersonaUgj);
		TPersonaUgj.setCNacionalidadUgj(this);

		return TPersonaUgj;
	}

	public TPersonaUgj removeTPersonaUgj(TPersonaUgj TPersonaUgj) {
		getTPersonaUgjs().remove(TPersonaUgj);
		TPersonaUgj.setCNacionalidadUgj(null);

		return TPersonaUgj;
	}

}