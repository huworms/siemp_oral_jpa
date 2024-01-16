package siemp.estadistica.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the c_tecnica_investigacion database table.
 * 
 */
@Entity
@Table(name="c_tecnica_investigacion")
@NamedQuery(name="CTecnicaInvestigacion.findAll", query="SELECT c FROM CTecnicaInvestigacion c")
public class CTecnicaInvestigacion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_tecnica")
	private int idTecnica;

	private String descripcion;

	//bi-directional many-to-one association to TTecnicaInvestigacion
	@OneToMany(mappedBy="CTecnicaInvestigacion")
	private List<TTecnicaInvestigacion> TTecnicaInvestigacions;

	public CTecnicaInvestigacion() {
	}

	public int getIdTecnica() {
		return this.idTecnica;
	}

	public void setIdTecnica(int idTecnica) {
		this.idTecnica = idTecnica;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public List<TTecnicaInvestigacion> getTTecnicaInvestigacions() {
		return this.TTecnicaInvestigacions;
	}

	public void setTTecnicaInvestigacions(List<TTecnicaInvestigacion> TTecnicaInvestigacions) {
		this.TTecnicaInvestigacions = TTecnicaInvestigacions;
	}

	public TTecnicaInvestigacion addTTecnicaInvestigacion(TTecnicaInvestigacion TTecnicaInvestigacion) {
		getTTecnicaInvestigacions().add(TTecnicaInvestigacion);
		TTecnicaInvestigacion.setCTecnicaInvestigacion(this);

		return TTecnicaInvestigacion;
	}

	public TTecnicaInvestigacion removeTTecnicaInvestigacion(TTecnicaInvestigacion TTecnicaInvestigacion) {
		getTTecnicaInvestigacions().remove(TTecnicaInvestigacion);
		TTecnicaInvestigacion.setCTecnicaInvestigacion(null);

		return TTecnicaInvestigacion;
	}

}