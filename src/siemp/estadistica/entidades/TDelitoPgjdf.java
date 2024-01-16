package siemp.estadistica.entidades;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_delito_pgjdf database table.
 * 
 */
@Entity
@Table(name="t_delito_pgjdf")
@NamedQuery(name="TDelitoPgjdf.findAll", query="SELECT t FROM TDelitoPgjdf t")
public class TDelitoPgjdf implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_delito_pgjdf")
	private String idDelitoPgjdf;

	@Lob
	private String delito;

	private String modalidad;

	//bi-directional many-to-one association to TInvestigacionPgjdf
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_ci_investigacion")
	private TInvestigacionPgjdf TInvestigacionPgjdf;

	public TDelitoPgjdf() {
	}

	public String getIdDelitoPgjdf() {
		return this.idDelitoPgjdf;
	}

	public void setIdDelitoPgjdf(String idDelitoPgjdf) {
		this.idDelitoPgjdf = idDelitoPgjdf;
	}

	public String getDelito() {
		return this.delito;
	}

	public void setDelito(String delito) {
		this.delito = delito;
	}

	public String getModalidad() {
		return this.modalidad;
	}

	public void setModalidad(String modalidad) {
		this.modalidad = modalidad;
	}

	public TInvestigacionPgjdf getTInvestigacionPgjdf() {
		return this.TInvestigacionPgjdf;
	}

	public void setTInvestigacionPgjdf(TInvestigacionPgjdf TInvestigacionPgjdf) {
		this.TInvestigacionPgjdf = TInvestigacionPgjdf;
	}

}