package siemp.estadistica.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the t_sentencia database table.
 * 
 */
@Entity
@Table(name="t_sentencia")
@NamedQuery(name="TSentencia.findAll", query="SELECT t FROM TSentencia t")
public class TSentencia implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_acto_procesal")
	private String idActoProcesal;

	private int anios;

	private int dias;

	@Temporal(TemporalType.DATE)
	@Column(name="fecha_inicio_cumplimiento")
	private Date fechaInicioCumplimiento;

	@Column(name="forma_proceso")
	private String formaProceso;

	@Column(name="medida_alternativa_privacion")
	private String medidaAlternativaPrivacion;

	private int meses;

	@Column(name="modo_sentencia")
	private int modoSentencia;

	@Column(name="monto_reparacion")
	private BigDecimal montoReparacion;

	@Lob
	@Column(name="otra_reparacion")
	private String otraReparacion;

	private String otro;

	private String pago;

	private String remplazo;

	@Column(name="reparacion_danio")
	private String reparacionDanio;

	@Column(name="reparacion_objeto")
	private String reparacionObjeto;

	private String restitucion;

	//bi-directional one-to-one association to TActoProcesal
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_acto_procesal")
	private TActoProcesal TActoProcesal;

	public TSentencia() {
	}

	public String getIdActoProcesal() {
		return this.idActoProcesal;
	}

	public void setIdActoProcesal(String idActoProcesal) {
		this.idActoProcesal = idActoProcesal;
	}

	public int getAnios() {
		return this.anios;
	}

	public void setAnios(int anios) {
		this.anios = anios;
	}

	public int getDias() {
		return this.dias;
	}

	public void setDias(int dias) {
		this.dias = dias;
	}

	public Date getFechaInicioCumplimiento() {
		return this.fechaInicioCumplimiento;
	}

	public void setFechaInicioCumplimiento(Date fechaInicioCumplimiento) {
		this.fechaInicioCumplimiento = fechaInicioCumplimiento;
	}

	public String getFormaProceso() {
		return this.formaProceso;
	}

	public void setFormaProceso(String formaProceso) {
		this.formaProceso = formaProceso;
	}

	public String getMedidaAlternativaPrivacion() {
		return this.medidaAlternativaPrivacion;
	}

	public void setMedidaAlternativaPrivacion(String medidaAlternativaPrivacion) {
		this.medidaAlternativaPrivacion = medidaAlternativaPrivacion;
	}

	public int getMeses() {
		return this.meses;
	}

	public void setMeses(int meses) {
		this.meses = meses;
	}

	public int getModoSentencia() {
		return this.modoSentencia;
	}

	public void setModoSentencia(int modoSentencia) {
		this.modoSentencia = modoSentencia;
	}

	public BigDecimal getMontoReparacion() {
		return this.montoReparacion;
	}

	public void setMontoReparacion(BigDecimal montoReparacion) {
		this.montoReparacion = montoReparacion;
	}

	public String getOtraReparacion() {
		return this.otraReparacion;
	}

	public void setOtraReparacion(String otraReparacion) {
		this.otraReparacion = otraReparacion;
	}

	public String getOtro() {
		return this.otro;
	}

	public void setOtro(String otro) {
		this.otro = otro;
	}

	public String getPago() {
		return this.pago;
	}

	public void setPago(String pago) {
		this.pago = pago;
	}

	public String getRemplazo() {
		return this.remplazo;
	}

	public void setRemplazo(String remplazo) {
		this.remplazo = remplazo;
	}

	public String getReparacionDanio() {
		return this.reparacionDanio;
	}

	public void setReparacionDanio(String reparacionDanio) {
		this.reparacionDanio = reparacionDanio;
	}

	public String getReparacionObjeto() {
		return this.reparacionObjeto;
	}

	public void setReparacionObjeto(String reparacionObjeto) {
		this.reparacionObjeto = reparacionObjeto;
	}

	public String getRestitucion() {
		return this.restitucion;
	}

	public void setRestitucion(String restitucion) {
		this.restitucion = restitucion;
	}

	public TActoProcesal getTActoProcesal() {
		return this.TActoProcesal;
	}

	public void setTActoProcesal(TActoProcesal TActoProcesal) {
		this.TActoProcesal = TActoProcesal;
	}

}