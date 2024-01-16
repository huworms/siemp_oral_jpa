package siemp.estadistica.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the t_proceso_judicial database table.
 * 
 */
@Entity
@Table(name="t_proceso_judicial")
@NamedQuery(name="TProcesoJudicial.findAll", query="SELECT t FROM TProcesoJudicial t")
public class TProcesoJudicial implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="cn_proceso_judicial_id")
	private String cnProcesoJudicialId;

	@Column(name="cb_cumplimiento_orden_tipo")
	private byte cbCumplimientoOrdenTipo;

	@Column(name="cb_otorgamiento_orden_tipo")
	private byte cbOtorgamientoOrdenTipo;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="cd_fecha_notificacion_mp")
	private Date cdFechaNotificacionMp;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="cd_fecha_otorgamiento")
	private Date cdFechaOtorgamiento;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="cd_fecha_preescripcion")
	private Date cdFechaPreescripcion;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="cd_fecha_solicitud")
	private Date cdFechaSolicitud;

	//bi-directional many-to-one association to CEtapaMandamientoJudicial
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="cn_etapa_mandamiento_judicial_id")
	private CEtapaMandamientoJudicial CEtapaMandamientoJudicial;

	//bi-directional many-to-one association to CTipoOrdenJudicial
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="cn_tipo_orden_judicial_id")
	private CTipoOrdenJudicial CTipoOrdenJudicial;

	//bi-directional many-to-one association to TPersonaUgj
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="cn_persona_id")
	private TPersonaUgj TPersonaUgj;

	public TProcesoJudicial() {
	}

	public String getCnProcesoJudicialId() {
		return this.cnProcesoJudicialId;
	}

	public void setCnProcesoJudicialId(String cnProcesoJudicialId) {
		this.cnProcesoJudicialId = cnProcesoJudicialId;
	}

	public byte getCbCumplimientoOrdenTipo() {
		return this.cbCumplimientoOrdenTipo;
	}

	public void setCbCumplimientoOrdenTipo(byte cbCumplimientoOrdenTipo) {
		this.cbCumplimientoOrdenTipo = cbCumplimientoOrdenTipo;
	}

	public byte getCbOtorgamientoOrdenTipo() {
		return this.cbOtorgamientoOrdenTipo;
	}

	public void setCbOtorgamientoOrdenTipo(byte cbOtorgamientoOrdenTipo) {
		this.cbOtorgamientoOrdenTipo = cbOtorgamientoOrdenTipo;
	}

	public Date getCdFechaNotificacionMp() {
		return this.cdFechaNotificacionMp;
	}

	public void setCdFechaNotificacionMp(Date cdFechaNotificacionMp) {
		this.cdFechaNotificacionMp = cdFechaNotificacionMp;
	}

	public Date getCdFechaOtorgamiento() {
		return this.cdFechaOtorgamiento;
	}

	public void setCdFechaOtorgamiento(Date cdFechaOtorgamiento) {
		this.cdFechaOtorgamiento = cdFechaOtorgamiento;
	}

	public Date getCdFechaPreescripcion() {
		return this.cdFechaPreescripcion;
	}

	public void setCdFechaPreescripcion(Date cdFechaPreescripcion) {
		this.cdFechaPreescripcion = cdFechaPreescripcion;
	}

	public Date getCdFechaSolicitud() {
		return this.cdFechaSolicitud;
	}

	public void setCdFechaSolicitud(Date cdFechaSolicitud) {
		this.cdFechaSolicitud = cdFechaSolicitud;
	}

	public CEtapaMandamientoJudicial getCEtapaMandamientoJudicial() {
		return this.CEtapaMandamientoJudicial;
	}

	public void setCEtapaMandamientoJudicial(CEtapaMandamientoJudicial CEtapaMandamientoJudicial) {
		this.CEtapaMandamientoJudicial = CEtapaMandamientoJudicial;
	}

	public CTipoOrdenJudicial getCTipoOrdenJudicial() {
		return this.CTipoOrdenJudicial;
	}

	public void setCTipoOrdenJudicial(CTipoOrdenJudicial CTipoOrdenJudicial) {
		this.CTipoOrdenJudicial = CTipoOrdenJudicial;
	}

	public TPersonaUgj getTPersonaUgj() {
		return this.TPersonaUgj;
	}

	public void setTPersonaUgj(TPersonaUgj TPersonaUgj) {
		this.TPersonaUgj = TPersonaUgj;
	}

}