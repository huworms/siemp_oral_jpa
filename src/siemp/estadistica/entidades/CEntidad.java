package siemp.estadistica.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the c_entidad database table.
 * 
 */
@Entity
@Table(name="c_entidad")
@NamedQuery(name="CEntidad.findAll", query="SELECT c FROM CEntidad c")
public class CEntidad implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_entidad")
	private int idEntidad;

	private String cp;

	private String descripcion;

	private String direccion;

	private String estatus;

	@Column(name="id_entidad_federativa")
	private int idEntidadFederativa;

	@Column(name="id_municipio")
	private int idMunicipio;

	@Column(name="num_entidad")
	private int numEntidad;

	@Column(name="num_exterior")
	private String numExterior;

	private String sede;

	//bi-directional many-to-one association to CMateria
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_materia")
	private CMateria CMateria;

	//bi-directional many-to-one association to CUsuario
	@OneToMany(mappedBy="CEntidad")
	private List<CUsuario> CUsuarios;

	//bi-directional many-to-one association to TIngreso
	@OneToMany(mappedBy="CEntidad")
	private List<TIngreso> TIngresos;

	public CEntidad() {
	}

	public int getIdEntidad() {
		return this.idEntidad;
	}

	public void setIdEntidad(int idEntidad) {
		this.idEntidad = idEntidad;
	}

	public String getCp() {
		return this.cp;
	}

	public void setCp(String cp) {
		this.cp = cp;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getEstatus() {
		return this.estatus;
	}

	public void setEstatus(String estatus) {
		this.estatus = estatus;
	}

	public int getIdEntidadFederativa() {
		return this.idEntidadFederativa;
	}

	public void setIdEntidadFederativa(int idEntidadFederativa) {
		this.idEntidadFederativa = idEntidadFederativa;
	}

	public int getIdMunicipio() {
		return this.idMunicipio;
	}

	public void setIdMunicipio(int idMunicipio) {
		this.idMunicipio = idMunicipio;
	}

	public int getNumEntidad() {
		return this.numEntidad;
	}

	public void setNumEntidad(int numEntidad) {
		this.numEntidad = numEntidad;
	}

	public String getNumExterior() {
		return this.numExterior;
	}

	public void setNumExterior(String numExterior) {
		this.numExterior = numExterior;
	}

	public String getSede() {
		return this.sede;
	}

	public void setSede(String sede) {
		this.sede = sede;
	}

	public CMateria getCMateria() {
		return this.CMateria;
	}

	public void setCMateria(CMateria CMateria) {
		this.CMateria = CMateria;
	}

	public List<CUsuario> getCUsuarios() {
		return this.CUsuarios;
	}

	public void setCUsuarios(List<CUsuario> CUsuarios) {
		this.CUsuarios = CUsuarios;
	}

	public CUsuario addCUsuario(CUsuario CUsuario) {
		getCUsuarios().add(CUsuario);
		CUsuario.setCEntidad(this);

		return CUsuario;
	}

	public CUsuario removeCUsuario(CUsuario CUsuario) {
		getCUsuarios().remove(CUsuario);
		CUsuario.setCEntidad(null);

		return CUsuario;
	}

	public List<TIngreso> getTIngresos() {
		return this.TIngresos;
	}

	public void setTIngresos(List<TIngreso> TIngresos) {
		this.TIngresos = TIngresos;
	}

	public TIngreso addTIngreso(TIngreso TIngreso) {
		getTIngresos().add(TIngreso);
		TIngreso.setCEntidad(this);

		return TIngreso;
	}

	public TIngreso removeTIngreso(TIngreso TIngreso) {
		getTIngresos().remove(TIngreso);
		TIngreso.setCEntidad(null);

		return TIngreso;
	}

}