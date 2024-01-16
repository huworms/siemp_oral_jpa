package siemp.estadistica.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the c_usuario database table.
 * 
 */
@Entity
@Table(name="c_usuario")
@NamedQuery(name="CUsuario.findAll", query="SELECT c FROM CUsuario c")
public class CUsuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_usuario")
	private int idUsuario;

	private String correo;

	private String estatus;

	private String extension;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="fecha_alta")
	private Date fechaAlta;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="fecha_baja")
	private Date fechaBaja;

	private String materno;

	private String nombre;

	@Column(name="otro_cargo")
	private String otroCargo;

	private String password;

	private String paterno;

	private String telefono;

	private String usuario;

	//bi-directional many-to-one association to CCargo
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_cargo")
	private CCargo CCargo;

	//bi-directional many-to-one association to CEntidad
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_entidad")
	private CEntidad CEntidad;

	//bi-directional many-to-one association to CRol
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_rol")
	private CRol CRol;

	public CUsuario() {
	}

	public int getIdUsuario() {
		return this.idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getCorreo() {
		return this.correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getEstatus() {
		return this.estatus;
	}

	public void setEstatus(String estatus) {
		this.estatus = estatus;
	}

	public String getExtension() {
		return this.extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

	public Date getFechaAlta() {
		return this.fechaAlta;
	}

	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public Date getFechaBaja() {
		return this.fechaBaja;
	}

	public void setFechaBaja(Date fechaBaja) {
		this.fechaBaja = fechaBaja;
	}

	public String getMaterno() {
		return this.materno;
	}

	public void setMaterno(String materno) {
		this.materno = materno;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getOtroCargo() {
		return this.otroCargo;
	}

	public void setOtroCargo(String otroCargo) {
		this.otroCargo = otroCargo;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPaterno() {
		return this.paterno;
	}

	public void setPaterno(String paterno) {
		this.paterno = paterno;
	}

	public String getTelefono() {
		return this.telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getUsuario() {
		return this.usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public CCargo getCCargo() {
		return this.CCargo;
	}

	public void setCCargo(CCargo CCargo) {
		this.CCargo = CCargo;
	}

	public CEntidad getCEntidad() {
		return this.CEntidad;
	}

	public void setCEntidad(CEntidad CEntidad) {
		this.CEntidad = CEntidad;
	}

	public CRol getCRol() {
		return this.CRol;
	}

	public void setCRol(CRol CRol) {
		this.CRol = CRol;
	}

}