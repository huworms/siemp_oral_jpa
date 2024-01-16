package siemp.estadistica.entidades;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_hechos_pgjdf database table.
 * 
 */
@Entity
@Table(name="t_hechos_pgjdf")
@NamedQuery(name="THechosPgjdf.findAll", query="SELECT t FROM THechosPgjdf t")
public class THechosPgjdf implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_hechos_pgjdf")
	private String idHechosPgjdf;

	private String calle1;

	private String calle2;

	private String colonia;

	private String cp;

	private String delegacion;

	private String fecha;

	private String geoX;

	private String geoY;

	private String hora;

	@Lob
	private String sintesis;

	//bi-directional many-to-one association to TInvestigacionPgjdf
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_ci_investigacion")
	private TInvestigacionPgjdf TInvestigacionPgjdf;

	public THechosPgjdf() {
	}

	public String getIdHechosPgjdf() {
		return this.idHechosPgjdf;
	}

	public void setIdHechosPgjdf(String idHechosPgjdf) {
		this.idHechosPgjdf = idHechosPgjdf;
	}

	public String getCalle1() {
		return this.calle1;
	}

	public void setCalle1(String calle1) {
		this.calle1 = calle1;
	}

	public String getCalle2() {
		return this.calle2;
	}

	public void setCalle2(String calle2) {
		this.calle2 = calle2;
	}

	public String getColonia() {
		return this.colonia;
	}

	public void setColonia(String colonia) {
		this.colonia = colonia;
	}

	public String getCp() {
		return this.cp;
	}

	public void setCp(String cp) {
		this.cp = cp;
	}

	public String getDelegacion() {
		return this.delegacion;
	}

	public void setDelegacion(String delegacion) {
		this.delegacion = delegacion;
	}

	public String getFecha() {
		return this.fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getGeoX() {
		return this.geoX;
	}

	public void setGeoX(String geoX) {
		this.geoX = geoX;
	}

	public String getGeoY() {
		return this.geoY;
	}

	public void setGeoY(String geoY) {
		this.geoY = geoY;
	}

	public String getHora() {
		return this.hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getSintesis() {
		return this.sintesis;
	}

	public void setSintesis(String sintesis) {
		this.sintesis = sintesis;
	}

	public TInvestigacionPgjdf getTInvestigacionPgjdf() {
		return this.TInvestigacionPgjdf;
	}

	public void setTInvestigacionPgjdf(TInvestigacionPgjdf TInvestigacionPgjdf) {
		this.TInvestigacionPgjdf = TInvestigacionPgjdf;
	}

}