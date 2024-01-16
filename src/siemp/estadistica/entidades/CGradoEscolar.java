package siemp.estadistica.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the c_grado_escolar database table.
 * 
 */
@Entity
@Table(name="c_grado_escolar")
@NamedQuery(name="CGradoEscolar.findAll", query="SELECT c FROM CGradoEscolar c")
public class CGradoEscolar implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_grado_escolar")
	private int idGradoEscolar;

	private String descripcion;

	//bi-directional many-to-one association to TPersona
	@OneToMany(mappedBy="CGradoEscolar")
	private List<TPersona> TPersonas;

	public CGradoEscolar() {
	}

	public int getIdGradoEscolar() {
		return this.idGradoEscolar;
	}

	public void setIdGradoEscolar(int idGradoEscolar) {
		this.idGradoEscolar = idGradoEscolar;
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
		TPersona.setCGradoEscolar(this);

		return TPersona;
	}

	public TPersona removeTPersona(TPersona TPersona) {
		getTPersonas().remove(TPersona);
		TPersona.setCGradoEscolar(null);

		return TPersona;
	}

}