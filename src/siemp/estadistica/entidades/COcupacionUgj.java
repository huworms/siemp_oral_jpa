package siemp.estadistica.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the c_ocupacion_ugj database table.
 * 
 */
@Entity
@Table(name="c_ocupacion_ugj")
@NamedQuery(name="COcupacionUgj.findAll", query="SELECT c FROM COcupacionUgj c")
public class COcupacionUgj implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="cn_ocupacion_id")
	private String cnOcupacionId;

	@Column(name="cs_clave")
	private String csClave;

	@Column(name="cs_ocupacion")
	private String csOcupacion;

	//bi-directional many-to-one association to CTipoOcupacion
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="cn_tipo_ocupacion_id")
	private CTipoOcupacion CTipoOcupacion;

	//bi-directional many-to-one association to COtro
	@OneToMany(mappedBy="COcupacionUgj")
	private List<COtro> COtros;

	//bi-directional many-to-one association to TPersonaUgj
	@OneToMany(mappedBy="COcupacionUgj")
	private List<TPersonaUgj> TPersonaUgjs;

	public COcupacionUgj() {
	}

	public String getCnOcupacionId() {
		return this.cnOcupacionId;
	}

	public void setCnOcupacionId(String cnOcupacionId) {
		this.cnOcupacionId = cnOcupacionId;
	}

	public String getCsClave() {
		return this.csClave;
	}

	public void setCsClave(String csClave) {
		this.csClave = csClave;
	}

	public String getCsOcupacion() {
		return this.csOcupacion;
	}

	public void setCsOcupacion(String csOcupacion) {
		this.csOcupacion = csOcupacion;
	}

	public CTipoOcupacion getCTipoOcupacion() {
		return this.CTipoOcupacion;
	}

	public void setCTipoOcupacion(CTipoOcupacion CTipoOcupacion) {
		this.CTipoOcupacion = CTipoOcupacion;
	}

	public List<COtro> getCOtros() {
		return this.COtros;
	}

	public void setCOtros(List<COtro> COtros) {
		this.COtros = COtros;
	}

	public COtro addCOtro(COtro COtro) {
		getCOtros().add(COtro);
		COtro.setCOcupacionUgj(this);

		return COtro;
	}

	public COtro removeCOtro(COtro COtro) {
		getCOtros().remove(COtro);
		COtro.setCOcupacionUgj(null);

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
		TPersonaUgj.setCOcupacionUgj(this);

		return TPersonaUgj;
	}

	public TPersonaUgj removeTPersonaUgj(TPersonaUgj TPersonaUgj) {
		getTPersonaUgjs().remove(TPersonaUgj);
		TPersonaUgj.setCOcupacionUgj(null);

		return TPersonaUgj;
	}

}