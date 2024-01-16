package siemp.estadistica.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the c_escolaridad database table.
 * 
 */
@Entity
@Table(name="c_escolaridad")
@NamedQuery(name="CEscolaridad.findAll", query="SELECT c FROM CEscolaridad c")
public class CEscolaridad implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="cn_escolaridad_id")
	private String cnEscolaridadId;

	@Column(name="cs_clave")
	private String csClave;

	@Column(name="cs_nivel_escolaridad")
	private String csNivelEscolaridad;

	//bi-directional many-to-one association to COtro
	@OneToMany(mappedBy="CEscolaridad")
	private List<COtro> COtros;

	//bi-directional many-to-one association to TPersonaUgj
	@OneToMany(mappedBy="CEscolaridad")
	private List<TPersonaUgj> TPersonaUgjs;

	public CEscolaridad() {
	}

	public String getCnEscolaridadId() {
		return this.cnEscolaridadId;
	}

	public void setCnEscolaridadId(String cnEscolaridadId) {
		this.cnEscolaridadId = cnEscolaridadId;
	}

	public String getCsClave() {
		return this.csClave;
	}

	public void setCsClave(String csClave) {
		this.csClave = csClave;
	}

	public String getCsNivelEscolaridad() {
		return this.csNivelEscolaridad;
	}

	public void setCsNivelEscolaridad(String csNivelEscolaridad) {
		this.csNivelEscolaridad = csNivelEscolaridad;
	}

	public List<COtro> getCOtros() {
		return this.COtros;
	}

	public void setCOtros(List<COtro> COtros) {
		this.COtros = COtros;
	}

	public COtro addCOtro(COtro COtro) {
		getCOtros().add(COtro);
		COtro.setCEscolaridad(this);

		return COtro;
	}

	public COtro removeCOtro(COtro COtro) {
		getCOtros().remove(COtro);
		COtro.setCEscolaridad(null);

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
		TPersonaUgj.setCEscolaridad(this);

		return TPersonaUgj;
	}

	public TPersonaUgj removeTPersonaUgj(TPersonaUgj TPersonaUgj) {
		getTPersonaUgjs().remove(TPersonaUgj);
		TPersonaUgj.setCEscolaridad(null);

		return TPersonaUgj;
	}

}