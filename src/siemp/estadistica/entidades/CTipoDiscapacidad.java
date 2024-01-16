package siemp.estadistica.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the c_tipo_discapacidad database table.
 * 
 */
@Entity
@Table(name="c_tipo_discapacidad")
@NamedQuery(name="CTipoDiscapacidad.findAll", query="SELECT c FROM CTipoDiscapacidad c")
public class CTipoDiscapacidad implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="cn_tipo_discapacidad_id")
	private String cnTipoDiscapacidadId;

	@Column(name="cs_clave")
	private String csClave;

	@Column(name="cs_tipo_discapacidad")
	private String csTipoDiscapacidad;

	//bi-directional many-to-one association to CDiscapacidad
	@OneToMany(mappedBy="CTipoDiscapacidad")
	private List<CDiscapacidad> CDiscapacidads;

	public CTipoDiscapacidad() {
	}

	public String getCnTipoDiscapacidadId() {
		return this.cnTipoDiscapacidadId;
	}

	public void setCnTipoDiscapacidadId(String cnTipoDiscapacidadId) {
		this.cnTipoDiscapacidadId = cnTipoDiscapacidadId;
	}

	public String getCsClave() {
		return this.csClave;
	}

	public void setCsClave(String csClave) {
		this.csClave = csClave;
	}

	public String getCsTipoDiscapacidad() {
		return this.csTipoDiscapacidad;
	}

	public void setCsTipoDiscapacidad(String csTipoDiscapacidad) {
		this.csTipoDiscapacidad = csTipoDiscapacidad;
	}

	public List<CDiscapacidad> getCDiscapacidads() {
		return this.CDiscapacidads;
	}

	public void setCDiscapacidads(List<CDiscapacidad> CDiscapacidads) {
		this.CDiscapacidads = CDiscapacidads;
	}

	public CDiscapacidad addCDiscapacidad(CDiscapacidad CDiscapacidad) {
		getCDiscapacidads().add(CDiscapacidad);
		CDiscapacidad.setCTipoDiscapacidad(this);

		return CDiscapacidad;
	}

	public CDiscapacidad removeCDiscapacidad(CDiscapacidad CDiscapacidad) {
		getCDiscapacidads().remove(CDiscapacidad);
		CDiscapacidad.setCTipoDiscapacidad(null);

		return CDiscapacidad;
	}

}