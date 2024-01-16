package siemp.estadistica.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the c_jueces database table.
 * 
 */
@Entity
@Table(name="c_jueces")
@NamedQuery(name="CJuece.findAll", query="SELECT c FROM CJuece c")
public class CJuece implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_juez")
	private int idJuez;

	@Column(name="a_materno")
	private String aMaterno;

	@Column(name="a_paterno")
	private String aPaterno;

	private String correo;

	private String denominacion;

	private String estatus;

	@Temporal(TemporalType.DATE)
	@Column(name="fecha_nacimiento")
	private Date fechaNacimiento;

	@Column(name="id_entidad")
	private int idEntidad;

	private String nombre;

	@Column(name="num_juez")
	private int numJuez;

	private String sexo;

	private int tipo;

	public CJuece() {
	}

	public int getIdJuez() {
		return this.idJuez;
	}

	public void setIdJuez(int idJuez) {
		this.idJuez = idJuez;
	}

	public String getAMaterno() {
		return this.aMaterno;
	}

	public void setAMaterno(String aMaterno) {
		this.aMaterno = aMaterno;
	}

	public String getAPaterno() {
		return this.aPaterno;
	}

	public void setAPaterno(String aPaterno) {
		this.aPaterno = aPaterno;
	}

	public String getCorreo() {
		return this.correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getDenominacion() {
		return this.denominacion;
	}

	public void setDenominacion(String denominacion) {
		this.denominacion = denominacion;
	}

	public String getEstatus() {
		return this.estatus;
	}

	public void setEstatus(String estatus) {
		this.estatus = estatus;
	}

	public Date getFechaNacimiento() {
		return this.fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public int getIdEntidad() {
		return this.idEntidad;
	}

	public void setIdEntidad(int idEntidad) {
		this.idEntidad = idEntidad;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumJuez() {
		return this.numJuez;
	}

	public void setNumJuez(int numJuez) {
		this.numJuez = numJuez;
	}

	public String getSexo() {
		return this.sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getTipo() {
		return this.tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

}