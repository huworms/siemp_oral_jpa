package siemp.estadistica.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigInteger;


/**
 * The persistent class for the t_persona_pgjdf database table.
 * 
 */
@Entity
@Table(name="t_persona_pgjdf")
@NamedQuery(name="TPersonaPgjdf.findAll", query="SELECT t FROM TPersonaPgjdf t")
public class TPersonaPgjdf implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_persona")
	private String idPersona;

	private String alias;

	@Column(name="apellido_materno")
	private String apellidoMaterno;

	@Column(name="apellido_paterno")
	private String apellidoPaterno;

	@Column(name="categoria_persona")
	private String categoriaPersona;

	@Column(name="fecha_nacimiento")
	private String fechaNacimiento;

	@Column(name="id_persona_pgjdf")
	private BigInteger idPersonaPgjdf;

	private String nacionalidad;

	private String nombre;

	@Column(name="razon_social")
	private String razonSocial;

	@Column(name="representante_legal")
	private String representanteLegal;

	private String sexo;

	@Column(name="tipo_persona")
	private String tipoPersona;

	//bi-directional many-to-one association to TInvestigacionPgjdf
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_ci_investigacion")
	private TInvestigacionPgjdf TInvestigacionPgjdf;

	public TPersonaPgjdf() {
	}

	public String getIdPersona() {
		return this.idPersona;
	}

	public void setIdPersona(String idPersona) {
		this.idPersona = idPersona;
	}

	public String getAlias() {
		return this.alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public String getApellidoMaterno() {
		return this.apellidoMaterno;
	}

	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}

	public String getApellidoPaterno() {
		return this.apellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	public String getCategoriaPersona() {
		return this.categoriaPersona;
	}

	public void setCategoriaPersona(String categoriaPersona) {
		this.categoriaPersona = categoriaPersona;
	}

	public String getFechaNacimiento() {
		return this.fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public BigInteger getIdPersonaPgjdf() {
		return this.idPersonaPgjdf;
	}

	public void setIdPersonaPgjdf(BigInteger idPersonaPgjdf) {
		this.idPersonaPgjdf = idPersonaPgjdf;
	}

	public String getNacionalidad() {
		return this.nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRazonSocial() {
		return this.razonSocial;
	}

	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

	public String getRepresentanteLegal() {
		return this.representanteLegal;
	}

	public void setRepresentanteLegal(String representanteLegal) {
		this.representanteLegal = representanteLegal;
	}

	public String getSexo() {
		return this.sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getTipoPersona() {
		return this.tipoPersona;
	}

	public void setTipoPersona(String tipoPersona) {
		this.tipoPersona = tipoPersona;
	}

	public TInvestigacionPgjdf getTInvestigacionPgjdf() {
		return this.TInvestigacionPgjdf;
	}

	public void setTInvestigacionPgjdf(TInvestigacionPgjdf TInvestigacionPgjdf) {
		this.TInvestigacionPgjdf = TInvestigacionPgjdf;
	}

}