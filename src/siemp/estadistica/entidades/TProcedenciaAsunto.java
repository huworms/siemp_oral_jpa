package siemp.estadistica.entidades;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_procedencia_asunto database table.
 * 
 */
@Entity
@Table(name="t_procedencia_asunto")
@NamedQuery(name="TProcedenciaAsunto.findAll", query="SELECT t FROM TProcedenciaAsunto t")
public class TProcedenciaAsunto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_evento")
	private Long idEvento;

	@Column(name="procede_accion")
	private String procedeAccion;

	@Column(name="procede_impugnacion")
	private String procedeImpugnacion;

	@Column(name="procede_tecnica_investigacion")
	private String procedeTecnicaInvestigacion;

	//bi-directional one-to-one association to TAudienciaImputado
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_evento")
	private TAudienciaImputado TAudienciaImputado;

	public TProcedenciaAsunto() {
	}

	public Long getIdEvento() {
		return this.idEvento;
	}

	public void setIdEvento(Long idEvento) {
		this.idEvento = idEvento;
	}

	public String getProcedeAccion() {
		return this.procedeAccion;
	}

	public void setProcedeAccion(String procedeAccion) {
		this.procedeAccion = procedeAccion;
	}

	public String getProcedeImpugnacion() {
		return this.procedeImpugnacion;
	}

	public void setProcedeImpugnacion(String procedeImpugnacion) {
		this.procedeImpugnacion = procedeImpugnacion;
	}

	public String getProcedeTecnicaInvestigacion() {
		return this.procedeTecnicaInvestigacion;
	}

	public void setProcedeTecnicaInvestigacion(String procedeTecnicaInvestigacion) {
		this.procedeTecnicaInvestigacion = procedeTecnicaInvestigacion;
	}

	public TAudienciaImputado getTAudienciaImputado() {
		return this.TAudienciaImputado;
	}

	public void setTAudienciaImputado(TAudienciaImputado TAudienciaImputado) {
		this.TAudienciaImputado = TAudienciaImputado;
	}

}