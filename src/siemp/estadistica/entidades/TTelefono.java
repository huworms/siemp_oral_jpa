package siemp.estadistica.entidades;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_telefono database table.
 * 
 */
@Entity
@Table(name="t_telefono")
@NamedQuery(name="TTelefono.findAll", query="SELECT t FROM TTelefono t")
public class TTelefono implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="cn_telefono_id")
	private String cnTelefonoId;

	@Column(name="cb_activo")
	private byte cbActivo;

	@Column(name="cs_telefono")
	private String csTelefono;

	//bi-directional many-to-one association to CTipoTelefono
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="cn_tipo_telefono_id")
	private CTipoTelefono CTipoTelefono;

	//bi-directional many-to-one association to TPersonaUgj
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="cn_persona_id")
	private TPersonaUgj TPersonaUgj;

	public TTelefono() {
	}

	public String getCnTelefonoId() {
		return this.cnTelefonoId;
	}

	public void setCnTelefonoId(String cnTelefonoId) {
		this.cnTelefonoId = cnTelefonoId;
	}

	public byte getCbActivo() {
		return this.cbActivo;
	}

	public void setCbActivo(byte cbActivo) {
		this.cbActivo = cbActivo;
	}

	public String getCsTelefono() {
		return this.csTelefono;
	}

	public void setCsTelefono(String csTelefono) {
		this.csTelefono = csTelefono;
	}

	public CTipoTelefono getCTipoTelefono() {
		return this.CTipoTelefono;
	}

	public void setCTipoTelefono(CTipoTelefono CTipoTelefono) {
		this.CTipoTelefono = CTipoTelefono;
	}

	public TPersonaUgj getTPersonaUgj() {
		return this.TPersonaUgj;
	}

	public void setTPersonaUgj(TPersonaUgj TPersonaUgj) {
		this.TPersonaUgj = TPersonaUgj;
	}

}