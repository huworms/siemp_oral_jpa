package siemp.estadistica.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the t_reporte_mensual database table.
 * 
 */
@Entity
@Table(name="t_reporte_mensual")
@NamedQuery(name="TReporteMensual.findAll", query="SELECT t FROM TReporteMensual t")
public class TReporteMensual implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_reporte_mensual")
	private int idReporteMensual;

	private int anio;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="fecha_acuse")
	private Date fechaAcuse;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="fecha_validacion")
	private Date fechaValidacion;

	@Column(name="forma_reporte")
	private String formaReporte;

	@Column(name="id_entidad")
	private int idEntidad;

	private int idUsuario;

	private int idUsuario_valida;

	private int mes;

	@Lob
	private String observaciones;

	@Column(name="tipo_informe")
	private String tipoInforme;

	//bi-directional many-to-one association to TConteo
	@OneToMany(mappedBy="TReporteMensual")
	private List<TConteo> TConteos;

	public TReporteMensual() {
	}

	public int getIdReporteMensual() {
		return this.idReporteMensual;
	}

	public void setIdReporteMensual(int idReporteMensual) {
		this.idReporteMensual = idReporteMensual;
	}

	public int getAnio() {
		return this.anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public Date getFechaAcuse() {
		return this.fechaAcuse;
	}

	public void setFechaAcuse(Date fechaAcuse) {
		this.fechaAcuse = fechaAcuse;
	}

	public Date getFechaValidacion() {
		return this.fechaValidacion;
	}

	public void setFechaValidacion(Date fechaValidacion) {
		this.fechaValidacion = fechaValidacion;
	}

	public String getFormaReporte() {
		return this.formaReporte;
	}

	public void setFormaReporte(String formaReporte) {
		this.formaReporte = formaReporte;
	}

	public int getIdEntidad() {
		return this.idEntidad;
	}

	public void setIdEntidad(int idEntidad) {
		this.idEntidad = idEntidad;
	}

	public int getIdUsuario() {
		return this.idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public int getIdUsuario_valida() {
		return this.idUsuario_valida;
	}

	public void setIdUsuario_valida(int idUsuario_valida) {
		this.idUsuario_valida = idUsuario_valida;
	}

	public int getMes() {
		return this.mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public String getObservaciones() {
		return this.observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public String getTipoInforme() {
		return this.tipoInforme;
	}

	public void setTipoInforme(String tipoInforme) {
		this.tipoInforme = tipoInforme;
	}

	public List<TConteo> getTConteos() {
		return this.TConteos;
	}

	public void setTConteos(List<TConteo> TConteos) {
		this.TConteos = TConteos;
	}

	public TConteo addTConteo(TConteo TConteo) {
		getTConteos().add(TConteo);
		TConteo.setTReporteMensual(this);

		return TConteo;
	}

	public TConteo removeTConteo(TConteo TConteo) {
		getTConteos().remove(TConteo);
		TConteo.setTReporteMensual(null);

		return TConteo;
	}

}