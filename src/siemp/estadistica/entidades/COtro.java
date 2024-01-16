package siemp.estadistica.entidades;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the c_otro database table.
 * 
 */
@Entity
@Table(name="c_otro")
@NamedQuery(name="COtro.findAll", query="SELECT c FROM COtro c")
public class COtro implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="cn_otro_id")
	private String cnOtroId;

	@Column(name="cs_otro")
	private String csOtro;

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

	//bi-directional many-to-one association to CEscolaridad
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="cn_escolaridad_id")
	private CEscolaridad CEscolaridad;

	//bi-directional many-to-one association to CEstadoPsicofisicoImputado
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="cn_estado_psicofisico_imputado_id")
	private CEstadoPsicofisicoImputado CEstadoPsicofisicoImputado;

	//bi-directional many-to-one association to CEtapaMandamientoJudicial
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="cn_etapa_mandamiento_judicial_id")
	private CEtapaMandamientoJudicial CEtapaMandamientoJudicial;

	//bi-directional many-to-one association to CEtapaSolicitudAmparo
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="cn_etapa_solicitud_amparo_id")
	private CEtapaSolicitudAmparo CEtapaSolicitudAmparo;

	//bi-directional many-to-one association to CEtapaSolicitudRecurso
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="cn_etapa_resolucion_recurso_id")
	private CEtapaSolicitudRecurso CEtapaSolicitudRecurso;

	//bi-directional many-to-one association to CFuenteIngreso
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="cn_fuente_ingresos_id")
	private CFuenteIngreso CFuenteIngreso;

	//bi-directional many-to-one association to CGrupoIndigena
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="cn_grupo_indigena_id")
	private CGrupoIndigena CGrupoIndigena;

	//bi-directional many-to-one association to CLenguaIndigenaUgj
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="cn_lengua_indigena_id")
	private CLenguaIndigenaUgj CLenguaIndigenaUgj;

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

	//bi-directional many-to-one association to CRelacion
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="cn_relacion_id")
	private CRelacion CRelacion;

	//bi-directional many-to-one association to CSexo
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="cn_sexo_id")
	private CSexo CSexo;

	//bi-directional many-to-one association to CSituacionConyugal
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="cn_situacion_conyugal_id")
	private CSituacionConyugal CSituacionConyugal;

	//bi-directional many-to-one association to CSustancia
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="cn_sustancia_id")
	private CSustancia CSustancia;

	//bi-directional many-to-one association to CTipoResolucionAmparo
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="cn_tipo_resolucion_amparo_id")
	private CTipoResolucionAmparo CTipoResolucionAmparo;

	//bi-directional many-to-one association to CTipoResolucionApelable
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="cn_tipo_resolucion_apelable_id")
	private CTipoResolucionApelable CTipoResolucionApelable;

	//bi-directional many-to-one association to TCuestionario
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="cn_cuestionario_a_id")
	private TCuestionario TCuestionario;

	//bi-directional many-to-one association to TPersonaUgj
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="cn_persona_id")
	private TPersonaUgj TPersonaUgj;

	public COtro() {
	}

	public String getCnOtroId() {
		return this.cnOtroId;
	}

	public void setCnOtroId(String cnOtroId) {
		this.cnOtroId = cnOtroId;
	}

	public String getCsOtro() {
		return this.csOtro;
	}

	public void setCsOtro(String csOtro) {
		this.csOtro = csOtro;
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

	public CEtapaMandamientoJudicial getCEtapaMandamientoJudicial() {
		return this.CEtapaMandamientoJudicial;
	}

	public void setCEtapaMandamientoJudicial(CEtapaMandamientoJudicial CEtapaMandamientoJudicial) {
		this.CEtapaMandamientoJudicial = CEtapaMandamientoJudicial;
	}

	public CEtapaSolicitudAmparo getCEtapaSolicitudAmparo() {
		return this.CEtapaSolicitudAmparo;
	}

	public void setCEtapaSolicitudAmparo(CEtapaSolicitudAmparo CEtapaSolicitudAmparo) {
		this.CEtapaSolicitudAmparo = CEtapaSolicitudAmparo;
	}

	public CEtapaSolicitudRecurso getCEtapaSolicitudRecurso() {
		return this.CEtapaSolicitudRecurso;
	}

	public void setCEtapaSolicitudRecurso(CEtapaSolicitudRecurso CEtapaSolicitudRecurso) {
		this.CEtapaSolicitudRecurso = CEtapaSolicitudRecurso;
	}

	public CFuenteIngreso getCFuenteIngreso() {
		return this.CFuenteIngreso;
	}

	public void setCFuenteIngreso(CFuenteIngreso CFuenteIngreso) {
		this.CFuenteIngreso = CFuenteIngreso;
	}

	public CGrupoIndigena getCGrupoIndigena() {
		return this.CGrupoIndigena;
	}

	public void setCGrupoIndigena(CGrupoIndigena CGrupoIndigena) {
		this.CGrupoIndigena = CGrupoIndigena;
	}

	public CLenguaIndigenaUgj getCLenguaIndigenaUgj() {
		return this.CLenguaIndigenaUgj;
	}

	public void setCLenguaIndigenaUgj(CLenguaIndigenaUgj CLenguaIndigenaUgj) {
		this.CLenguaIndigenaUgj = CLenguaIndigenaUgj;
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

	public CRelacion getCRelacion() {
		return this.CRelacion;
	}

	public void setCRelacion(CRelacion CRelacion) {
		this.CRelacion = CRelacion;
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

	public CSustancia getCSustancia() {
		return this.CSustancia;
	}

	public void setCSustancia(CSustancia CSustancia) {
		this.CSustancia = CSustancia;
	}

	public CTipoResolucionAmparo getCTipoResolucionAmparo() {
		return this.CTipoResolucionAmparo;
	}

	public void setCTipoResolucionAmparo(CTipoResolucionAmparo CTipoResolucionAmparo) {
		this.CTipoResolucionAmparo = CTipoResolucionAmparo;
	}

	public CTipoResolucionApelable getCTipoResolucionApelable() {
		return this.CTipoResolucionApelable;
	}

	public void setCTipoResolucionApelable(CTipoResolucionApelable CTipoResolucionApelable) {
		this.CTipoResolucionApelable = CTipoResolucionApelable;
	}

	public TCuestionario getTCuestionario() {
		return this.TCuestionario;
	}

	public void setTCuestionario(TCuestionario TCuestionario) {
		this.TCuestionario = TCuestionario;
	}

	public TPersonaUgj getTPersonaUgj() {
		return this.TPersonaUgj;
	}

	public void setTPersonaUgj(TPersonaUgj TPersonaUgj) {
		this.TPersonaUgj = TPersonaUgj;
	}

}