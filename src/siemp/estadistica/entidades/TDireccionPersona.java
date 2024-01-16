package siemp.estadistica.entidades;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_direccion_persona database table.
 * 
 */
@Entity
@Table(name="t_direccion_persona")
@NamedQuery(name="TDireccionPersona.findAll", query="SELECT t FROM TDireccionPersona t")
public class TDireccionPersona implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TDireccionPersonaPK id;

	private String calle;

	private String colonia;

	@Lob
	private String comentarios;

	private String cp;

	@Column(name="id_entidad_federativa")
	private int idEntidadFederativa;

	@Column(name="id_municipio")
	private int idMunicipio;

	@Column(name="id_pais")
	private int idPais;

	@Column(name="otro_municipio")
	private String otroMunicipio;

	@Column(name="telefono_casa")
	private String telefonoCasa;

	@Column(name="telefono_celular")
	private String telefonoCelular;

	@Column(name="telefono_trabajo")
	private String telefonoTrabajo;

	//bi-directional many-to-one association to TPersona
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_persona", insertable=false, updatable=false)
	private TPersona TPersona;

	public TDireccionPersona() {
	}

	public TDireccionPersonaPK getId() {
		return this.id;
	}

	public void setId(TDireccionPersonaPK id) {
		this.id = id;
	}

	public String getCalle() {
		return this.calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public String getColonia() {
		return this.colonia;
	}

	public void setColonia(String colonia) {
		this.colonia = colonia;
	}

	public String getComentarios() {
		return this.comentarios;
	}

	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}

	public String getCp() {
		return this.cp;
	}

	public void setCp(String cp) {
		this.cp = cp;
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

	public int getIdPais() {
		return this.idPais;
	}

	public void setIdPais(int idPais) {
		this.idPais = idPais;
	}

	public String getOtroMunicipio() {
		return this.otroMunicipio;
	}

	public void setOtroMunicipio(String otroMunicipio) {
		this.otroMunicipio = otroMunicipio;
	}

	public String getTelefonoCasa() {
		return this.telefonoCasa;
	}

	public void setTelefonoCasa(String telefonoCasa) {
		this.telefonoCasa = telefonoCasa;
	}

	public String getTelefonoCelular() {
		return this.telefonoCelular;
	}

	public void setTelefonoCelular(String telefonoCelular) {
		this.telefonoCelular = telefonoCelular;
	}

	public String getTelefonoTrabajo() {
		return this.telefonoTrabajo;
	}

	public void setTelefonoTrabajo(String telefonoTrabajo) {
		this.telefonoTrabajo = telefonoTrabajo;
	}

	public TPersona getTPersona() {
		return this.TPersona;
	}

	public void setTPersona(TPersona TPersona) {
		this.TPersona = TPersona;
	}

}