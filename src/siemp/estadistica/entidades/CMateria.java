package siemp.estadistica.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the c_materia database table.
 * 
 */
@Entity
@Table(name="c_materia")
@NamedQuery(name="CMateria.findAll", query="SELECT c FROM CMateria c")
public class CMateria implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_materia")
	private int idMateria;

	private String descripcion;

	//bi-directional many-to-one association to CEntidad
	@OneToMany(mappedBy="CMateria")
	private List<CEntidad> CEntidads;

	public CMateria() {
	}

	public int getIdMateria() {
		return this.idMateria;
	}

	public void setIdMateria(int idMateria) {
		this.idMateria = idMateria;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public List<CEntidad> getCEntidads() {
		return this.CEntidads;
	}

	public void setCEntidads(List<CEntidad> CEntidads) {
		this.CEntidads = CEntidads;
	}

	public CEntidad addCEntidad(CEntidad CEntidad) {
		getCEntidads().add(CEntidad);
		CEntidad.setCMateria(this);

		return CEntidad;
	}

	public CEntidad removeCEntidad(CEntidad CEntidad) {
		getCEntidads().remove(CEntidad);
		CEntidad.setCMateria(null);

		return CEntidad;
	}

}