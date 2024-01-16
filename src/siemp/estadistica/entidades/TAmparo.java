package siemp.estadistica.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the t_amparo database table.
 * 
 */
@Entity
@Table(name="t_amparo")
@NamedQuery(name="TAmparo.findAll", query="SELECT t FROM TAmparo t")
public class TAmparo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="cn_amparo_id")
	private String cnAmparoId;

	@Column(name="cb_presenta_amparo")
	private byte cbPresentaAmparo;

	@Column(name="cb_tipo_amparo")
	private byte cbTipoAmparo;

	@Temporal(TemporalType.DATE)
	@Column(name="cd_fecha_resolucion")
	private Date cdFechaResolucion;

	@Temporal(TemporalType.DATE)
	@Column(name="cd_fecha_solicitud")
	private Date cdFechaSolicitud;

	//bi-directional many-to-one association to CEtapaSolicitudAmparo
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="cn_etapa_solicitud_amparo_id")
	private CEtapaSolicitudAmparo CEtapaSolicitudAmparo;

	//bi-directional many-to-one association to CTipoResolucionAmparo
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="cn_tipo_resolucion_amparo_id")
	private CTipoResolucionAmparo CTipoResolucionAmparo;

	//bi-directional many-to-one association to TPersonaUgj
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="cn_persona_id")
	private TPersonaUgj TPersonaUgj;

	public TAmparo() {
	}

	public String getCnAmparoId() {
		return this.cnAmparoId;
	}

	public void setCnAmparoId(String cnAmparoId) {
		this.cnAmparoId = cnAmparoId;
	}

	public byte getCbPresentaAmparo() {
		return this.cbPresentaAmparo;
	}

	public void setCbPresentaAmparo(byte cbPresentaAmparo) {
		this.cbPresentaAmparo = cbPresentaAmparo;
	}

	public byte getCbTipoAmparo() {
		return this.cbTipoAmparo;
	}

	public void setCbTipoAmparo(byte cbTipoAmparo) {
		this.cbTipoAmparo = cbTipoAmparo;
	}

	public Date getCdFechaResolucion() {
		return this.cdFechaResolucion;
	}

	public void setCdFechaResolucion(Date cdFechaResolucion) {
		this.cdFechaResolucion = cdFechaResolucion;
	}

	public Date getCdFechaSolicitud() {
		return this.cdFechaSolicitud;
	}

	public void setCdFechaSolicitud(Date cdFechaSolicitud) {
		this.cdFechaSolicitud = cdFechaSolicitud;
	}

	public CEtapaSolicitudAmparo getCEtapaSolicitudAmparo() {
		return this.CEtapaSolicitudAmparo;
	}

	public void setCEtapaSolicitudAmparo(CEtapaSolicitudAmparo CEtapaSolicitudAmparo) {
		this.CEtapaSolicitudAmparo = CEtapaSolicitudAmparo;
	}

	public CTipoResolucionAmparo getCTipoResolucionAmparo() {
		return this.CTipoResolucionAmparo;
	}

	public void setCTipoResolucionAmparo(CTipoResolucionAmparo CTipoResolucionAmparo) {
		this.CTipoResolucionAmparo = CTipoResolucionAmparo;
	}

	public TPersonaUgj getTPersonaUgj() {
		return this.TPersonaUgj;
	}

	public void setTPersonaUgj(TPersonaUgj TPersonaUgj) {
		this.TPersonaUgj = TPersonaUgj;
	}

}