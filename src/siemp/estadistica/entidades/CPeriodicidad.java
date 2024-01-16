package siemp.estadistica.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the c_periodicidad database table.
 * 
 */
@Entity
@Table(name="c_periodicidad")
@NamedQuery(name="CPeriodicidad.findAll", query="SELECT c FROM CPeriodicidad c")
public class CPeriodicidad implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="cn_periodicidad_id")
	private String cnPeriodicidadId;

	@Column(name="cs_periodicidad")
	private String csPeriodicidad;

	//bi-directional many-to-one association to TConsumo
	@OneToMany(mappedBy="CPeriodicidad")
	private List<TConsumo> TConsumos;

	public CPeriodicidad() {
	}

	public String getCnPeriodicidadId() {
		return this.cnPeriodicidadId;
	}

	public void setCnPeriodicidadId(String cnPeriodicidadId) {
		this.cnPeriodicidadId = cnPeriodicidadId;
	}

	public String getCsPeriodicidad() {
		return this.csPeriodicidad;
	}

	public void setCsPeriodicidad(String csPeriodicidad) {
		this.csPeriodicidad = csPeriodicidad;
	}

	public List<TConsumo> getTConsumos() {
		return this.TConsumos;
	}

	public void setTConsumos(List<TConsumo> TConsumos) {
		this.TConsumos = TConsumos;
	}

	public TConsumo addTConsumo(TConsumo TConsumo) {
		getTConsumos().add(TConsumo);
		TConsumo.setCPeriodicidad(this);

		return TConsumo;
	}

	public TConsumo removeTConsumo(TConsumo TConsumo) {
		getTConsumos().remove(TConsumo);
		TConsumo.setCPeriodicidad(null);

		return TConsumo;
	}

}