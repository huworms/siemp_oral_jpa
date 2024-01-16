package siemp.estadistica.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the c_relacion database table.
 * 
 */
@Entity
@Table(name="c_relacion")
@NamedQuery(name="CRelacion.findAll", query="SELECT c FROM CRelacion c")
public class CRelacion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="cn_relacion_id")
	private String cnRelacionId;

	@Column(name="cb_familiar_directo")
	private byte cbFamiliarDirecto;

	@Column(name="cs_clave")
	private String csClave;

	@Column(name="cs_relacion")
	private String csRelacion;

	//bi-directional many-to-one association to COtro
	@OneToMany(mappedBy="CRelacion")
	private List<COtro> COtros;

	//bi-directional many-to-one association to TPersonaUgj
	@OneToMany(mappedBy="CRelacion")
	private List<TPersonaUgj> TPersonaUgjs;

	public CRelacion() {
	}

	public String getCnRelacionId() {
		return this.cnRelacionId;
	}

	public void setCnRelacionId(String cnRelacionId) {
		this.cnRelacionId = cnRelacionId;
	}

	public byte getCbFamiliarDirecto() {
		return this.cbFamiliarDirecto;
	}

	public void setCbFamiliarDirecto(byte cbFamiliarDirecto) {
		this.cbFamiliarDirecto = cbFamiliarDirecto;
	}

	public String getCsClave() {
		return this.csClave;
	}

	public void setCsClave(String csClave) {
		this.csClave = csClave;
	}

	public String getCsRelacion() {
		return this.csRelacion;
	}

	public void setCsRelacion(String csRelacion) {
		this.csRelacion = csRelacion;
	}

	public List<COtro> getCOtros() {
		return this.COtros;
	}

	public void setCOtros(List<COtro> COtros) {
		this.COtros = COtros;
	}

	public COtro addCOtro(COtro COtro) {
		getCOtros().add(COtro);
		COtro.setCRelacion(this);

		return COtro;
	}

	public COtro removeCOtro(COtro COtro) {
		getCOtros().remove(COtro);
		COtro.setCRelacion(null);

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
		TPersonaUgj.setCRelacion(this);

		return TPersonaUgj;
	}

	public TPersonaUgj removeTPersonaUgj(TPersonaUgj TPersonaUgj) {
		getTPersonaUgjs().remove(TPersonaUgj);
		TPersonaUgj.setCRelacion(null);

		return TPersonaUgj;
	}

}