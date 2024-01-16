package siemp.estadistica.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the t_persona database table.
 * 
 */
@Entity
@Table(name="t_persona")
@NamedQuery(name="TPersona.findAll", query="SELECT t FROM TPersona t")
public class TPersona implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_persona")
	private Long idPersona;

	@Column(name="a_materno")
	private String aMaterno;

	@Column(name="a_paterno")
	private String aPaterno;

	private String alias;

	@Column(name="avance_escolar")
	private String avanceEscolar;

	private String curp;

	private String discapacidad;

	private Integer edad;

	private String estatus;

	private String etnia;

	@Temporal(TemporalType.DATE)
	@Column(name="fecha_nacimiento")
	private Date fechaNacimiento;

	@Column(name="habla_espanol")
	private String hablaEspanol;

	@Column(name="habla_lengua_indigena")
	private String hablaLenguaIndigena;

	@Column(name="id_lengua_indigena")
	private Integer idLenguaIndigena;

	@Column(name="id_nacionalidad")
	private Integer idNacionalidad;

	@Column(name="id_ocupacion")
	private Integer idOcupacion;

	@Column(name="id_pais_extranjero")
	private String idPaisExtranjero;

	@Column(name="id_persona_procu")
	private BigDecimal idPersonaProcu;

	private String indigena;

	@Column(name="leer_escribir")
	private String leerEscribir;

	private String lgbttti;

	private String nombre;

	private String ocupacion;

	@Column(name="otros_nombres")
	private String otrosNombres;

	@Column(name="razon_social")
	private String razonSocial;

	private String religion;

	@Column(name="requiere_interprete")
	private String requiereInterprete;

	private String rfc;

	private String sexo;

	@Column(name="situacion_calle")
	private String situacionCalle;

	private String telefono;

	@Column(name="tipo_persona")
	private String tipoPersona;

	//bi-directional many-to-one association to TDireccionPersona
	@OneToMany(mappedBy="TPersona")
	private List<TDireccionPersona> TDireccionPersonas;

	//bi-directional one-to-one association to TImputado
	@OneToOne(mappedBy="TPersona", fetch=FetchType.LAZY)
	private TImputado TImputado;

	//bi-directional many-to-one association to CEstadoCivil
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_estado_civil")
	private CEstadoCivil CEstadoCivil;

	//bi-directional many-to-one association to CGradoEscolar
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_grado_escolar")
	private CGradoEscolar CGradoEscolar;

	//bi-directional many-to-one association to TSituacionPersona
	@OneToMany(mappedBy="TPersona")
	private List<TSituacionPersona> TSituacionPersonas;

	//bi-directional one-to-one association to TVictima
	@OneToOne(mappedBy="TPersona", fetch=FetchType.LAZY)
	private TVictima TVictima;

	public TPersona() {
	}

	public Long getIdPersona() {
		return this.idPersona;
	}

	public void setIdPersona(Long idPersona) {
		this.idPersona = idPersona;
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

	public String getAlias() {
		return this.alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public String getAvanceEscolar() {
		return this.avanceEscolar;
	}

	public void setAvanceEscolar(String avanceEscolar) {
		this.avanceEscolar = avanceEscolar;
	}

	public String getCurp() {
		return this.curp;
	}

	public void setCurp(String curp) {
		this.curp = curp;
	}

	public String getDiscapacidad() {
		return this.discapacidad;
	}

	public void setDiscapacidad(String discapacidad) {
		this.discapacidad = discapacidad;
	}

	public Integer getEdad() {
		return this.edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public String getEstatus() {
		return this.estatus;
	}

	public void setEstatus(String estatus) {
		this.estatus = estatus;
	}

	public String getEtnia() {
		return this.etnia;
	}

	public void setEtnia(String etnia) {
		this.etnia = etnia;
	}

	public Date getFechaNacimiento() {
		return this.fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getHablaEspanol() {
		return this.hablaEspanol;
	}

	public void setHablaEspanol(String hablaEspanol) {
		this.hablaEspanol = hablaEspanol;
	}

	public String getHablaLenguaIndigena() {
		return this.hablaLenguaIndigena;
	}

	public void setHablaLenguaIndigena(String hablaLenguaIndigena) {
		this.hablaLenguaIndigena = hablaLenguaIndigena;
	}

	public Integer getIdLenguaIndigena() {
		return this.idLenguaIndigena;
	}

	public void setIdLenguaIndigena(Integer idLenguaIndigena) {
		this.idLenguaIndigena = idLenguaIndigena;
	}

	public Integer getIdNacionalidad() {
		return this.idNacionalidad;
	}

	public void setIdNacionalidad(Integer idNacionalidad) {
		this.idNacionalidad = idNacionalidad;
	}

	public Integer getIdOcupacion() {
		return this.idOcupacion;
	}

	public void setIdOcupacion(Integer idOcupacion) {
		this.idOcupacion = idOcupacion;
	}

	public String getIdPaisExtranjero() {
		return this.idPaisExtranjero;
	}

	public void setIdPaisExtranjero(String idPaisExtranjero) {
		this.idPaisExtranjero = idPaisExtranjero;
	}

	public BigDecimal getIdPersonaProcu() {
		return this.idPersonaProcu;
	}

	public void setIdPersonaProcu(BigDecimal idPersonaProcu) {
		this.idPersonaProcu = idPersonaProcu;
	}

	public String getIndigena() {
		return this.indigena;
	}

	public void setIndigena(String indigena) {
		this.indigena = indigena;
	}

	public String getLeerEscribir() {
		return this.leerEscribir;
	}

	public void setLeerEscribir(String leerEscribir) {
		this.leerEscribir = leerEscribir;
	}

	public String getLgbttti() {
		return this.lgbttti;
	}

	public void setLgbttti(String lgbttti) {
		this.lgbttti = lgbttti;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getOcupacion() {
		return this.ocupacion;
	}

	public void setOcupacion(String ocupacion) {
		this.ocupacion = ocupacion;
	}

	public String getOtrosNombres() {
		return this.otrosNombres;
	}

	public void setOtrosNombres(String otrosNombres) {
		this.otrosNombres = otrosNombres;
	}

	public String getRazonSocial() {
		return this.razonSocial;
	}

	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

	public String getReligion() {
		return this.religion;
	}

	public void setReligion(String religion) {
		this.religion = religion;
	}

	public String getRequiereInterprete() {
		return this.requiereInterprete;
	}

	public void setRequiereInterprete(String requiereInterprete) {
		this.requiereInterprete = requiereInterprete;
	}

	public String getRfc() {
		return this.rfc;
	}

	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

	public String getSexo() {
		return this.sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getSituacionCalle() {
		return this.situacionCalle;
	}

	public void setSituacionCalle(String situacionCalle) {
		this.situacionCalle = situacionCalle;
	}

	public String getTelefono() {
		return this.telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getTipoPersona() {
		return this.tipoPersona;
	}

	public void setTipoPersona(String tipoPersona) {
		this.tipoPersona = tipoPersona;
	}

	public List<TDireccionPersona> getTDireccionPersonas() {
		return this.TDireccionPersonas;
	}

	public void setTDireccionPersonas(List<TDireccionPersona> TDireccionPersonas) {
		this.TDireccionPersonas = TDireccionPersonas;
	}

	public TDireccionPersona addTDireccionPersona(TDireccionPersona TDireccionPersona) {
		getTDireccionPersonas().add(TDireccionPersona);
		TDireccionPersona.setTPersona(this);

		return TDireccionPersona;
	}

	public TDireccionPersona removeTDireccionPersona(TDireccionPersona TDireccionPersona) {
		getTDireccionPersonas().remove(TDireccionPersona);
		TDireccionPersona.setTPersona(null);

		return TDireccionPersona;
	}

	public TImputado getTImputado() {
		return this.TImputado;
	}

	public void setTImputado(TImputado TImputado) {
		this.TImputado = TImputado;
	}

	public CEstadoCivil getCEstadoCivil() {
		return this.CEstadoCivil;
	}

	public void setCEstadoCivil(CEstadoCivil CEstadoCivil) {
		this.CEstadoCivil = CEstadoCivil;
	}

	public CGradoEscolar getCGradoEscolar() {
		return this.CGradoEscolar;
	}

	public void setCGradoEscolar(CGradoEscolar CGradoEscolar) {
		this.CGradoEscolar = CGradoEscolar;
	}

	public List<TSituacionPersona> getTSituacionPersonas() {
		return this.TSituacionPersonas;
	}

	public void setTSituacionPersonas(List<TSituacionPersona> TSituacionPersonas) {
		this.TSituacionPersonas = TSituacionPersonas;
	}

	public TSituacionPersona addTSituacionPersona(TSituacionPersona TSituacionPersona) {
		getTSituacionPersonas().add(TSituacionPersona);
		TSituacionPersona.setTPersona(this);

		return TSituacionPersona;
	}

	public TSituacionPersona removeTSituacionPersona(TSituacionPersona TSituacionPersona) {
		getTSituacionPersonas().remove(TSituacionPersona);
		TSituacionPersona.setTPersona(null);

		return TSituacionPersona;
	}

	public TVictima getTVictima() {
		return this.TVictima;
	}

	public void setTVictima(TVictima TVictima) {
		this.TVictima = TVictima;
	}

}