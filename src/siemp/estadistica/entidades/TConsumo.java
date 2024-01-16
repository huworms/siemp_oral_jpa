package siemp.estadistica.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the t_consumo database table.
 * 
 */
@Entity
@Table(name="t_consumo")
@NamedQuery(name="TConsumo.findAll", query="SELECT t FROM TConsumo t")
public class TConsumo implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TConsumoPK id;

	@Temporal(TemporalType.DATE)
	@Column(name="cd_ultimo_consumo")
	private Date cdUltimoConsumo;

	@Column(name="cn_cantidad")
	private String cnCantidad;

	@Column(name="cn_edad_inicio")
	private int cnEdadInicio;

	//bi-directional many-to-one association to CPeriodicidad
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="cn_periodicidad_id", insertable=false, updatable=false)
	private CPeriodicidad CPeriodicidad;

	//bi-directional many-to-one association to CSustancia
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="cn_sustancia_id", insertable=false, updatable=false)
	private CSustancia CSustancia;

	//bi-directional many-to-one association to TPersonaUgj
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="cn_persona_id", insertable=false, updatable=false)
	private TPersonaUgj TPersonaUgj;

	public TConsumo() {
	}

	public TConsumoPK getId() {
		return this.id;
	}

	public void setId(TConsumoPK id) {
		this.id = id;
	}

	public Date getCdUltimoConsumo() {
		return this.cdUltimoConsumo;
	}

	public void setCdUltimoConsumo(Date cdUltimoConsumo) {
		this.cdUltimoConsumo = cdUltimoConsumo;
	}

	public String getCnCantidad() {
		return this.cnCantidad;
	}

	public void setCnCantidad(String cnCantidad) {
		this.cnCantidad = cnCantidad;
	}

	public int getCnEdadInicio() {
		return this.cnEdadInicio;
	}

	public void setCnEdadInicio(int cnEdadInicio) {
		this.cnEdadInicio = cnEdadInicio;
	}

	public CPeriodicidad getCPeriodicidad() {
		return this.CPeriodicidad;
	}

	public void setCPeriodicidad(CPeriodicidad CPeriodicidad) {
		this.CPeriodicidad = CPeriodicidad;
	}

	public CSustancia getCSustancia() {
		return this.CSustancia;
	}

	public void setCSustancia(CSustancia CSustancia) {
		this.CSustancia = CSustancia;
	}

	public TPersonaUgj getTPersonaUgj() {
		return this.TPersonaUgj;
	}

	public void setTPersonaUgj(TPersonaUgj TPersonaUgj) {
		this.TPersonaUgj = TPersonaUgj;
	}

}