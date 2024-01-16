package siemp.estadistica.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the t_persona_ugj database table.
 * 
 */
@Entity
@Table(name="t_persona_ugj")
@NamedQuery(name="TPersonaUgj.findAll", query="SELECT t FROM TPersonaUgj t")
public class TPersonaUgj implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="cn_persona_id")
	private String cnPersonaId;

	@Column(name="cb_activo")
	private byte cbActivo;

	@Column(name="cb_antecedentes_violencia")
	private byte cbAntecedentesViolencia;

	@Column(name="cb_atencion_medica")
	private byte cbAtencionMedica;

	@Column(name="cb_corresidente")
	private byte cbCorresidente;

	@Column(name="cb_cuida")
	private byte cbCuida;

	@Column(name="cb_dependiente_economico")
	private byte cbDependienteEconomico;

	@Column(name="cb_discapacidad")
	private byte cbDiscapacidad;

	@Column(name="cb_documentos_migratorios")
	private byte cbDocumentosMigratorios;

	@Column(name="cb_embarazada")
	private byte cbEmbarazada;

	@Column(name="cb_en_libertad")
	private byte cbEnLibertad;

	@Column(name="cb_enfermedad")
	private byte cbEnfermedad;

	@Column(name="cb_estudia")
	private byte cbEstudia;

	@Column(name="cb_grupo_indigena")
	private byte cbGrupoIndigena;

	@Column(name="cb_habla_espanol")
	private byte cbHablaEspanol;

	@Column(name="cb_ingreso_previo_prision")
	private byte cbIngresoPrevioPrision;

	@Column(name="cb_lengua_extranjera")
	private byte cbLenguaExtranjera;

	@Column(name="cb_lengua_indigena")
	private byte cbLenguaIndigena;

	@Column(name="cb_lgbttti")
	private byte cbLgbttti;

	@Column(name="cb_poblacion_callejera")
	private byte cbPoblacionCallejera;

	@Column(name="cb_sabe_leer_escribir")
	private byte cbSabeLeerEscribir;

	@Column(name="cb_solucion_alterna")
	private byte cbSolucionAlterna;

	@Column(name="cb_tiene_tatuajes")
	private byte cbTieneTatuajes;

	@Column(name="cb_trabaja")
	private byte cbTrabaja;

	@Column(name="cb_tratamiento_medico_psi")
	private byte cbTratamientoMedicoPsi;

	@Column(name="cb_uso_interprete")
	private byte cbUsoInterprete;

	@Column(name="cb_uso_medio_tecnologico")
	private byte cbUsoMedioTecnologico;

	@Column(name="cb_vive")
	private byte cbVive;

	@Column(name="cd_nacimiento_ano")
	private int cdNacimientoAno;

	@Column(name="cd_nacimiento_dia")
	private int cdNacimientoDia;

	@Column(name="cd_nacimiento_mes")
	private int cdNacimientoMes;

	@Column(name="cn_cuantas_veces")
	private int cnCuantasVeces;

	@Column(name="cn_cuantos_tatuajes")
	private int cnCuantosTatuajes;

	@Column(name="cn_dependientes")
	private int cnDependientes;

	@Column(name="cn_edad")
	private int cnEdad;

	@Column(name="cn_grado_escolaridad")
	private String cnGradoEscolaridad;

	@Column(name="cn_ingreso_mensual")
	private BigDecimal cnIngresoMensual;

	@Column(name="cn_opp_otorgadas")
	private int cnOppOtorgadas;

	@Column(name="cn_opp_solicitadas")
	private int cnOppSolicitadas;

	@Column(name="cs_apellido_materno")
	private String csApellidoMaterno;

	@Column(name="cs_apellido_paterno")
	private String csApellidoPaterno;

	@Column(name="cs_apodo")
	private String csApodo;

	@Lob
	@Column(name="cs_cual_solucion_alterna")
	private String csCualSolucionAlterna;

	@Column(name="cs_curp")
	private String csCurp;

	@Lob
	@Column(name="cs_descripcion_ubicacion_pc")
	private String csDescripcionUbicacionPc;

	@Lob
	@Column(name="cs_detenido_en")
	private String csDetenidoEn;

	@Lob
	@Column(name="cs_documentos_migratorios")
	private String csDocumentosMigratorios;

	@Column(name="cs_email")
	private String csEmail;

	@Column(name="cs_enfermedad")
	private String csEnfermedad;

	@Column(name="cs_nombre")
	private String csNombre;

	@Column(name="cs_numero")
	private String csNumero;

	@Lob
	@Column(name="cs_otros_nombres")
	private String csOtrosNombres;

	@Column(name="cs_rfc")
	private String csRfc;

	@Column(name="cs_tipo_identificacion")
	private String csTipoIdentificacion;

	@Column(name="cs_tratamiento_medico_psi")
	private String csTratamientoMedicoPsi;

	@Lob
	@Column(name="cs_ubicacion_poblacion_callejera")
	private String csUbicacionPoblacionCallejera;

	//bi-directional many-to-one association to COtro
	@OneToMany(mappedBy="TPersonaUgj")
	private List<COtro> COtros;

	//bi-directional many-to-one association to TAmparo
	@OneToMany(mappedBy="TPersonaUgj")
	private List<TAmparo> TAmparos;

	//bi-directional many-to-one association to TApelacionUgj
	@OneToMany(mappedBy="TPersonaUgj")
	private List<TApelacionUgj> TApelacionUgjs;

	//bi-directional many-to-one association to TConsumo
	@OneToMany(mappedBy="TPersonaUgj")
	private List<TConsumo> TConsumos;

	//bi-directional many-to-one association to TDomicilio
	@OneToMany(mappedBy="TPersonaUgj")
	private List<TDomicilio> TDomicilios;

	//bi-directional many-to-one association to TGente
	@OneToMany(mappedBy="TPersonaUgj")
	private List<TGente> TGentes;

	//bi-directional many-to-one association to TListadoAccione
	@OneToMany(mappedBy="TPersonaUgj")
	private List<TListadoAccione> TListadoAcciones;

	//bi-directional many-to-one association to TListadoFuenteIngreso
	@OneToMany(mappedBy="TPersonaUgj")
	private List<TListadoFuenteIngreso> TListadoFuenteIngresos;

	//bi-directional many-to-one association to TListadoTipoOpp
	@OneToMany(mappedBy="TPersonaUgj")
	private List<TListadoTipoOpp> TListadoTipoOpps;

	//bi-directional many-to-one association to TListadoTipoViolencia
	@OneToMany(mappedBy="TPersonaUgj")
	private List<TListadoTipoViolencia> TListadoTipoViolencias;

	//bi-directional many-to-one association to CCondicionActividad
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="cn_condicion_actividad_id")
	private CCondicionActividad CCondicionActividad;

	//bi-directional many-to-one association to CCondicionMigratoria
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="cn_condicion_migratoria_id")
	private CCondicionMigratoria CCondicionMigratoria;

	//bi-directional many-to-one association to CDiscapacidad
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="cn_discapacidad_id")
	private CDiscapacidad CDiscapacidad;

	//bi-directional many-to-one association to CEntidadFederativaUgj
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="cn_entidad_id")
	private CEntidadFederativaUgj CEntidadFederativaUgj;

	//bi-directional many-to-one association to CEscolaridad
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="cn_escolaridad_id")
	private CEscolaridad CEscolaridad;

	//bi-directional many-to-one association to CEstadoPsicofisicoImputado
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="cn_estado_psicofisico_imputado_id")
	private CEstadoPsicofisicoImputado CEstadoPsicofisicoImputado;

	//bi-directional many-to-one association to CGrupoIndigena
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="cn_grupo_indigena_id")
	private CGrupoIndigena CGrupoIndigena;

	//bi-directional many-to-one association to CLenguaExtranjera
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="cn_lengua_extranjera_id")
	private CLenguaExtranjera CLenguaExtranjera;

	//bi-directional many-to-one association to CLenguaIndigenaUgj
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="cn_lengua_indigena_id")
	private CLenguaIndigenaUgj CLenguaIndigenaUgj;

	//bi-directional many-to-one association to CMunicipioUgj
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="cn_municipio_id")
	private CMunicipioUgj CMunicipioUgj;

	//bi-directional many-to-one association to CNacionalidadUgj
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="cn_nacionalidad_id")
	private CNacionalidadUgj CNacionalidadUgj;

	//bi-directional many-to-one association to CNotificarA
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="cn_notificar_a_id")
	private CNotificarA CNotificarA;

	//bi-directional many-to-one association to COcupacionUgj
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="cn_ocupacion_id")
	private COcupacionUgj COcupacionUgj;

	//bi-directional many-to-one association to CPaisUgj
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="cn_pais_id")
	private CPaisUgj CPaisUgj;

	//bi-directional many-to-one association to CRelacion
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="cn_relacion_imputado_id")
	private CRelacion CRelacion;

	//bi-directional many-to-one association to CReligion
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="cn_religion_id")
	private CReligion CReligion;

	//bi-directional many-to-one association to CSexo
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="cn_sexo_id")
	private CSexo CSexo;

	//bi-directional many-to-one association to CSituacionConyugal
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="cn_situacion_conyugal_id")
	private CSituacionConyugal CSituacionConyugal;

	//bi-directional many-to-one association to CTipoOfendidoVictima
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="cn_tipo_ofendido_victima_id")
	private CTipoOfendidoVictima CTipoOfendidoVictima;

	//bi-directional many-to-one association to CTipoPersona
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="cn_tipo_persona_id")
	private CTipoPersona CTipoPersona;

	//bi-directional many-to-one association to TPrision
	@OneToMany(mappedBy="TPersonaUgj")
	private List<TPrision> TPrisions;

	//bi-directional many-to-one association to TProcesoJudicial
	@OneToMany(mappedBy="TPersonaUgj")
	private List<TProcesoJudicial> TProcesoJudicials;

	//bi-directional many-to-one association to TTatuaje
	@OneToMany(mappedBy="TPersonaUgj")
	private List<TTatuaje> TTatuajes;

	//bi-directional many-to-one association to TTelefono
	@OneToMany(mappedBy="TPersonaUgj")
	private List<TTelefono> TTelefonos;

	public TPersonaUgj() {
	}

	public String getCnPersonaId() {
		return this.cnPersonaId;
	}

	public void setCnPersonaId(String cnPersonaId) {
		this.cnPersonaId = cnPersonaId;
	}

	public byte getCbActivo() {
		return this.cbActivo;
	}

	public void setCbActivo(byte cbActivo) {
		this.cbActivo = cbActivo;
	}

	public byte getCbAntecedentesViolencia() {
		return this.cbAntecedentesViolencia;
	}

	public void setCbAntecedentesViolencia(byte cbAntecedentesViolencia) {
		this.cbAntecedentesViolencia = cbAntecedentesViolencia;
	}

	public byte getCbAtencionMedica() {
		return this.cbAtencionMedica;
	}

	public void setCbAtencionMedica(byte cbAtencionMedica) {
		this.cbAtencionMedica = cbAtencionMedica;
	}

	public byte getCbCorresidente() {
		return this.cbCorresidente;
	}

	public void setCbCorresidente(byte cbCorresidente) {
		this.cbCorresidente = cbCorresidente;
	}

	public byte getCbCuida() {
		return this.cbCuida;
	}

	public void setCbCuida(byte cbCuida) {
		this.cbCuida = cbCuida;
	}

	public byte getCbDependienteEconomico() {
		return this.cbDependienteEconomico;
	}

	public void setCbDependienteEconomico(byte cbDependienteEconomico) {
		this.cbDependienteEconomico = cbDependienteEconomico;
	}

	public byte getCbDiscapacidad() {
		return this.cbDiscapacidad;
	}

	public void setCbDiscapacidad(byte cbDiscapacidad) {
		this.cbDiscapacidad = cbDiscapacidad;
	}

	public byte getCbDocumentosMigratorios() {
		return this.cbDocumentosMigratorios;
	}

	public void setCbDocumentosMigratorios(byte cbDocumentosMigratorios) {
		this.cbDocumentosMigratorios = cbDocumentosMigratorios;
	}

	public byte getCbEmbarazada() {
		return this.cbEmbarazada;
	}

	public void setCbEmbarazada(byte cbEmbarazada) {
		this.cbEmbarazada = cbEmbarazada;
	}

	public byte getCbEnLibertad() {
		return this.cbEnLibertad;
	}

	public void setCbEnLibertad(byte cbEnLibertad) {
		this.cbEnLibertad = cbEnLibertad;
	}

	public byte getCbEnfermedad() {
		return this.cbEnfermedad;
	}

	public void setCbEnfermedad(byte cbEnfermedad) {
		this.cbEnfermedad = cbEnfermedad;
	}

	public byte getCbEstudia() {
		return this.cbEstudia;
	}

	public void setCbEstudia(byte cbEstudia) {
		this.cbEstudia = cbEstudia;
	}

	public byte getCbGrupoIndigena() {
		return this.cbGrupoIndigena;
	}

	public void setCbGrupoIndigena(byte cbGrupoIndigena) {
		this.cbGrupoIndigena = cbGrupoIndigena;
	}

	public byte getCbHablaEspanol() {
		return this.cbHablaEspanol;
	}

	public void setCbHablaEspanol(byte cbHablaEspanol) {
		this.cbHablaEspanol = cbHablaEspanol;
	}

	public byte getCbIngresoPrevioPrision() {
		return this.cbIngresoPrevioPrision;
	}

	public void setCbIngresoPrevioPrision(byte cbIngresoPrevioPrision) {
		this.cbIngresoPrevioPrision = cbIngresoPrevioPrision;
	}

	public byte getCbLenguaExtranjera() {
		return this.cbLenguaExtranjera;
	}

	public void setCbLenguaExtranjera(byte cbLenguaExtranjera) {
		this.cbLenguaExtranjera = cbLenguaExtranjera;
	}

	public byte getCbLenguaIndigena() {
		return this.cbLenguaIndigena;
	}

	public void setCbLenguaIndigena(byte cbLenguaIndigena) {
		this.cbLenguaIndigena = cbLenguaIndigena;
	}

	public byte getCbLgbttti() {
		return this.cbLgbttti;
	}

	public void setCbLgbttti(byte cbLgbttti) {
		this.cbLgbttti = cbLgbttti;
	}

	public byte getCbPoblacionCallejera() {
		return this.cbPoblacionCallejera;
	}

	public void setCbPoblacionCallejera(byte cbPoblacionCallejera) {
		this.cbPoblacionCallejera = cbPoblacionCallejera;
	}

	public byte getCbSabeLeerEscribir() {
		return this.cbSabeLeerEscribir;
	}

	public void setCbSabeLeerEscribir(byte cbSabeLeerEscribir) {
		this.cbSabeLeerEscribir = cbSabeLeerEscribir;
	}

	public byte getCbSolucionAlterna() {
		return this.cbSolucionAlterna;
	}

	public void setCbSolucionAlterna(byte cbSolucionAlterna) {
		this.cbSolucionAlterna = cbSolucionAlterna;
	}

	public byte getCbTieneTatuajes() {
		return this.cbTieneTatuajes;
	}

	public void setCbTieneTatuajes(byte cbTieneTatuajes) {
		this.cbTieneTatuajes = cbTieneTatuajes;
	}

	public byte getCbTrabaja() {
		return this.cbTrabaja;
	}

	public void setCbTrabaja(byte cbTrabaja) {
		this.cbTrabaja = cbTrabaja;
	}

	public byte getCbTratamientoMedicoPsi() {
		return this.cbTratamientoMedicoPsi;
	}

	public void setCbTratamientoMedicoPsi(byte cbTratamientoMedicoPsi) {
		this.cbTratamientoMedicoPsi = cbTratamientoMedicoPsi;
	}

	public byte getCbUsoInterprete() {
		return this.cbUsoInterprete;
	}

	public void setCbUsoInterprete(byte cbUsoInterprete) {
		this.cbUsoInterprete = cbUsoInterprete;
	}

	public byte getCbUsoMedioTecnologico() {
		return this.cbUsoMedioTecnologico;
	}

	public void setCbUsoMedioTecnologico(byte cbUsoMedioTecnologico) {
		this.cbUsoMedioTecnologico = cbUsoMedioTecnologico;
	}

	public byte getCbVive() {
		return this.cbVive;
	}

	public void setCbVive(byte cbVive) {
		this.cbVive = cbVive;
	}

	public int getCdNacimientoAno() {
		return this.cdNacimientoAno;
	}

	public void setCdNacimientoAno(int cdNacimientoAno) {
		this.cdNacimientoAno = cdNacimientoAno;
	}

	public int getCdNacimientoDia() {
		return this.cdNacimientoDia;
	}

	public void setCdNacimientoDia(int cdNacimientoDia) {
		this.cdNacimientoDia = cdNacimientoDia;
	}

	public int getCdNacimientoMes() {
		return this.cdNacimientoMes;
	}

	public void setCdNacimientoMes(int cdNacimientoMes) {
		this.cdNacimientoMes = cdNacimientoMes;
	}

	public int getCnCuantasVeces() {
		return this.cnCuantasVeces;
	}

	public void setCnCuantasVeces(int cnCuantasVeces) {
		this.cnCuantasVeces = cnCuantasVeces;
	}

	public int getCnCuantosTatuajes() {
		return this.cnCuantosTatuajes;
	}

	public void setCnCuantosTatuajes(int cnCuantosTatuajes) {
		this.cnCuantosTatuajes = cnCuantosTatuajes;
	}

	public int getCnDependientes() {
		return this.cnDependientes;
	}

	public void setCnDependientes(int cnDependientes) {
		this.cnDependientes = cnDependientes;
	}

	public int getCnEdad() {
		return this.cnEdad;
	}

	public void setCnEdad(int cnEdad) {
		this.cnEdad = cnEdad;
	}

	public String getCnGradoEscolaridad() {
		return this.cnGradoEscolaridad;
	}

	public void setCnGradoEscolaridad(String cnGradoEscolaridad) {
		this.cnGradoEscolaridad = cnGradoEscolaridad;
	}

	public BigDecimal getCnIngresoMensual() {
		return this.cnIngresoMensual;
	}

	public void setCnIngresoMensual(BigDecimal cnIngresoMensual) {
		this.cnIngresoMensual = cnIngresoMensual;
	}

	public int getCnOppOtorgadas() {
		return this.cnOppOtorgadas;
	}

	public void setCnOppOtorgadas(int cnOppOtorgadas) {
		this.cnOppOtorgadas = cnOppOtorgadas;
	}

	public int getCnOppSolicitadas() {
		return this.cnOppSolicitadas;
	}

	public void setCnOppSolicitadas(int cnOppSolicitadas) {
		this.cnOppSolicitadas = cnOppSolicitadas;
	}

	public String getCsApellidoMaterno() {
		return this.csApellidoMaterno;
	}

	public void setCsApellidoMaterno(String csApellidoMaterno) {
		this.csApellidoMaterno = csApellidoMaterno;
	}

	public String getCsApellidoPaterno() {
		return this.csApellidoPaterno;
	}

	public void setCsApellidoPaterno(String csApellidoPaterno) {
		this.csApellidoPaterno = csApellidoPaterno;
	}

	public String getCsApodo() {
		return this.csApodo;
	}

	public void setCsApodo(String csApodo) {
		this.csApodo = csApodo;
	}

	public String getCsCualSolucionAlterna() {
		return this.csCualSolucionAlterna;
	}

	public void setCsCualSolucionAlterna(String csCualSolucionAlterna) {
		this.csCualSolucionAlterna = csCualSolucionAlterna;
	}

	public String getCsCurp() {
		return this.csCurp;
	}

	public void setCsCurp(String csCurp) {
		this.csCurp = csCurp;
	}

	public String getCsDescripcionUbicacionPc() {
		return this.csDescripcionUbicacionPc;
	}

	public void setCsDescripcionUbicacionPc(String csDescripcionUbicacionPc) {
		this.csDescripcionUbicacionPc = csDescripcionUbicacionPc;
	}

	public String getCsDetenidoEn() {
		return this.csDetenidoEn;
	}

	public void setCsDetenidoEn(String csDetenidoEn) {
		this.csDetenidoEn = csDetenidoEn;
	}

	public String getCsDocumentosMigratorios() {
		return this.csDocumentosMigratorios;
	}

	public void setCsDocumentosMigratorios(String csDocumentosMigratorios) {
		this.csDocumentosMigratorios = csDocumentosMigratorios;
	}

	public String getCsEmail() {
		return this.csEmail;
	}

	public void setCsEmail(String csEmail) {
		this.csEmail = csEmail;
	}

	public String getCsEnfermedad() {
		return this.csEnfermedad;
	}

	public void setCsEnfermedad(String csEnfermedad) {
		this.csEnfermedad = csEnfermedad;
	}

	public String getCsNombre() {
		return this.csNombre;
	}

	public void setCsNombre(String csNombre) {
		this.csNombre = csNombre;
	}

	public String getCsNumero() {
		return this.csNumero;
	}

	public void setCsNumero(String csNumero) {
		this.csNumero = csNumero;
	}

	public String getCsOtrosNombres() {
		return this.csOtrosNombres;
	}

	public void setCsOtrosNombres(String csOtrosNombres) {
		this.csOtrosNombres = csOtrosNombres;
	}

	public String getCsRfc() {
		return this.csRfc;
	}

	public void setCsRfc(String csRfc) {
		this.csRfc = csRfc;
	}

	public String getCsTipoIdentificacion() {
		return this.csTipoIdentificacion;
	}

	public void setCsTipoIdentificacion(String csTipoIdentificacion) {
		this.csTipoIdentificacion = csTipoIdentificacion;
	}

	public String getCsTratamientoMedicoPsi() {
		return this.csTratamientoMedicoPsi;
	}

	public void setCsTratamientoMedicoPsi(String csTratamientoMedicoPsi) {
		this.csTratamientoMedicoPsi = csTratamientoMedicoPsi;
	}

	public String getCsUbicacionPoblacionCallejera() {
		return this.csUbicacionPoblacionCallejera;
	}

	public void setCsUbicacionPoblacionCallejera(String csUbicacionPoblacionCallejera) {
		this.csUbicacionPoblacionCallejera = csUbicacionPoblacionCallejera;
	}

	public List<COtro> getCOtros() {
		return this.COtros;
	}

	public void setCOtros(List<COtro> COtros) {
		this.COtros = COtros;
	}

	public COtro addCOtro(COtro COtro) {
		getCOtros().add(COtro);
		COtro.setTPersonaUgj(this);

		return COtro;
	}

	public COtro removeCOtro(COtro COtro) {
		getCOtros().remove(COtro);
		COtro.setTPersonaUgj(null);

		return COtro;
	}

	public List<TAmparo> getTAmparos() {
		return this.TAmparos;
	}

	public void setTAmparos(List<TAmparo> TAmparos) {
		this.TAmparos = TAmparos;
	}

	public TAmparo addTAmparo(TAmparo TAmparo) {
		getTAmparos().add(TAmparo);
		TAmparo.setTPersonaUgj(this);

		return TAmparo;
	}

	public TAmparo removeTAmparo(TAmparo TAmparo) {
		getTAmparos().remove(TAmparo);
		TAmparo.setTPersonaUgj(null);

		return TAmparo;
	}

	public List<TApelacionUgj> getTApelacionUgjs() {
		return this.TApelacionUgjs;
	}

	public void setTApelacionUgjs(List<TApelacionUgj> TApelacionUgjs) {
		this.TApelacionUgjs = TApelacionUgjs;
	}

	public TApelacionUgj addTApelacionUgj(TApelacionUgj TApelacionUgj) {
		getTApelacionUgjs().add(TApelacionUgj);
		TApelacionUgj.setTPersonaUgj(this);

		return TApelacionUgj;
	}

	public TApelacionUgj removeTApelacionUgj(TApelacionUgj TApelacionUgj) {
		getTApelacionUgjs().remove(TApelacionUgj);
		TApelacionUgj.setTPersonaUgj(null);

		return TApelacionUgj;
	}

	public List<TConsumo> getTConsumos() {
		return this.TConsumos;
	}

	public void setTConsumos(List<TConsumo> TConsumos) {
		this.TConsumos = TConsumos;
	}

	public TConsumo addTConsumo(TConsumo TConsumo) {
		getTConsumos().add(TConsumo);
		TConsumo.setTPersonaUgj(this);

		return TConsumo;
	}

	public TConsumo removeTConsumo(TConsumo TConsumo) {
		getTConsumos().remove(TConsumo);
		TConsumo.setTPersonaUgj(null);

		return TConsumo;
	}

	public List<TDomicilio> getTDomicilios() {
		return this.TDomicilios;
	}

	public void setTDomicilios(List<TDomicilio> TDomicilios) {
		this.TDomicilios = TDomicilios;
	}

	public TDomicilio addTDomicilio(TDomicilio TDomicilio) {
		getTDomicilios().add(TDomicilio);
		TDomicilio.setTPersonaUgj(this);

		return TDomicilio;
	}

	public TDomicilio removeTDomicilio(TDomicilio TDomicilio) {
		getTDomicilios().remove(TDomicilio);
		TDomicilio.setTPersonaUgj(null);

		return TDomicilio;
	}

	public List<TGente> getTGentes() {
		return this.TGentes;
	}

	public void setTGentes(List<TGente> TGentes) {
		this.TGentes = TGentes;
	}

	public TGente addTGente(TGente TGente) {
		getTGentes().add(TGente);
		TGente.setTPersonaUgj(this);

		return TGente;
	}

	public TGente removeTGente(TGente TGente) {
		getTGentes().remove(TGente);
		TGente.setTPersonaUgj(null);

		return TGente;
	}

	public List<TListadoAccione> getTListadoAcciones() {
		return this.TListadoAcciones;
	}

	public void setTListadoAcciones(List<TListadoAccione> TListadoAcciones) {
		this.TListadoAcciones = TListadoAcciones;
	}

	public TListadoAccione addTListadoAccione(TListadoAccione TListadoAccione) {
		getTListadoAcciones().add(TListadoAccione);
		TListadoAccione.setTPersonaUgj(this);

		return TListadoAccione;
	}

	public TListadoAccione removeTListadoAccione(TListadoAccione TListadoAccione) {
		getTListadoAcciones().remove(TListadoAccione);
		TListadoAccione.setTPersonaUgj(null);

		return TListadoAccione;
	}

	public List<TListadoFuenteIngreso> getTListadoFuenteIngresos() {
		return this.TListadoFuenteIngresos;
	}

	public void setTListadoFuenteIngresos(List<TListadoFuenteIngreso> TListadoFuenteIngresos) {
		this.TListadoFuenteIngresos = TListadoFuenteIngresos;
	}

	public TListadoFuenteIngreso addTListadoFuenteIngreso(TListadoFuenteIngreso TListadoFuenteIngreso) {
		getTListadoFuenteIngresos().add(TListadoFuenteIngreso);
		TListadoFuenteIngreso.setTPersonaUgj(this);

		return TListadoFuenteIngreso;
	}

	public TListadoFuenteIngreso removeTListadoFuenteIngreso(TListadoFuenteIngreso TListadoFuenteIngreso) {
		getTListadoFuenteIngresos().remove(TListadoFuenteIngreso);
		TListadoFuenteIngreso.setTPersonaUgj(null);

		return TListadoFuenteIngreso;
	}

	public List<TListadoTipoOpp> getTListadoTipoOpps() {
		return this.TListadoTipoOpps;
	}

	public void setTListadoTipoOpps(List<TListadoTipoOpp> TListadoTipoOpps) {
		this.TListadoTipoOpps = TListadoTipoOpps;
	}

	public TListadoTipoOpp addTListadoTipoOpp(TListadoTipoOpp TListadoTipoOpp) {
		getTListadoTipoOpps().add(TListadoTipoOpp);
		TListadoTipoOpp.setTPersonaUgj(this);

		return TListadoTipoOpp;
	}

	public TListadoTipoOpp removeTListadoTipoOpp(TListadoTipoOpp TListadoTipoOpp) {
		getTListadoTipoOpps().remove(TListadoTipoOpp);
		TListadoTipoOpp.setTPersonaUgj(null);

		return TListadoTipoOpp;
	}

	public List<TListadoTipoViolencia> getTListadoTipoViolencias() {
		return this.TListadoTipoViolencias;
	}

	public void setTListadoTipoViolencias(List<TListadoTipoViolencia> TListadoTipoViolencias) {
		this.TListadoTipoViolencias = TListadoTipoViolencias;
	}

	public TListadoTipoViolencia addTListadoTipoViolencia(TListadoTipoViolencia TListadoTipoViolencia) {
		getTListadoTipoViolencias().add(TListadoTipoViolencia);
		TListadoTipoViolencia.setTPersonaUgj(this);

		return TListadoTipoViolencia;
	}

	public TListadoTipoViolencia removeTListadoTipoViolencia(TListadoTipoViolencia TListadoTipoViolencia) {
		getTListadoTipoViolencias().remove(TListadoTipoViolencia);
		TListadoTipoViolencia.setTPersonaUgj(null);

		return TListadoTipoViolencia;
	}

	public CCondicionActividad getCCondicionActividad() {
		return this.CCondicionActividad;
	}

	public void setCCondicionActividad(CCondicionActividad CCondicionActividad) {
		this.CCondicionActividad = CCondicionActividad;
	}

	public CCondicionMigratoria getCCondicionMigratoria() {
		return this.CCondicionMigratoria;
	}

	public void setCCondicionMigratoria(CCondicionMigratoria CCondicionMigratoria) {
		this.CCondicionMigratoria = CCondicionMigratoria;
	}

	public CDiscapacidad getCDiscapacidad() {
		return this.CDiscapacidad;
	}

	public void setCDiscapacidad(CDiscapacidad CDiscapacidad) {
		this.CDiscapacidad = CDiscapacidad;
	}

	public CEntidadFederativaUgj getCEntidadFederativaUgj() {
		return this.CEntidadFederativaUgj;
	}

	public void setCEntidadFederativaUgj(CEntidadFederativaUgj CEntidadFederativaUgj) {
		this.CEntidadFederativaUgj = CEntidadFederativaUgj;
	}

	public CEscolaridad getCEscolaridad() {
		return this.CEscolaridad;
	}

	public void setCEscolaridad(CEscolaridad CEscolaridad) {
		this.CEscolaridad = CEscolaridad;
	}

	public CEstadoPsicofisicoImputado getCEstadoPsicofisicoImputado() {
		return this.CEstadoPsicofisicoImputado;
	}

	public void setCEstadoPsicofisicoImputado(CEstadoPsicofisicoImputado CEstadoPsicofisicoImputado) {
		this.CEstadoPsicofisicoImputado = CEstadoPsicofisicoImputado;
	}

	public CGrupoIndigena getCGrupoIndigena() {
		return this.CGrupoIndigena;
	}

	public void setCGrupoIndigena(CGrupoIndigena CGrupoIndigena) {
		this.CGrupoIndigena = CGrupoIndigena;
	}

	public CLenguaExtranjera getCLenguaExtranjera() {
		return this.CLenguaExtranjera;
	}

	public void setCLenguaExtranjera(CLenguaExtranjera CLenguaExtranjera) {
		this.CLenguaExtranjera = CLenguaExtranjera;
	}

	public CLenguaIndigenaUgj getCLenguaIndigenaUgj() {
		return this.CLenguaIndigenaUgj;
	}

	public void setCLenguaIndigenaUgj(CLenguaIndigenaUgj CLenguaIndigenaUgj) {
		this.CLenguaIndigenaUgj = CLenguaIndigenaUgj;
	}

	public CMunicipioUgj getCMunicipioUgj() {
		return this.CMunicipioUgj;
	}

	public void setCMunicipioUgj(CMunicipioUgj CMunicipioUgj) {
		this.CMunicipioUgj = CMunicipioUgj;
	}

	public CNacionalidadUgj getCNacionalidadUgj() {
		return this.CNacionalidadUgj;
	}

	public void setCNacionalidadUgj(CNacionalidadUgj CNacionalidadUgj) {
		this.CNacionalidadUgj = CNacionalidadUgj;
	}

	public CNotificarA getCNotificarA() {
		return this.CNotificarA;
	}

	public void setCNotificarA(CNotificarA CNotificarA) {
		this.CNotificarA = CNotificarA;
	}

	public COcupacionUgj getCOcupacionUgj() {
		return this.COcupacionUgj;
	}

	public void setCOcupacionUgj(COcupacionUgj COcupacionUgj) {
		this.COcupacionUgj = COcupacionUgj;
	}

	public CPaisUgj getCPaisUgj() {
		return this.CPaisUgj;
	}

	public void setCPaisUgj(CPaisUgj CPaisUgj) {
		this.CPaisUgj = CPaisUgj;
	}

	public CRelacion getCRelacion() {
		return this.CRelacion;
	}

	public void setCRelacion(CRelacion CRelacion) {
		this.CRelacion = CRelacion;
	}

	public CReligion getCReligion() {
		return this.CReligion;
	}

	public void setCReligion(CReligion CReligion) {
		this.CReligion = CReligion;
	}

	public CSexo getCSexo() {
		return this.CSexo;
	}

	public void setCSexo(CSexo CSexo) {
		this.CSexo = CSexo;
	}

	public CSituacionConyugal getCSituacionConyugal() {
		return this.CSituacionConyugal;
	}

	public void setCSituacionConyugal(CSituacionConyugal CSituacionConyugal) {
		this.CSituacionConyugal = CSituacionConyugal;
	}

	public CTipoOfendidoVictima getCTipoOfendidoVictima() {
		return this.CTipoOfendidoVictima;
	}

	public void setCTipoOfendidoVictima(CTipoOfendidoVictima CTipoOfendidoVictima) {
		this.CTipoOfendidoVictima = CTipoOfendidoVictima;
	}

	public CTipoPersona getCTipoPersona() {
		return this.CTipoPersona;
	}

	public void setCTipoPersona(CTipoPersona CTipoPersona) {
		this.CTipoPersona = CTipoPersona;
	}

	public List<TPrision> getTPrisions() {
		return this.TPrisions;
	}

	public void setTPrisions(List<TPrision> TPrisions) {
		this.TPrisions = TPrisions;
	}

	public TPrision addTPrision(TPrision TPrision) {
		getTPrisions().add(TPrision);
		TPrision.setTPersonaUgj(this);

		return TPrision;
	}

	public TPrision removeTPrision(TPrision TPrision) {
		getTPrisions().remove(TPrision);
		TPrision.setTPersonaUgj(null);

		return TPrision;
	}

	public List<TProcesoJudicial> getTProcesoJudicials() {
		return this.TProcesoJudicials;
	}

	public void setTProcesoJudicials(List<TProcesoJudicial> TProcesoJudicials) {
		this.TProcesoJudicials = TProcesoJudicials;
	}

	public TProcesoJudicial addTProcesoJudicial(TProcesoJudicial TProcesoJudicial) {
		getTProcesoJudicials().add(TProcesoJudicial);
		TProcesoJudicial.setTPersonaUgj(this);

		return TProcesoJudicial;
	}

	public TProcesoJudicial removeTProcesoJudicial(TProcesoJudicial TProcesoJudicial) {
		getTProcesoJudicials().remove(TProcesoJudicial);
		TProcesoJudicial.setTPersonaUgj(null);

		return TProcesoJudicial;
	}

	public List<TTatuaje> getTTatuajes() {
		return this.TTatuajes;
	}

	public void setTTatuajes(List<TTatuaje> TTatuajes) {
		this.TTatuajes = TTatuajes;
	}

	public TTatuaje addTTatuaje(TTatuaje TTatuaje) {
		getTTatuajes().add(TTatuaje);
		TTatuaje.setTPersonaUgj(this);

		return TTatuaje;
	}

	public TTatuaje removeTTatuaje(TTatuaje TTatuaje) {
		getTTatuajes().remove(TTatuaje);
		TTatuaje.setTPersonaUgj(null);

		return TTatuaje;
	}

	public List<TTelefono> getTTelefonos() {
		return this.TTelefonos;
	}

	public void setTTelefonos(List<TTelefono> TTelefonos) {
		this.TTelefonos = TTelefonos;
	}

	public TTelefono addTTelefono(TTelefono TTelefono) {
		getTTelefonos().add(TTelefono);
		TTelefono.setTPersonaUgj(this);

		return TTelefono;
	}

	public TTelefono removeTTelefono(TTelefono TTelefono) {
		getTTelefonos().remove(TTelefono);
		TTelefono.setTPersonaUgj(null);

		return TTelefono;
	}

}