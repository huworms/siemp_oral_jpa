package siemp.estadistica.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the c_tipo_mandamiento database table.
 * 
 */
@Entity
@Table(name="c_tipo_mandamiento")
@NamedQuery(name="CTipoMandamiento.findAll", query="SELECT c FROM CTipoMandamiento c")
public class CTipoMandamiento implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_tipo_mandamiento")
	private int idTipoMandamiento;

	private String descripcion;

	//bi-directional many-to-one association to TMandamientoJudicial
	@OneToMany(mappedBy="CTipoMandamiento")
	private List<TMandamientoJudicial> TMandamientoJudicials;

	public CTipoMandamiento() {
	}

	public int getIdTipoMandamiento() {
		return this.idTipoMandamiento;
	}

	public void setIdTipoMandamiento(int idTipoMandamiento) {
		this.idTipoMandamiento = idTipoMandamiento;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public List<TMandamientoJudicial> getTMandamientoJudicials() {
		return this.TMandamientoJudicials;
	}

	public void setTMandamientoJudicials(List<TMandamientoJudicial> TMandamientoJudicials) {
		this.TMandamientoJudicials = TMandamientoJudicials;
	}

	public TMandamientoJudicial addTMandamientoJudicial(TMandamientoJudicial TMandamientoJudicial) {
		getTMandamientoJudicials().add(TMandamientoJudicial);
		TMandamientoJudicial.setCTipoMandamiento(this);

		return TMandamientoJudicial;
	}

	public TMandamientoJudicial removeTMandamientoJudicial(TMandamientoJudicial TMandamientoJudicial) {
		getTMandamientoJudicials().remove(TMandamientoJudicial);
		TMandamientoJudicial.setCTipoMandamiento(null);

		return TMandamientoJudicial;
	}

}