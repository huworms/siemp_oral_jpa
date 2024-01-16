package siemp.estadistica.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the c_sexo database table.
 * 
 */
@Entity
@Table(name="c_sexo")
@NamedQuery(name="CSexo.findAll", query="SELECT c FROM CSexo c")
public class CSexo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="cn_sexo_id")
	private String cnSexoId;

	@Column(name="cs_clave")
	private String csClave;

	@Column(name="cs_sexo")
	private String csSexo;

	//bi-directional many-to-one association to COtro
	@OneToMany(mappedBy="CSexo")
	private List<COtro> COtros;

	//bi-directional many-to-one association to TPersonaUgj
	@OneToMany(mappedBy="CSexo")
	private List<TPersonaUgj> TPersonaUgjs;

	public CSexo() {
	}

	public String getCnSexoId() {
		return this.cnSexoId;
	}

	public void setCnSexoId(String cnSexoId) {
		this.cnSexoId = cnSexoId;
	}

	public String getCsClave() {
		return this.csClave;
	}

	public void setCsClave(String csClave) {
		this.csClave = csClave;
	}

	public String getCsSexo() {
		return this.csSexo;
	}

	public void setCsSexo(String csSexo) {
		this.csSexo = csSexo;
	}

	public List<COtro> getCOtros() {
		return this.COtros;
	}

	public void setCOtros(List<COtro> COtros) {
		this.COtros = COtros;
	}

	public COtro addCOtro(COtro COtro) {
		getCOtros().add(COtro);
		COtro.setCSexo(this);

		return COtro;
	}

	public COtro removeCOtro(COtro COtro) {
		getCOtros().remove(COtro);
		COtro.setCSexo(null);

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
		TPersonaUgj.setCSexo(this);

		return TPersonaUgj;
	}

	public TPersonaUgj removeTPersonaUgj(TPersonaUgj TPersonaUgj) {
		getTPersonaUgjs().remove(TPersonaUgj);
		TPersonaUgj.setCSexo(null);

		return TPersonaUgj;
	}

}