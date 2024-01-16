package siemp.estadistica.entidades;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_tecnica_investigacion database table.
 * 
 */
@Entity
@Table(name="t_tecnica_investigacion")
@NamedQuery(name="TTecnicaInvestigacion.findAll", query="SELECT t FROM TTecnicaInvestigacion t")
public class TTecnicaInvestigacion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_tsjdf")
	private Long idTsjdf;

	@Column(name="otra_tecnica")
	private String otraTecnica;

	//bi-directional many-to-one association to CTecnicaInvestigacion
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_tecnica")
	private CTecnicaInvestigacion CTecnicaInvestigacion;

	public TTecnicaInvestigacion() {
	}

	public Long getIdTsjdf() {
		return this.idTsjdf;
	}

	public void setIdTsjdf(Long idTsjdf) {
		this.idTsjdf = idTsjdf;
	}

	public String getOtraTecnica() {
		return this.otraTecnica;
	}

	public void setOtraTecnica(String otraTecnica) {
		this.otraTecnica = otraTecnica;
	}

	public CTecnicaInvestigacion getCTecnicaInvestigacion() {
		return this.CTecnicaInvestigacion;
	}

	public void setCTecnicaInvestigacion(CTecnicaInvestigacion CTecnicaInvestigacion) {
		this.CTecnicaInvestigacion = CTecnicaInvestigacion;
	}

}