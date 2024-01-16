package siemp.estadistica.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the c_rol database table.
 * 
 */
@Entity
@Table(name="c_rol")
@NamedQuery(name="CRol.findAll", query="SELECT c FROM CRol c")
public class CRol implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_rol")
	private int idRol;

	private String descripcion;

	//bi-directional many-to-one association to CUsuario
	@OneToMany(mappedBy="CRol")
	private List<CUsuario> CUsuarios;

	public CRol() {
	}

	public int getIdRol() {
		return this.idRol;
	}

	public void setIdRol(int idRol) {
		this.idRol = idRol;
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
		CUsuario.setCRol(this);

		return CUsuario;
	}

	public CUsuario removeCUsuario(CUsuario CUsuario) {
		getCUsuarios().remove(CUsuario);
		CUsuario.setCRol(null);

		return CUsuario;
	}

}