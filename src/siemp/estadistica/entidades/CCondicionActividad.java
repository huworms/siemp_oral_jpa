package siemp.estadistica.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the c_condicion_actividad database table.
 * 
 */
@Entity
@Table(name="c_condicion_actividad")
@NamedQuery(name="CCondicionActividad.findAll", query="SELECT c FROM CCondicionActividad c")
public class CCondicionActividad implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="cn_condicion_actividad_id")
	private String cnCondicionActividadId;

	@Column(name="cs_clave")
	private String csClave;

	@Column(name="cs_condicion_actividad")
	private String csCondicionActividad;

	//bi-directional many-to-one association to COtro
	@OneToMany(mappedBy="CCondicionActividad")
	private List<COtro> COtros;

	//bi-directional many-to-one association to TPersonaUgj
	@OneToMany(mappedBy="CCondicionActividad")
	private List<TPersonaUgj> TPersonaUgjs;

	public CCondicionActividad() {
	}

	public String getCnCondicionActividadId() {
		return this.cnCondicionActividadId;
	}

	public void setCnCondicionActividadId(String cnCondicionActividadId) {
		this.cnCondicionActividadId = cnCondicionActividadId;
	}

	public String getCsClave() {
		return this.csClave;
	}

	public void setCsClave(String csClave) {
		this.csClave = csClave;
	}

	public String getCsCondicionActividad() {
		return this.csCondicionActividad;
	}

	public void setCsCondicionActividad(String csCondicionActividad) {
		this.csCondicionActividad = csCondicionActividad;
	}

	public List<COtro> getCOtros() {
		return this.COtros;
	}

	public void setCOtros(List<COtro> COtros) {
		this.COtros = COtros;
	}

	public COtro addCOtro(COtro COtro) {
		getCOtros().add(COtro);
		COtro.setCCondicionActividad(this);

		return COtro;
	}

	public COtro removeCOtro(COtro COtro) {
		getCOtros().remove(COtro);
		COtro.setCCondicionActividad(null);

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
		TPersonaUgj.setCCondicionActividad(this);

		return TPersonaUgj;
	}

	public TPersonaUgj removeTPersonaUgj(TPersonaUgj TPersonaUgj) {
		getTPersonaUgjs().remove(TPersonaUgj);
		TPersonaUgj.setCCondicionActividad(null);

		return TPersonaUgj;
	}

}