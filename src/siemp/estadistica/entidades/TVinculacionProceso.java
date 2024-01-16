package siemp.estadistica.entidades;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_vinculacion_proceso database table.
 * 
 */
@Entity
@Table(name="t_vinculacion_proceso")
@NamedQuery(name="TVinculacionProceso.findAll", query="SELECT t FROM TVinculacionProceso t")
public class TVinculacionProceso implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_delito")
	private String idDelito;

	@Column(name="vinculacion_proceso")
	private String vinculacionProceso;

	//bi-directional many-to-one association to TActoProcesal
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_acto_procesal")
	private TActoProcesal TActoProcesal;

	public TVinculacionProceso() {
	}

	public String getIdDelito() {
		return this.idDelito;
	}

	public void setIdDelito(String idDelito) {
		this.idDelito = idDelito;
	}

	public String getVinculacionProceso() {
		return this.vinculacionProceso;
	}

	public void setVinculacionProceso(String vinculacionProceso) {
		this.vinculacionProceso = vinculacionProceso;
	}

	public TActoProcesal getTActoProcesal() {
		return this.TActoProcesal;
	}

	public void setTActoProcesal(TActoProcesal TActoProcesal) {
		this.TActoProcesal = TActoProcesal;
	}

}