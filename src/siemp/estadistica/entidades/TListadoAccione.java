package siemp.estadistica.entidades;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_listado_acciones database table.
 * 
 */
@Entity
@Table(name="t_listado_acciones")
@NamedQuery(name="TListadoAccione.findAll", query="SELECT t FROM TListadoAccione t")
public class TListadoAccione implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="cn_listado_acciones_id")
	private String cnListadoAccionesId;

	@Column(name="cb_activo")
	private byte cbActivo;

	//bi-directional many-to-one association to CAccionAntecedente
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="cn_accion_antecedente_id")
	private CAccionAntecedente CAccionAntecedente;

	//bi-directional many-to-one association to TPersonaUgj
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="cn_persona_id")
	private TPersonaUgj TPersonaUgj;

	public TListadoAccione() {
	}

	public String getCnListadoAccionesId() {
		return this.cnListadoAccionesId;
	}

	public void setCnListadoAccionesId(String cnListadoAccionesId) {
		this.cnListadoAccionesId = cnListadoAccionesId;
	}

	public byte getCbActivo() {
		return this.cbActivo;
	}

	public void setCbActivo(byte cbActivo) {
		this.cbActivo = cbActivo;
	}

	public CAccionAntecedente getCAccionAntecedente() {
		return this.CAccionAntecedente;
	}

	public void setCAccionAntecedente(CAccionAntecedente CAccionAntecedente) {
		this.CAccionAntecedente = CAccionAntecedente;
	}

	public TPersonaUgj getTPersonaUgj() {
		return this.TPersonaUgj;
	}

	public void setTPersonaUgj(TPersonaUgj TPersonaUgj) {
		this.TPersonaUgj = TPersonaUgj;
	}

}