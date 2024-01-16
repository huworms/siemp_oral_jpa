package siemp.estadistica.entidades;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_emision_fallo database table.
 * 
 */
@Entity
@Table(name="t_emision_fallo")
@NamedQuery(name="TEmisionFallo.findAll", query="SELECT t FROM TEmisionFallo t")
public class TEmisionFallo implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TEmisionFalloPK id;

	@Column(name="fallo_sentencia")
	private String falloSentencia;

	@Column(name="forma_proceso")
	private String formaProceso;

	//bi-directional many-to-one association to TActoProcesal
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_acto_procesal", insertable=false, updatable=false)
	private TActoProcesal TActoProcesal;

	public TEmisionFallo() {
	}

	public TEmisionFalloPK getId() {
		return this.id;
	}

	public void setId(TEmisionFalloPK id) {
		this.id = id;
	}

	public String getFalloSentencia() {
		return this.falloSentencia;
	}

	public void setFalloSentencia(String falloSentencia) {
		this.falloSentencia = falloSentencia;
	}

	public String getFormaProceso() {
		return this.formaProceso;
	}

	public void setFormaProceso(String formaProceso) {
		this.formaProceso = formaProceso;
	}

	public TActoProcesal getTActoProcesal() {
		return this.TActoProcesal;
	}

	public void setTActoProcesal(TActoProcesal TActoProcesal) {
		this.TActoProcesal = TActoProcesal;
	}

}