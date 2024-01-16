package siemp.estadistica.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigInteger;
import java.util.List;


/**
 * The persistent class for the t_investigacion_pgjdf database table.
 * 
 */
@Entity
@Table(name="t_investigacion_pgjdf")
@NamedQuery(name="TInvestigacionPgjdf.findAll", query="SELECT t FROM TInvestigacionPgjdf t")
public class TInvestigacionPgjdf implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_ci_investigacion")
	private String idCiInvestigacion;

	private String bis;

	private String desglose;

	private String fechaInicio;

	private String horaInicio;

	@Column(name="id_tsjdf")
	private BigInteger idTsjdf;

	private String mp;

	@Column(name="num_carpeta_investigacion")
	private String numCarpetaInvestigacion;

	private String relacionada;

	@Column(name="unidad_investigacion")
	private String unidadInvestigacion;

	//bi-directional many-to-one association to TDelitoPgjdf
	@OneToMany(mappedBy="TInvestigacionPgjdf")
	private List<TDelitoPgjdf> TDelitoPgjdfs;

	//bi-directional many-to-one association to THechosPgjdf
	@OneToMany(mappedBy="TInvestigacionPgjdf")
	private List<THechosPgjdf> THechosPgjdfs;

	//bi-directional many-to-one association to TPersonaPgjdf
	@OneToMany(mappedBy="TInvestigacionPgjdf")
	private List<TPersonaPgjdf> TPersonaPgjdfs;

	public TInvestigacionPgjdf() {
	}

	public String getIdCiInvestigacion() {
		return this.idCiInvestigacion;
	}

	public void setIdCiInvestigacion(String idCiInvestigacion) {
		this.idCiInvestigacion = idCiInvestigacion;
	}

	public String getBis() {
		return this.bis;
	}

	public void setBis(String bis) {
		this.bis = bis;
	}

	public String getDesglose() {
		return this.desglose;
	}

	public void setDesglose(String desglose) {
		this.desglose = desglose;
	}

	public String getFechaInicio() {
		return this.fechaInicio;
	}

	public void setFechaInicio(String fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public String getHoraInicio() {
		return this.horaInicio;
	}

	public void setHoraInicio(String horaInicio) {
		this.horaInicio = horaInicio;
	}

	public BigInteger getIdTsjdf() {
		return this.idTsjdf;
	}

	public void setIdTsjdf(BigInteger idTsjdf) {
		this.idTsjdf = idTsjdf;
	}

	public String getMp() {
		return this.mp;
	}

	public void setMp(String mp) {
		this.mp = mp;
	}

	public String getNumCarpetaInvestigacion() {
		return this.numCarpetaInvestigacion;
	}

	public void setNumCarpetaInvestigacion(String numCarpetaInvestigacion) {
		this.numCarpetaInvestigacion = numCarpetaInvestigacion;
	}

	public String getRelacionada() {
		return this.relacionada;
	}

	public void setRelacionada(String relacionada) {
		this.relacionada = relacionada;
	}

	public String getUnidadInvestigacion() {
		return this.unidadInvestigacion;
	}

	public void setUnidadInvestigacion(String unidadInvestigacion) {
		this.unidadInvestigacion = unidadInvestigacion;
	}

	public List<TDelitoPgjdf> getTDelitoPgjdfs() {
		return this.TDelitoPgjdfs;
	}

	public void setTDelitoPgjdfs(List<TDelitoPgjdf> TDelitoPgjdfs) {
		this.TDelitoPgjdfs = TDelitoPgjdfs;
	}

	public TDelitoPgjdf addTDelitoPgjdf(TDelitoPgjdf TDelitoPgjdf) {
		getTDelitoPgjdfs().add(TDelitoPgjdf);
		TDelitoPgjdf.setTInvestigacionPgjdf(this);

		return TDelitoPgjdf;
	}

	public TDelitoPgjdf removeTDelitoPgjdf(TDelitoPgjdf TDelitoPgjdf) {
		getTDelitoPgjdfs().remove(TDelitoPgjdf);
		TDelitoPgjdf.setTInvestigacionPgjdf(null);

		return TDelitoPgjdf;
	}

	public List<THechosPgjdf> getTHechosPgjdfs() {
		return this.THechosPgjdfs;
	}

	public void setTHechosPgjdfs(List<THechosPgjdf> THechosPgjdfs) {
		this.THechosPgjdfs = THechosPgjdfs;
	}

	public THechosPgjdf addTHechosPgjdf(THechosPgjdf THechosPgjdf) {
		getTHechosPgjdfs().add(THechosPgjdf);
		THechosPgjdf.setTInvestigacionPgjdf(this);

		return THechosPgjdf;
	}

	public THechosPgjdf removeTHechosPgjdf(THechosPgjdf THechosPgjdf) {
		getTHechosPgjdfs().remove(THechosPgjdf);
		THechosPgjdf.setTInvestigacionPgjdf(null);

		return THechosPgjdf;
	}

	public List<TPersonaPgjdf> getTPersonaPgjdfs() {
		return this.TPersonaPgjdfs;
	}

	public void setTPersonaPgjdfs(List<TPersonaPgjdf> TPersonaPgjdfs) {
		this.TPersonaPgjdfs = TPersonaPgjdfs;
	}

	public TPersonaPgjdf addTPersonaPgjdf(TPersonaPgjdf TPersonaPgjdf) {
		getTPersonaPgjdfs().add(TPersonaPgjdf);
		TPersonaPgjdf.setTInvestigacionPgjdf(this);

		return TPersonaPgjdf;
	}

	public TPersonaPgjdf removeTPersonaPgjdf(TPersonaPgjdf TPersonaPgjdf) {
		getTPersonaPgjdfs().remove(TPersonaPgjdf);
		TPersonaPgjdf.setTInvestigacionPgjdf(null);

		return TPersonaPgjdf;
	}

}