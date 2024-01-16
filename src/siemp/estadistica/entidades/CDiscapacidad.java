package siemp.estadistica.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the c_discapacidad database table.
 * 
 */
@Entity
@Table(name="c_discapacidad")
@NamedQuery(name="CDiscapacidad.findAll", query="SELECT c FROM CDiscapacidad c")
public class CDiscapacidad implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="cn_discapacidad_id")
	private String cnDiscapacidadId;

	@Column(name="cs_clave")
	private String csClave;

	@Column(name="cs_discapacidad")
	private String csDiscapacidad;

	//bi-directional many-to-one association to CTipoDiscapacidad
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="cn_tipo_discapacidad_id")
	private CTipoDiscapacidad CTipoDiscapacidad;

	//bi-directional many-to-one association to COtro
	@OneToMany(mappedBy="CDiscapacidad")
	private List<COtro> COtros;

	//bi-directional many-to-one association to TPersonaUgj
	@OneToMany(mappedBy="CDiscapacidad")
	private List<TPersonaUgj> TPersonaUgjs;

	public CDiscapacidad() {
	}

	public String getCnDiscapacidadId() {
		return this.cnDiscapacidadId;
	}

	public void setCnDiscapacidadId(String cnDiscapacidadId) {
		this.cnDiscapacidadId = cnDiscapacidadId;
	}

	public String getCsClave() {
		return this.csClave;
	}

	public void setCsClave(String csClave) {
		this.csClave = csClave;
	}

	public String getCsDiscapacidad() {
		return this.csDiscapacidad;
	}

	public void setCsDiscapacidad(String csDiscapacidad) {
		this.csDiscapacidad = csDiscapacidad;
	}

	public CTipoDiscapacidad getCTipoDiscapacidad() {
		return this.CTipoDiscapacidad;
	}

	public void setCTipoDiscapacidad(CTipoDiscapacidad CTipoDiscapacidad) {
		this.CTipoDiscapacidad = CTipoDiscapacidad;
	}

	public List<COtro> getCOtros() {
		return this.COtros;
	}

	public void setCOtros(List<COtro> COtros) {
		this.COtros = COtros;
	}

	public COtro addCOtro(COtro COtro) {
		getCOtros().add(COtro);
		COtro.setCDiscapacidad(this);

		return COtro;
	}

	public COtro removeCOtro(COtro COtro) {
		getCOtros().remove(COtro);
		COtro.setCDiscapacidad(null);

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
		TPersonaUgj.setCDiscapacidad(this);

		return TPersonaUgj;
	}

	public TPersonaUgj removeTPersonaUgj(TPersonaUgj TPersonaUgj) {
		getTPersonaUgjs().remove(TPersonaUgj);
		TPersonaUgj.setCDiscapacidad(null);

		return TPersonaUgj;
	}

}