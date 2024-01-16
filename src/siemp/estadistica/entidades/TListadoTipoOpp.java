package siemp.estadistica.entidades;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_listado_tipo_opp database table.
 * 
 */
@Entity
@Table(name="t_listado_tipo_opp")
@NamedQuery(name="TListadoTipoOpp.findAll", query="SELECT t FROM TListadoTipoOpp t")
public class TListadoTipoOpp implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="cn_listado_tipo_opp_id")
	private String cnListadoTipoOppId;

	@Column(name="cb_activo")
	private byte cbActivo;

	@Column(name="cb_so")
	private byte cbSo;

	//bi-directional many-to-one association to CTipoOpp
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="cn_tipo_opp")
	private CTipoOpp CTipoOpp;

	//bi-directional many-to-one association to TPersonaUgj
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="cn_persona_id")
	private TPersonaUgj TPersonaUgj;

	public TListadoTipoOpp() {
	}

	public String getCnListadoTipoOppId() {
		return this.cnListadoTipoOppId;
	}

	public void setCnListadoTipoOppId(String cnListadoTipoOppId) {
		this.cnListadoTipoOppId = cnListadoTipoOppId;
	}

	public byte getCbActivo() {
		return this.cbActivo;
	}

	public void setCbActivo(byte cbActivo) {
		this.cbActivo = cbActivo;
	}

	public byte getCbSo() {
		return this.cbSo;
	}

	public void setCbSo(byte cbSo) {
		this.cbSo = cbSo;
	}

	public CTipoOpp getCTipoOpp() {
		return this.CTipoOpp;
	}

	public void setCTipoOpp(CTipoOpp CTipoOpp) {
		this.CTipoOpp = CTipoOpp;
	}

	public TPersonaUgj getTPersonaUgj() {
		return this.TPersonaUgj;
	}

	public void setTPersonaUgj(TPersonaUgj TPersonaUgj) {
		this.TPersonaUgj = TPersonaUgj;
	}

}