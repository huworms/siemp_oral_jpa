package siemp.estadistica.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the t_apelacion_ugj database table.
 * 
 */
@Entity
@Table(name="t_apelacion_ugj")
@NamedQuery(name="TApelacionUgj.findAll", query="SELECT t FROM TApelacionUgj t")
public class TApelacionUgj implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="cn_apelacion_id")
	private String cnApelacionId;

	@Temporal(TemporalType.DATE)
	@Column(name="cd_fecha_envio_recurso")
	private Date cdFechaEnvioRecurso;

	@Temporal(TemporalType.DATE)
	@Column(name="cd_fecha_resolucion_recurso")
	private Date cdFechaResolucionRecurso;

	@Column(name="cs_tribunal_id")
	private String csTribunalId;

	//bi-directional many-to-one association to CEtapaSolicitudRecurso
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="cn_etapa_resolucion_recurso_id")
	private CEtapaSolicitudRecurso CEtapaSolicitudRecurso;

	//bi-directional many-to-one association to CResolucionRecurso
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="cn_resolucion_recurso_id")
	private CResolucionRecurso CResolucionRecurso;

	//bi-directional many-to-one association to CSolicitudRecurso
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="cn_solicitud_recurso_id")
	private CSolicitudRecurso CSolicitudRecurso;

	//bi-directional many-to-one association to CTipoResolucionApelable
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="cn_tipo_resolucion_apelable_id")
	private CTipoResolucionApelable CTipoResolucionApelable;

	//bi-directional many-to-one association to TPersonaUgj
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="cn_persona_id")
	private TPersonaUgj TPersonaUgj;

	public TApelacionUgj() {
	}

	public String getCnApelacionId() {
		return this.cnApelacionId;
	}

	public void setCnApelacionId(String cnApelacionId) {
		this.cnApelacionId = cnApelacionId;
	}

	public Date getCdFechaEnvioRecurso() {
		return this.cdFechaEnvioRecurso;
	}

	public void setCdFechaEnvioRecurso(Date cdFechaEnvioRecurso) {
		this.cdFechaEnvioRecurso = cdFechaEnvioRecurso;
	}

	public Date getCdFechaResolucionRecurso() {
		return this.cdFechaResolucionRecurso;
	}

	public void setCdFechaResolucionRecurso(Date cdFechaResolucionRecurso) {
		this.cdFechaResolucionRecurso = cdFechaResolucionRecurso;
	}

	public String getCsTribunalId() {
		return this.csTribunalId;
	}

	public void setCsTribunalId(String csTribunalId) {
		this.csTribunalId = csTribunalId;
	}

	public CEtapaSolicitudRecurso getCEtapaSolicitudRecurso() {
		return this.CEtapaSolicitudRecurso;
	}

	public void setCEtapaSolicitudRecurso(CEtapaSolicitudRecurso CEtapaSolicitudRecurso) {
		this.CEtapaSolicitudRecurso = CEtapaSolicitudRecurso;
	}

	public CResolucionRecurso getCResolucionRecurso() {
		return this.CResolucionRecurso;
	}

	public void setCResolucionRecurso(CResolucionRecurso CResolucionRecurso) {
		this.CResolucionRecurso = CResolucionRecurso;
	}

	public CSolicitudRecurso getCSolicitudRecurso() {
		return this.CSolicitudRecurso;
	}

	public void setCSolicitudRecurso(CSolicitudRecurso CSolicitudRecurso) {
		this.CSolicitudRecurso = CSolicitudRecurso;
	}

	public CTipoResolucionApelable getCTipoResolucionApelable() {
		return this.CTipoResolucionApelable;
	}

	public void setCTipoResolucionApelable(CTipoResolucionApelable CTipoResolucionApelable) {
		this.CTipoResolucionApelable = CTipoResolucionApelable;
	}

	public TPersonaUgj getTPersonaUgj() {
		return this.TPersonaUgj;
	}

	public void setTPersonaUgj(TPersonaUgj TPersonaUgj) {
		this.TPersonaUgj = TPersonaUgj;
	}

}