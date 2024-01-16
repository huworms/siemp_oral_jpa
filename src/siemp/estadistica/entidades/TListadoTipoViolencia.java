package siemp.estadistica.entidades;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_listado_tipo_violencia database table.
 * 
 */
@Entity
@Table(name="t_listado_tipo_violencia")
@NamedQuery(name="TListadoTipoViolencia.findAll", query="SELECT t FROM TListadoTipoViolencia t")
public class TListadoTipoViolencia implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="cn_listado_tipo_violencia_id")
	private String cnListadoTipoViolenciaId;

	@Column(name="cb_activo")
	private byte cbActivo;

	//bi-directional many-to-one association to CTipoViolencia
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="cn_tipo_violencia")
	private CTipoViolencia CTipoViolencia;

	//bi-directional many-to-one association to TPersonaUgj
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="cn_persona_id")
	private TPersonaUgj TPersonaUgj;

	public TListadoTipoViolencia() {
	}

	public String getCnListadoTipoViolenciaId() {
		return this.cnListadoTipoViolenciaId;
	}

	public void setCnListadoTipoViolenciaId(String cnListadoTipoViolenciaId) {
		this.cnListadoTipoViolenciaId = cnListadoTipoViolenciaId;
	}

	public byte getCbActivo() {
		return this.cbActivo;
	}

	public void setCbActivo(byte cbActivo) {
		this.cbActivo = cbActivo;
	}

	public CTipoViolencia getCTipoViolencia() {
		return this.CTipoViolencia;
	}

	public void setCTipoViolencia(CTipoViolencia CTipoViolencia) {
		this.CTipoViolencia = CTipoViolencia;
	}

	public TPersonaUgj getTPersonaUgj() {
		return this.TPersonaUgj;
	}

	public void setTPersonaUgj(TPersonaUgj TPersonaUgj) {
		this.TPersonaUgj = TPersonaUgj;
	}

}