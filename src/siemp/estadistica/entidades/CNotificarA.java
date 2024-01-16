package siemp.estadistica.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the c_notificar_a database table.
 * 
 */
@Entity
@Table(name="c_notificar_a")
@NamedQuery(name="CNotificarA.findAll", query="SELECT c FROM CNotificarA c")
public class CNotificarA implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="cn_notificar_a_id")
	private String cnNotificarAId;

	@Column(name="cs_notificar_a")
	private String csNotificarA;

	//bi-directional many-to-one association to COtro
	@OneToMany(mappedBy="CNotificarA")
	private List<COtro> COtros;

	//bi-directional many-to-one association to TPersonaUgj
	@OneToMany(mappedBy="CNotificarA")
	private List<TPersonaUgj> TPersonaUgjs;

	public CNotificarA() {
	}

	public String getCnNotificarAId() {
		return this.cnNotificarAId;
	}

	public void setCnNotificarAId(String cnNotificarAId) {
		this.cnNotificarAId = cnNotificarAId;
	}

	public String getCsNotificarA() {
		return this.csNotificarA;
	}

	public void setCsNotificarA(String csNotificarA) {
		this.csNotificarA = csNotificarA;
	}

	public List<COtro> getCOtros() {
		return this.COtros;
	}

	public void setCOtros(List<COtro> COtros) {
		this.COtros = COtros;
	}

	public COtro addCOtro(COtro COtro) {
		getCOtros().add(COtro);
		COtro.setCNotificarA(this);

		return COtro;
	}

	public COtro removeCOtro(COtro COtro) {
		getCOtros().remove(COtro);
		COtro.setCNotificarA(null);

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
		TPersonaUgj.setCNotificarA(this);

		return TPersonaUgj;
	}

	public TPersonaUgj removeTPersonaUgj(TPersonaUgj TPersonaUgj) {
		getTPersonaUgjs().remove(TPersonaUgj);
		TPersonaUgj.setCNotificarA(null);

		return TPersonaUgj;
	}

}