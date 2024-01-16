package siemp.estadistica.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the c_estado_civil database table.
 * 
 */
@Entity
@Table(name="c_estado_civil")
@NamedQuery(name="CEstadoCivil.findAll", query="SELECT c FROM CEstadoCivil c")
public class CEstadoCivil implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_estado_civil")
	private int idEstadoCivil;

	private String descripcion;

	//bi-directional many-to-one association to TPersona
	@OneToMany(mappedBy="CEstadoCivil")
	private List<TPersona> TPersonas;

	public CEstadoCivil() {
	}

	public int getIdEstadoCivil() {
		return this.idEstadoCivil;
	}

	public void setIdEstadoCivil(int idEstadoCivil) {
		this.idEstadoCivil = idEstadoCivil;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public List<TPersona> getTPersonas() {
		return this.TPersonas;
	}

	public void setTPersonas(List<TPersona> TPersonas) {
		this.TPersonas = TPersonas;
	}

	public TPersona addTPersona(TPersona TPersona) {
		getTPersonas().add(TPersona);
		TPersona.setCEstadoCivil(this);

		return TPersona;
	}

	public TPersona removeTPersona(TPersona TPersona) {
		getTPersonas().remove(TPersona);
		TPersona.setCEstadoCivil(null);

		return TPersona;
	}

}