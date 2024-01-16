package siemp.estadistica.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the t_dato_delito database table.
 * 
 */
@Entity
@Table(name="t_dato_delito")
@NamedQuery(name="TDatoDelito.findAll", query="SELECT t FROM TDatoDelito t")
public class TDatoDelito implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_delito")
	private String idDelito;

	private String colonia;

	private int concurso;

	@Column(name="elementos_comision")
	private int elementosComision;

	@Column(name="estado_psicofisico")
	private String estadoPsicofisico;

	private int exclusion;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="fecha_ocurrencia")
	private Date fechaOcurrencia;

	@Column(name="id_entidad_federativa")
	private int idEntidadFederativa;

	@Column(name="id_municipio")
	private int idMunicipio;

	@Column(name="modalidad_agresion")
	private int modalidadAgresion;

	@Lob
	private String observaciones;

	@Column(name="otra_exclusion")
	private String otraExclusion;

	@Column(name="otro_estado_psicofisico")
	private String otroEstadoPsicofisico;

	@Column(name="rep_conclusion")
	private String repConclusion;

	@Column(name="rep_imputado")
	private String repImputado;

	private String sobreseimiento;

	//bi-directional one-to-one association to TDelito
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_delito")
	private TDelito TDelito;

	public TDatoDelito() {
	}

	public String getIdDelito() {
		return this.idDelito;
	}

	public void setIdDelito(String idDelito) {
		this.idDelito = idDelito;
	}

	public String getColonia() {
		return this.colonia;
	}

	public void setColonia(String colonia) {
		this.colonia = colonia;
	}

	public int getConcurso() {
		return this.concurso;
	}

	public void setConcurso(int concurso) {
		this.concurso = concurso;
	}

	public int getElementosComision() {
		return this.elementosComision;
	}

	public void setElementosComision(int elementosComision) {
		this.elementosComision = elementosComision;
	}

	public String getEstadoPsicofisico() {
		return this.estadoPsicofisico;
	}

	public void setEstadoPsicofisico(String estadoPsicofisico) {
		this.estadoPsicofisico = estadoPsicofisico;
	}

	public int getExclusion() {
		return this.exclusion;
	}

	public void setExclusion(int exclusion) {
		this.exclusion = exclusion;
	}

	public Date getFechaOcurrencia() {
		return this.fechaOcurrencia;
	}

	public void setFechaOcurrencia(Date fechaOcurrencia) {
		this.fechaOcurrencia = fechaOcurrencia;
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

	public int getModalidadAgresion() {
		return this.modalidadAgresion;
	}

	public void setModalidadAgresion(int modalidadAgresion) {
		this.modalidadAgresion = modalidadAgresion;
	}

	public String getObservaciones() {
		return this.observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public String getOtraExclusion() {
		return this.otraExclusion;
	}

	public void setOtraExclusion(String otraExclusion) {
		this.otraExclusion = otraExclusion;
	}

	public String getOtroEstadoPsicofisico() {
		return this.otroEstadoPsicofisico;
	}

	public void setOtroEstadoPsicofisico(String otroEstadoPsicofisico) {
		this.otroEstadoPsicofisico = otroEstadoPsicofisico;
	}

	public String getRepConclusion() {
		return this.repConclusion;
	}

	public void setRepConclusion(String repConclusion) {
		this.repConclusion = repConclusion;
	}

	public String getRepImputado() {
		return this.repImputado;
	}

	public void setRepImputado(String repImputado) {
		this.repImputado = repImputado;
	}

	public String getSobreseimiento() {
		return this.sobreseimiento;
	}

	public void setSobreseimiento(String sobreseimiento) {
		this.sobreseimiento = sobreseimiento;
	}

	public TDelito getTDelito() {
		return this.TDelito;
	}

	public void setTDelito(TDelito TDelito) {
		this.TDelito = TDelito;
	}

}