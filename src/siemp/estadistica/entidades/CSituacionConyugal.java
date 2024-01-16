package siemp.estadistica.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the c_situacion_conyugal database table.
 * 
 */
@Entity
@Table(name="c_situacion_conyugal")
@NamedQuery(name="CSituacionConyugal.findAll", query="SELECT c FROM CSituacionConyugal c")
public class CSituacionConyugal implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="cn_situacion_conyugal_id")
	private String cnSituacionConyugalId;

	@Column(name="cs_clave")
	private String csClave;

	@Column(name="cs_situacion_conyugal")
	private String csSituacionConyugal;

	//bi-directional many-to-one association to COtro
	@OneToMany(mappedBy="CSituacionConyugal")
	private List<COtro> COtros;

	//bi-directional many-to-one association to TPersonaUgj
	@OneToMany(mappedBy="CSituacionConyugal")
	private List<TPersonaUgj> TPersonaUgjs;

	public CSituacionConyugal() {
	}

	public String getCnSituacionConyugalId() {
		return this.cnSituacionConyugalId;
	}

	public void setCnSituacionConyugalId(String cnSituacionConyugalId) {
		this.cnSituacionConyugalId = cnSituacionConyugalId;
	}

	public String getCsClave() {
		return this.csClave;
	}

	public void setCsClave(String csClave) {
		this.csClave = csClave;
	}

	public String getCsSituacionConyugal() {
		return this.csSituacionConyugal;
	}

	public void setCsSituacionConyugal(String csSituacionConyugal) {
		this.csSituacionConyugal = csSituacionConyugal;
	}

	public List<COtro> getCOtros() {
		return this.COtros;
	}

	public void setCOtros(List<COtro> COtros) {
		this.COtros = COtros;
	}

	public COtro addCOtro(COtro COtro) {
		getCOtros().add(COtro);
		COtro.setCSituacionConyugal(this);

		return COtro;
	}

	public COtro removeCOtro(COtro COtro) {
		getCOtros().remove(COtro);
		COtro.setCSituacionConyugal(null);

		return COtro;
	}

	public List<TPersonaUgj> getTPersonaUgjs() {
		return this.TPersonaUgjs;
	}

	public void setTPersonaUgjs(List<TPersonaUgj> TPersonaUgjs) {
		this.TPersonaUgjs = TPersonaUgjs;
	}

	public TPersonaUgj addTPersonaUgj(TPersonaUgj TPersonaUgj) {
		getTPersonaUgjs().add(TPersonaUgj);
		TPersonaUgj.setCSituacionConyugal(this);

		return TPersonaUgj;
	}

	public TPersonaUgj removeTPersonaUgj(TPersonaUgj TPersonaUgj) {
		getTPersonaUgjs().remove(TPersonaUgj);
		TPersonaUgj.setCSituacionConyugal(null);

		return TPersonaUgj;
	}

}