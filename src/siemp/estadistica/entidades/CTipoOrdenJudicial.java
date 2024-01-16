package siemp.estadistica.entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the c_tipo_orden_judicial database table.
 * 
 */
@Entity
@Table(name="c_tipo_orden_judicial")
@NamedQuery(name="CTipoOrdenJudicial.findAll", query="SELECT c FROM CTipoOrdenJudicial c")
public class CTipoOrdenJudicial implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="cn_tipo_orden_judicial_id")
	private String cnTipoOrdenJudicialId;

	@Column(name="cs_tipo_orden_judicial")
	private String csTipoOrdenJudicial;

	//bi-directional many-to-one association to TProcesoJudicial
	@OneToMany(mappedBy="CTipoOrdenJudicial")
	private List<TProcesoJudicial> TProcesoJudicials;

	public CTipoOrdenJudicial() {
	}

	public String getCnTipoOrdenJudicialId() {
		return this.cnTipoOrdenJudicialId;
	}

	public void setCnTipoOrdenJudicialId(String cnTipoOrdenJudicialId) {
		this.cnTipoOrdenJudicialId = cnTipoOrdenJudicialId;
	}

	public String getCsTipoOrdenJudicial() {
		return this.csTipoOrdenJudicial;
	}

	public void setCsTipoOrdenJudicial(String csTipoOrdenJudicial) {
		this.csTipoOrdenJudicial = csTipoOrdenJudicial;
	}

	public List<TProcesoJudicial> getTProcesoJudicials() {
		return this.TProcesoJudicials;
	}

	public void setTProcesoJudicials(List<TProcesoJudicial> TProcesoJudicials) {
		this.TProcesoJudicials = TProcesoJudicials;
	}

	public TProcesoJudicial addTProcesoJudicial(TProcesoJudicial TProcesoJudicial) {
		getTProcesoJudicials().add(TProcesoJudicial);
		TProcesoJudicial.setCTipoOrdenJudicial(this);

		return TProcesoJudicial;
	}

	public TProcesoJudicial removeTProcesoJudicial(TProcesoJudicial TProcesoJudicial) {
		getTProcesoJudicials().remove(TProcesoJudicial);
		TProcesoJudicial.setCTipoOrdenJudicial(null);

		return TProcesoJudicial;
	}

}