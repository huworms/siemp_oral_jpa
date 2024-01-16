package siemp.estadistica.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the c_conclusion database table.
 * 
 */
@Entity
@Table(name="c_conclusion")
@NamedQuery(name="CConclusion.findAll", query="SELECT c FROM CConclusion c")
public class CConclusion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_conclusion")
	private int idConclusion;

	private String descripcion;

	private String estatus;

	//bi-directional many-to-one association to TConclusion
	@OneToMany(mappedBy="CConclusion")
	private List<TConclusion> TConclusions;

	public CConclusion() {
	}

	public int getIdConclusion() {
		return this.idConclusion;
	}

	public void setIdConclusion(int idConclusion) {
		this.idConclusion = idConclusion;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getEstatus() {
		return this.estatus;
	}

	public void setEstatus(String estatus) {
		this.estatus = estatus;
	}

	public List<TConclusion> getTConclusions() {
		return this.TConclusions;
	}

	public void setTConclusions(List<TConclusion> TConclusions) {
		this.TConclusions = TConclusions;
	}

	public TConclusion addTConclusion(TConclusion TConclusion) {
		getTConclusions().add(TConclusion);
		TConclusion.setCConclusion(this);

		return TConclusion;
	}

	public TConclusion removeTConclusion(TConclusion TConclusion) {
		getTConclusions().remove(TConclusion);
		TConclusion.setCConclusion(null);

		return TConclusion;
	}

}