package siemp.estadistica.entidades;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_domicilio database table.
 * 
 */
@Entity
@Table(name="t_domicilio")
@NamedQuery(name="TDomicilio.findAll", query="SELECT t FROM TDomicilio t")
public class TDomicilio implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="cn_domicilio_id")
	private String cnDomicilioId;

	@Column(name="cb_activo")
	private byte cbActivo;

	@Column(name="cs_aifrd_calle")
	private String csAifrdCalle;

	@Column(name="cs_aifrd_colonia")
	private String csAifrdColonia;

	@Column(name="cs_aifrd_cp")
	private String csAifrdCp;

	@Column(name="cs_aifrd_numero")
	private String csAifrdNumero;

	@Lob
	@Column(name="cs_referencia")
	private String csReferencia;

	//bi-directional many-to-one association to CEntidadFederativaUgj
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="cn_entidad_id")
	private CEntidadFederativaUgj CEntidadFederativaUgj;

	//bi-directional many-to-one association to CMunicipioUgj
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="cn_municipio_id")
	private CMunicipioUgj CMunicipioUgj;

	//bi-directional many-to-one association to CPaisUgj
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="cn_pais_id")
	private CPaisUgj CPaisUgj;

	//bi-directional many-to-one association to TPersonaUgj
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="cn_persona_id")
	private TPersonaUgj TPersonaUgj;

	public TDomicilio() {
	}

	public String getCnDomicilioId() {
		return this.cnDomicilioId;
	}

	public void setCnDomicilioId(String cnDomicilioId) {
		this.cnDomicilioId = cnDomicilioId;
	}

	public byte getCbActivo() {
		return this.cbActivo;
	}

	public void setCbActivo(byte cbActivo) {
		this.cbActivo = cbActivo;
	}

	public String getCsAifrdCalle() {
		return this.csAifrdCalle;
	}

	public void setCsAifrdCalle(String csAifrdCalle) {
		this.csAifrdCalle = csAifrdCalle;
	}

	public String getCsAifrdColonia() {
		return this.csAifrdColonia;
	}

	public void setCsAifrdColonia(String csAifrdColonia) {
		this.csAifrdColonia = csAifrdColonia;
	}

	public String getCsAifrdCp() {
		return this.csAifrdCp;
	}

	public void setCsAifrdCp(String csAifrdCp) {
		this.csAifrdCp = csAifrdCp;
	}

	public String getCsAifrdNumero() {
		return this.csAifrdNumero;
	}

	public void setCsAifrdNumero(String csAifrdNumero) {
		this.csAifrdNumero = csAifrdNumero;
	}

	public String getCsReferencia() {
		return this.csReferencia;
	}

	public void setCsReferencia(String csReferencia) {
		this.csReferencia = csReferencia;
	}

	public CEntidadFederativaUgj getCEntidadFederativaUgj() {
		return this.CEntidadFederativaUgj;
	}

	public void setCEntidadFederativaUgj(CEntidadFederativaUgj CEntidadFederativaUgj) {
		this.CEntidadFederativaUgj = CEntidadFederativaUgj;
	}

	public CMunicipioUgj getCMunicipioUgj() {
		return this.CMunicipioUgj;
	}

	public void setCMunicipioUgj(CMunicipioUgj CMunicipioUgj) {
		this.CMunicipioUgj = CMunicipioUgj;
	}

	public CPaisUgj getCPaisUgj() {
		return this.CPaisUgj;
	}

	public void setCPaisUgj(CPaisUgj CPaisUgj) {
		this.CPaisUgj = CPaisUgj;
	}

	public TPersonaUgj getTPersonaUgj() {
		return this.TPersonaUgj;
	}

	public void setTPersonaUgj(TPersonaUgj TPersonaUgj) {
		this.TPersonaUgj = TPersonaUgj;
	}

}