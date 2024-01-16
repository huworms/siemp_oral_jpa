package siemp.estadistica.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the c_cargo database table.
 * 
 */
@Entity
@Table(name="c_cargo")
@NamedQuery(name="CCargo.findAll", query="SELECT c FROM CCargo c")
public class CCargo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_cargo")
	private int idCargo;

	private String descripcion;

	//bi-directional many-to-one association to CUsuario
	@OneToMany(mappedBy="CCargo")
	private List<CUsuario> CUsuarios;

	public CCargo() {
	}

	public int getIdCargo() {
		return this.idCargo;
	}

	public void setIdCargo(int idCargo) {
		this.idCargo = idCargo;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public List<CUsuario> getCUsuarios() {
		return this.CUsuarios;
	}

	public void setCUsuarios(List<CUsuario> CUsuarios) {
		this.CUsuarios = CUsuarios;
	}

	public CUsuario addCUsuario(CUsuario CUsuario) {
		getCUsuarios().add(CUsuario);
		CUsuario.setCCargo(this);

		return CUsuario;
	}

	public CUsuario removeCUsuario(CUsuario CUsuario) {
		getCUsuarios().remove(CUsuario);
		CUsuario.setCCargo(null);

		return CUsuario;
	}

}